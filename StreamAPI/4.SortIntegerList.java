// 4.Sort All Values in a List of Integers Using Stream Functions

import java.util.*;
import java.util.stream.*;

public class SortIntegerList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 8, 1, 6, 0, 4);

        List<Integer> sortedNumbers=numbers.stream()
        .sorted()
        .collect(Collectors.toList());

        System.out.println("Sorted Numbers: " + sortedNumbers);
    }
}