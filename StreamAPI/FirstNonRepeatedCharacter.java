// 2.Find the First Non-Repeated Character in a String Using Stream Functions

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {

        String input = "swiss";

        Character result = input.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
            .entrySet()
            .stream()
            .filter(entry -> entry.getValue() == 1)
            .map(Map.Entry::getKey)
            .findFirst()
            .orElse(null);

        System.out.println("First Non-Repeated Character: " + result);
    }
}