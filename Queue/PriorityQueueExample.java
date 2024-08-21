package Queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue of integers
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Adding elements to the PriorityQueue
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(3);
        priorityQueue.add(2);
        priorityQueue.add(4);

        // Display the PriorityQueue
        System.out.println("PriorityQueue: " + priorityQueue);

        // Removing elements based on priority
        System.out.println("Removed element: " + priorityQueue.poll());
        System.out.println("PriorityQueue after removal: " + priorityQueue);

        // Peeking at the top element
        System.out.println("Top element: " + priorityQueue.peek());

        // Checking if the PriorityQueue is empty
        System.out.println("Is the PriorityQueue empty? " + priorityQueue.isEmpty());
    }
}
