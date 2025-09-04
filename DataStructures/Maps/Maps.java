package DataStructures.Maps;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Maps {
    public static void main(String[] args) {
        // HashMaps
        System.out.println("=== HashMap ===");
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 10);
        hashMap.put("Banana", 5);
        hashMap.put("Orange", 7);
        hashMap.put("Mango", 12);
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        // LinkedHashMap
        System.out.println("\n=== LinkedHashMap (Maintains insertion order) ===");
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Apple", 10);
        linkedHashMap.put("Banana", 5);
        linkedHashMap.put("Orange", 7);
        linkedHashMap.put("Mango", 12);

        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // TreeMap
        System.out.println("\n=== TreeMap (Sorted by key) ===");
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Apple", 10);
        treeMap.put("Banana", 5);
        treeMap.put("Orange", 7);
        treeMap.put("Mango", 12);

        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // ConcurrentHashMap
        System.out.println("\n=== ConcurrentHashMap (Thread-safe map) ===");
        ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put("Apple", 10);
        concurrentMap.put("Banana", 5);
        concurrentMap.put("Orange", 7);
        concurrentMap.put("Mango", 12);

        for (Map.Entry<String, Integer> entry : concurrentMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Demonstrating safe concurrent access (simple example)
        Runnable writer = () -> {
            concurrentMap.put("Pineapple", 15);
            System.out.println("Writer thread added Pineapple");
        };

        Runnable reader = () -> {
            System.out.println("Reader thread sees: " + concurrentMap.get("Apple"));
        };

        Thread t1 = new Thread(writer);
        Thread t2 = new Thread(reader);

        t1.start();
        t2.start();
    }
}

/*
 * we have maps in java unlike python they are of several types such as
 * hashmaps : This takes in the values in an unordered unsorted pattern
 * linkedhashmap : This takes in the values in an ordered unsorted pattern
 * treemaps : This takes in the values in an sorted pattern
 * concurrenthashmaps : These takes in values with regards to concurrency that
 * is these do not throw invalidModificationException
 * all of these have a o(1) read and write ability and o(n) space
 * but hashmaps are so good then why do we even still arrays ? linkedlists ? or
 * even stacks and queues ? or bst or binary trees or avl or segment trees ? i
 * understand some structures are just better suited for some situations but
 * still why not just use hashmaps for everything ?
 */

/*
 * Use HashMap for fast, general-purpose key-value storage (no order guarantee).
 * 
 * Use LinkedHashMap when order of insertion matters (e.g., caching).
 * 
 * Use TreeMap when sorted order by key is required (e.g., range queries).
 * 
 * Use ConcurrentHashMap in multi-threaded environments where thread safety is
 * needed without full locking (more efficient than synchronizing a HashMap).
 */