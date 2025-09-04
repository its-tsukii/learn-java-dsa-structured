package DataStructures.Maps.HashMaps;

import java.util.HashMap;
import java.util.Map;

public class MainHashmaps {
    public static void run() {
        System.out.println("=== HashMap Example ===");

        HashMap<String, Integer> map = new HashMap<>();

        // Add elements using put()
        map.put("Apple", 10);
        map.put("Banana", 5);
        map.put("Orange", 7);

        // Get element using get()
        System.out.println("Get Apple: " + map.get("Apple"));

        // Check if key exists
        System.out.println("Contains 'Banana'? " + map.containsKey("Banana"));

        // Check if value exists
        System.out.println("Contains value 7? " + map.containsValue(7));

        // Remove an entry
        map.remove("Orange");

        // Size of map
        System.out.println("Size: " + map.size());

        // Iterate over entries
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Clear the map
        map.clear();
        System.out.println("Is map empty? " + map.isEmpty());
        System.out.println();
    }
}
