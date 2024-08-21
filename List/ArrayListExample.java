package List;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Inserting an element at a specific index
        fruits.add(1, "Orange");

        // Removing an element by value
        fruits.remove("Banana");

        // Removing an element by index
        fruits.remove(0);

        // Displaying the elements in the ArrayList
        System.out.println("ArrayList Elements: " + fruits);

        // Accessing elements
        String firstFruit = fruits.get(0);
        System.out.println("First Fruit: " + firstFruit);
    }
}
