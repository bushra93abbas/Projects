package Generics;

import java.util.ArrayList;
import java.util.List;

public class Application {


    public static void main(String args[]) {
        Object myObject = new Object();
        String myVar = "hello";
        myObject = myVar;

        Employee emp = new Employee();
        Accountant acc = new Accountant();

        emp = acc;

        ArrayList<Employee> employees = new ArrayList<Employee>();
        ArrayList<Accountant> accountants = new ArrayList<Accountant>();
        accountants.add(new Accountant());
//        employees=accountants; This is not allowed .

        ArrayList<?> employees2 = new ArrayList<>();
        ArrayList<Accountant> accountants2 = new ArrayList<Accountant>();
        employees2 = accountants2;

//This is the upper bound. Can take Employee or Accounts as it extends Employee but cannot take Object .Because Object is not the superclass .
        ArrayList<? extends Employee> employees3 = new ArrayList<>();
        ArrayList<Accountant> accountants3 = new ArrayList<Accountant>();
        employees3 = accountants3;


        //This is the Lower bound.Accepts Employee and parents of Employee.
        ArrayList<? super Employee> employee4 = new ArrayList<>();
        ArrayList<Accountant> accounts3 = new ArrayList<Accountant>();
//        employee4=accountants3; This is not allowed
        ArrayList<Object> accountant4 = new ArrayList<>();
        employee4 = accountant4;


        makeEmployeeWork(accountants);


    }

    public static void makeEmployeeWork(List<? extends Employee> employees) {
        //can only loop over Employee , to loop over sub classes , use type casting .
        for (Employee emp : employees) {
            //work method should be a part of employee , @override should be present in Accountant because there can be 100
            // of calsses but this works for only those methods that are defined in Employee As that is set in the param .
            emp.work();
        }


//this will work for Accountant after type casting and also use the methods in Accountant class .
        for (Accountant emp : (ArrayList<Accountant>) employees) {
            emp.work();
        }
    }
}
