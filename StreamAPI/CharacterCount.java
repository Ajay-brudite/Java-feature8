// 10.Print the Count of Each Character in a String

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class CharacterCount {
    public static void main(String[] args) {
        String input = "character";

        Map<Character,Long> charCount = input.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(charCount);
    }
}