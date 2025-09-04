package DataStructures.Maps.TreeMaps;

import java.util.Map;
import java.util.TreeMap;

public class MainTreesMaps {
    public static void run() {
        System.out.println("=== TreeMap Example ===");

        TreeMap<String, Integer> map = new TreeMap<>();

        map.put("Banana", 5);
        map.put("Apple", 10);
        map.put("Orange", 7);

        System.out.println("Sorted by keys:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        System.out.println("First key: " + map.firstKey());
        System.out.println("Last key: " + map.lastKey());

        // SubMap
        System.out.println("HeadMap (< Orange): " + map.headMap("Orange"));
        System.out.println("TailMap (>= Orange): " + map.tailMap("Orange"));
        System.out.println();
    }
}
