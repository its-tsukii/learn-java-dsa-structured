# 🗺️ Java Maps – HashMap, LinkedHashMap, TreeMap, ConcurrentHashMap

This project demonstrates the different types of **Map** implementations in Java's `java.util` package:

- `HashMap`
- `LinkedHashMap`
- `TreeMap`
- `ConcurrentHashMap`

Each has unique characteristics regarding **ordering**, **sorting**, and **thread-safety**, and is suited for different use cases.

---

## 📦 File: `Maps.java`

```java
package DataStructures.Maps;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Maps {
    public static void main(String[] args) {
        // HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 10);
        hashMap.put("Banana", 5);
        hashMap.put("Orange", 7);
        hashMap.put("Mango", 12);

        // LinkedHashMap
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Apple", 10);
        linkedHashMap.put("Banana", 5);
        linkedHashMap.put("Orange", 7);
        linkedHashMap.put("Mango", 12);

        // TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Apple", 10);
        treeMap.put("Banana", 5);
        treeMap.put("Orange", 7);
        treeMap.put("Mango", 12);

        // ConcurrentHashMap
        ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put("Apple", 10);
        concurrentMap.put("Banana", 5);
        concurrentMap.put("Orange", 7);
        concurrentMap.put("Mango", 12);
    }
}
```

🧵 Thread Safety: ConcurrentHashMap

The ConcurrentHashMap allows safe concurrent access without throwing ConcurrentModificationException. It's highly optimized for performance and doesn't block the entire map during reads/writes.

🔧 Example:
ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

Runnable writer = () -> map.put("Key", 123);
Runnable reader = () -> System.out.println(map.get("Key"));

new Thread(writer).start();
new Thread(reader).start();

🚫 Why Not Just Use HashMap for Everything?

While HashMap is powerful and fast, different structures exist because they solve different problems better:

LinkedHashMap maintains insertion order

TreeMap keeps sorted order

ConcurrentHashMap supports concurrency

Arrays, Lists, Stacks, Queues, Trees offer specialized behavior and performance advantages in various scenarios

Choosing the right data structure makes your code cleaner, faster, and easier to maintain.

✅ To Run

Make sure you have JDK installed and then run:
```java
javac DataStructures/Maps/Maps.java
java DataStructures.Maps.Maps
```

📚 Additional Resources

Oracle Java Docs – Map Interface

Java HashMap vs LinkedHashMap vs TreeMap

📌 Author

Created for learning and demonstration purposes.