import java.util.Map.Entry;
import java.util.concurrent.*;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
        
        // Adding key-value pairs
        concurrentHashMap.put("Monday", 1);
        concurrentHashMap.put("Tuesday", 2);
        concurrentHashMap.put("Wednesday", 3);
        
        // Accessing value by key
        System.out.println("Value for key 'Tuesday': " + concurrentHashMap.get("Tuesday"));
        
        // Removing key-value pair
        concurrentHashMap.remove("Monday");
        
        // Iterating over entries (thread-safe)
        for(Entry<String, Integer> entry : concurrentHashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
