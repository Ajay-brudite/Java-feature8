import java.util.*;

public class HashtableExample {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        
        // Adding key-value pairs
        hashtable.put("A", 100);
        hashtable.put("B", 200);
        hashtable.put("C", 300);
        
        // Accessing value by key
        System.out.println("Value for key 'B': " + hashtable.get("B"));
        
        // Removing key-value pair
        hashtable.remove("A");
        
        // Iterating over entries (thread-safe)
        for(Map.Entry<String, Integer> entry : hashtable.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
