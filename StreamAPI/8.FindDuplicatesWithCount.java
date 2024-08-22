// 8.Find Only Duplicate Elements with Their Count from the String ArrayList in Java 8

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class FindDuplicatesWithCount {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "Banana", "Apple", "Orange", "Banana", "Apple","PineApple");

        Map<String, Long> duplicates = words.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet()
            .stream()
            .filter(entry -> entry.getValue() > 1)
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(duplicates);
    }

    @Override
    public String toString() {
        return "FindDuplicatesWithCount []";
    }
}