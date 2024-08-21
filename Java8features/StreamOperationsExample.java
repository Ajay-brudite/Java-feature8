package Java8features;

import java.util.Arrays;
import java.util.List;

public class StreamOperationsExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Using filter to get even numbers, map to square them, and reduce to sum them
        int sumOfSquares = numbers.stream()
            .filter(n -> n % 2 == 0) // Filter even numbers
            .map(n -> n * n) // Square each number
            .reduce(0,(c,e) -> c+e); // Sum the squares

        System.out.println(sumOfSquares); // Print the result
    }
}
