import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet to store unique city names
        TreeSet<String> cities = new TreeSet<>();

        // Adding elements to the TreeSet
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("Houston");
        cities.add("Phoenix");

        // Attempting to add a duplicate city
        cities.add("Chicago"); // Duplicate entry

        // Displaying the elements in the TreeSet (sorted order)
        System.out.println("TreeSet of Cities: " + cities);

        // Checking the first and last elements
        String firstCity = cities.first();
        String lastCity = cities.last();
        System.out.println("First City: " + firstCity);
        System.out.println("Last City: " + lastCity);
    }
}
