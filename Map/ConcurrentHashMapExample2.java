import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        // Create a ConcurrentHashMap
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Add some initial values
        map.put("Apple", 1);
        map.put("Banana", 2);

        // Start a thread that increments the count of "Apple"
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map.put("Apple", map.get("Apple") + 1);
            }
        });

        // Start another thread that increments the count of "Banana"
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map.put("Banana", map.get("Banana") + 1);
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final values
        System.out.println("Final count for Apple: " + map.get("Apple"));
        System.out.println("Final count for Banana: " + map.get("Banana"));
    }
}
