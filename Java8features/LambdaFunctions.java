package Java8features;

import java.util.Arrays;
import java.util.List;

public class LambdaFunctions {
    public static void main(String[] args) {
        // List of names
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Using a lambda expression to print each name
        System.out.println("Names:");
        names.forEach(name -> System.out.println(name));

        // Using a lambda expression to filter and print names starting with 'A'
        System.out.println("\nNames starting with 'A':");
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(name -> System.out.println(name));

        // Using a lambda expression to sort names by length
        System.out.println("\nNames sorted by length:");
        names.stream()
                .sorted((name1, name2) -> Integer.compare(name1.length(), name2.length()))
                .forEach(name -> System.out.println(name));
    }
}
