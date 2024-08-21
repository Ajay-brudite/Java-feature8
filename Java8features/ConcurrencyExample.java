package Java8features;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
    private final String name;

    Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " is running on thread " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000); // Simulate task execution
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " has completed execution.");
    }
}

public class ConcurrencyExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2); // Create a thread pool

        // Submit tasks for execution
        executor.submit(new Task("Task 1"));
        executor.submit(new Task("Task 2"));
        executor.submit(new Task("Task 3"));

        executor.shutdown(); // Initiates an orderly shutdown
    }
}
