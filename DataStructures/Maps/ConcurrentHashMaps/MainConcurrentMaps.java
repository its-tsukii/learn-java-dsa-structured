package DataStructures.Maps.ConcurrentHashMaps;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MainConcurrentMaps {
    public static void run() {
        System.out.println("=== ConcurrentHashMap Example ===");

        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        map.put("Apple", 10);
        map.put("Banana", 5);
        map.put("Orange", 7);

        System.out.println("Concurrent map content:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Demonstrate thread-safe access
        Runnable writer = () -> {
            map.put("Mango", 12);
            System.out.println("Writer thread added Mango");
        };

        Runnable reader = () -> {
            System.out.println("Reader thread read Apple: " + map.get("Apple"));
        };

        Thread t1 = new Thread(writer);
        Thread t2 = new Thread(reader);

        t1.start();
        t2.start();

        // Wait for threads to finish (just for demo clarity)
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();
    }
}
