import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Create a LinkedHashSet to store unique pet names
        LinkedHashSet<String> petNames = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        petNames.add("Bella");
        petNames.add("Charlie");
        petNames.add("Max");
        petNames.add("Daisy");

        // Adding a duplicate pet name
        petNames.add("Charlie"); // Duplicate entry

        // Displaying the elements in the LinkedHashSet (insertion order)
        System.out.println("LinkedHashSet of Pet Names: " + petNames);

        // Checking the size of the LinkedHashSet
        int size = petNames.size();
        System.out.println("Total Unique Pet Names: " + size);
    }
}
