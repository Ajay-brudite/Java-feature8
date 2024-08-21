package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");

        // Display the queue
        System.out.println("Queue: " + queue);

        // Removing the head of the queue
        String removed = queue.remove();
        System.out.println("Removed: " + removed);
        
        // Display the queue after removal
        System.out.println("Queue after removal: " + queue);

        // Peeking at the head of the queue
        String head = queue.peek();
        System.out.println("Head of the queue: " + head);
        
        // Checking if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);
    }
}
