import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> fruitColorMap = new LinkedHashMap<>();
        
        // Add fruits and their colors
        fruitColorMap.put("Apple", 1);
        fruitColorMap.put("Banana", 3);
        fruitColorMap.put("Orange", 5);
        fruitColorMap.put("Grapes", 2);

        System.out.println("Value for key 'Orange'"+ fruitColorMap.get("Orange"));

        // Iterating through the LinkedHashMap will preserve the insertion order
        for(Map.Entry<String,Integer> entry : fruitColorMap.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}