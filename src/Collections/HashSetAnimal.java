package Collections;

import java.util.HashSet;
import java.util.Objects;

public class HashSetAnimal {

    String name ;
    int age ;

    @Override
    public String toString() {
        return "Collections.HashSetAnimal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public HashSetAnimal(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public  static  void main(String args[])
    {
        HashSet<HashSetAnimal> animals = new HashSet();

        HashSetAnimal animal1 = new HashSetAnimal("Dog", 7);
        HashSetAnimal animal2 = new HashSetAnimal("Elephant", 10);
        HashSetAnimal animal3 = new HashSetAnimal("Dog", 7);

        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);

        for(HashSetAnimal animal: animals)
        {
            System.out.println(animal);
        }

       System.out.println(animal1.equals(animal3));

        System.out.println(animal1.hashCode());
        System.out.println(animal3.hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashSetAnimal animal = (HashSetAnimal) o;
        return age == animal.age &&
                Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
