package Java8features;

import java.util.Arrays;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        
        // Using a lambda function to print each name
        names.forEach(name -> System.out.println(name));
    }
}
