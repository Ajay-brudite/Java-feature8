import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap to store names and ages
        HashMap<String, Integer> ageMap = new HashMap<>();

        // Add key-value pairs
        ageMap.put("Ajay", 23);
        ageMap.put("Arjun", 25);
        ageMap.put("Krishan", 29);
        ageMap.put("Varun",33);
        // Access a value
        int aliceAge = ageMap.get("Arjun");
        System.out.println("Arjun's age: " + aliceAge);

        // Check if a key exists
        boolean containsBob = ageMap.containsKey("Krishna");
        System.out.println("Does the map contain Krishna? " + containsBob);

        // Remove a key-value pair
        ageMap.remove("Varun");

        // Iterate through the HashMap
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}