package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Employee implements  Comparable<Employee>{

    String name ;
    int salary;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    String department ;


    public Employee(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public int compareTo(Employee employee)
    {
        if(this.salary < employee.salary)
            return -1;
        else if (this.salary >employee.salary)
            return 1;
  else return 0;
    }

    public static void main(String[] args)
    {
        HashSet<Employee> set = new HashSet<>();

        Employee employee1 = new Employee("Emma",27,"Eng");
        Employee employee2 = new Employee("Yash",41,"Eng");
        Employee employee3 = new Employee("Bush",9,"Eng");

        set.add(employee1);
        set.add(employee2);
        set.add(employee3);

        ArrayList<Employee> list = new ArrayList<Employee>(set);
        Collections.sort(list);

System.out.println(list);

    }
}
