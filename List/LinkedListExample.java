package List;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList of integers
        LinkedList<Integer> numbers = new LinkedList<>();

        // Adding elements to the LinkedList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Adding an element at the first position
        numbers.addFirst(5);

        // Adding an element at the last position
        numbers.addLast(40);

        // Removing the first element
        numbers.removeFirst();

        // Removing the last element
        numbers.removeLast();

        // Displaying the elements in the LinkedList
        System.out.println("LinkedList Elements: " + numbers);

        // Accessing elements
        int firstElement = numbers.getFirst();
        int lastElement = numbers.getLast();

        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);
    }
}
