//1.Create a Dummy List, Map, and Set for Stream

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class DummyCollections {
    public static void main(String[] args) {
        // Dummy List
        List<String> list = Arrays.asList("Apple","Banana","Orange","Apple","Grapes");

        // Dummy Map

        Map<Integer,String> map=new HashMap<>();
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");

        // Dummy Set
        Set<String> set = new HashSet<>(Arrays.asList("Dog","Cat","Horse","Dog"));

        // Stream operations
        System.out.println("List:");
        list.stream().forEach(n->System.out.println(n));

        System.out.println("\nMap:");
        map.entrySet().stream().forEach(n->System.out.println(n));

        System.out.println("\nSet:");
        set.stream().forEach(n->System.out.println(n));

    }
}