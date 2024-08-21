package Java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // For Comparable interface implementation
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class ComparatorComparableExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        // Sorting using Comparable (natural order by age)
        Collections.sort(people, Comparator.comparingInt(p -> p.age));
        System.out.println("Sorted by age: " + people);

        // Sorting using Comparator (custom order by name)
        Collections.sort(people, Comparator.comparing(p -> p.name));
        System.out.println("Sorted by name: " + people);
    }
}
