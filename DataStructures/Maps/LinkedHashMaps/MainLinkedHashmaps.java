package DataStructures.Maps.LinkedHashMaps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MainLinkedHashmaps {
    public static void run() {
        System.out.println("=== LinkedHashMap Example ===");

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        map.put("Apple", 10);
        map.put("Banana", 5);
        map.put("Orange", 7);

        System.out.println("Maintains insertion order:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Access order is only enabled when using a special constructor
        System.out.println("Get Banana: " + map.get("Banana"));
        System.out.println();
    }
}
