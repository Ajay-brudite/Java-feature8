// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Map.Entry;
import java.util.concurrent.*;
class HelloWorld {
    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer> concurrentHashMap=new ConcurrentHashMap<>();
        
        concurrentHashMap.put("Apple",1);
        concurrentHashMap.put("Banana",2);
        concurrentHashMap.put("PineApple",3);
        concurrentHashMap.put("Jerry",2);
        
        System.out.println(concurrentHashMap.get("PineApple"));
        System.out.println(concurrentHashMap.containsKey("Banana"));
        System.out.println(concurrentHashMap.containsKey("Graps"));
         // Using putIfAbsent to add an element only if it's not already present
         concurrentHashMap.putIfAbsent("Stoberry",5);
        // map.putIfAbsent("Four", 4);

        // Using compute to update a value atomically
        concurrentHashMap.compute("Banana",(key,value)-> value==null?0:value+10);
        // map.compute("Two", (key, value) -> value == null ? 0 : value + 10);

        // Iterating over the map
        concurrentHashMap.forEach((key,value) -> System.out.println(key + ": "+ value));
        // map.forEach((key, value) -> System.out.println(key + ": " + value));

        concurrentHashMap.put("Graps",2);
        System.out.println(concurrentHashMap.containsKey("Graps"));
        
        concurrentHashMap.remove("Banana");
        
        for(Entry<String,Integer> entry:concurrentHashMap.entrySet()){
            System.out.println("Key : "+entry.getKey()+"--> value: "+entry.getValue());
        }
    }
}