package Java8features;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionApiExample {
    public static void main(String[] args) {
        // Using ArrayList to store a list of names
        List<String> namesList = new ArrayList<>();
        namesList.add("Alice");
        namesList.add("Bob");
        namesList.add("Charlie");
        
        // Using HashSet to store unique names
        Set<String> namesSet = new HashSet<>(namesList);
        namesSet.add("Alice"); // Duplicate will not be added

        // Print the contents of the list and set
        System.out.println("List of names: " + namesList);
        System.out.println("Unique names: " + namesSet);
    }
}
