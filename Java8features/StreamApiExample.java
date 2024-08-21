package Java8features;

import java.util.Arrays;
import java.util.List;

public class StreamApiExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Using Stream API to filter and print even numbers
        numbers.stream()
               .filter(n -> n % 2 == 0) // filter even numbers
               .forEach(n -> System.out.println(n)); // print each even number
    }
}
