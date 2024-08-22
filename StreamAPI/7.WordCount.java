// 7.Count Each Element/Word from the String ArrayList in Java 8

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class WordCount {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "Banana", "Apple", "Orange", "Banana","Pineapple");

        Map<String,Long> wordCount = words.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(wordCount);
    }
}