import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet to store unique book titles
        HashSet<String> bookTitles = new HashSet<>();

        // Adding elements to the HashSet
        bookTitles.add("The Great Gatsby");
        bookTitles.add("To Kill a Mockingbird");
        bookTitles.add("1984");
        bookTitles.add("The Catcher in the Rye");

        // Attempting to add a duplicate title
        bookTitles.add("1984"); // Duplicate entry

        // Displaying the elements in the HashSet
        System.out.println("HashSet of Book Titles: " + bookTitles);

        // Checking if a title exists in the HashSet
        boolean hasGatsby = bookTitles.contains("The Great Gatsby");
        System.out.println("Contains 'The Great Gatsby': " + hasGatsby);
    }
}
