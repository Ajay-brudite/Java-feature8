import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Adding key-value pairs
        treeMap.put("Apple", 50);
        treeMap.put("Banana", 20);
        treeMap.put("Orange", 30);

        // Accessing value by key
        System.out.println("Value for key 'Banana': " + treeMap.get("Banana"));

        // Removing key-value pair
        treeMap.remove("Apple");

        // Iterating over entries (sorted by keys)
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
