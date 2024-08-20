// 6.Convert a List of Objects into a Map with Sorted Keys

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class ListToMapWithSortedKeys {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Apple","Banana","Orange","Apple","Pineapple");
        
        Map<String, Long> result = list.stream()
            .collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));
            
        System.out.println(result);
    }
}