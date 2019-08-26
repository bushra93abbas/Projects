package Generics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GenericContainer<i1,i2> {

    i1 item1;

    public i1 getItem1() {
        return item1;
    }

    public void setItem1(i1 item1) {
        this.item1 = item1;
    }

    public i2 getItem2() {
        return item2;
    }

    public void setItem2(i2 item2) {
        this.item2 = item2;
    }

    i2 item2;

    public GenericContainer(i1 item1, i2 item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public static void main(String args[])
    {
        //Generics for classes
        GenericContainer<Integer,String> genericContainer = new GenericContainer<>(12,"Hello");

        GenericContainer<Double,String> genericContainer2 = new GenericContainer<>(12.0,"Hello");

        int val1= genericContainer.getItem1();
        String val2 = genericContainer.getItem2();

        Set<String> mySet1 = new HashSet<String>();
        mySet1.add("first");
        mySet1.add("second");
        mySet1.add("third");

        Set<String> mySet2 = new HashSet<String>();
        mySet1.add("first");
        mySet1.add("second");
        mySet1.add("computer");

       Set<String> resultSet = union(mySet1,mySet2);

        Iterator<String> itr = resultSet.iterator();
        while(itr.hasNext())
        {
           String s = itr.next();
           System.out.println(s);
        }
    }


    //Generics for methods
    public static <E,O,V,Regular >Set<E> union(Set<E> set1 , Set<E> set2)
    {
        Set<E> result = new HashSet<E>(set1);
        result.addAll(set2);
        return result ;

    }

}
