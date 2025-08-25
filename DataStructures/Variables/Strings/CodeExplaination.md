# Strings, StringBuffer, and StringBuilder in Java

This document explains and demonstrates the practical usage and differences between **String**, **StringBuffer**, and **StringBuilder** in Java, based on the `DataStructures.Variables.Strings` class.

---

## 1. String

### Description
- **String** is an immutable sequence of characters.
- Once created, the value cannot be changed.

### Key Methods and Usage

```java
String name = new String("aayush"); // or simply: String name = "aayush";
String lname = "kukade";

System.out.println(name);            // prints: aayush
System.out.println(name.charAt(3));  // prints: y
System.out.println(name.concat(lname)); // prints: aayushkukade

// Iterating over characters
for (int i = 0; i < name.length(); i++) {
    System.out.println(name.charAt(i));
}
```

---

## 2. StringBuffer

### Description
- **StringBuffer** is mutable, meaning its content can be changed after creation.
- Thread-safe: Multiple threads can use StringBuffer objects safely.
- Suitable for scenarios where multiple modifications are required.

### Key Methods and Usage

```java
StringBuffer name = new StringBuffer("aayush");
System.out.println(name);        // prints: aayush
name.append("null");             // appends "null": aayushnull
name.insert(3, "java");          // inserts "java" at index 3: aayjavaushnull
name.delete(4, 5);               // deletes character at index 4: aayjvaushnull
String res = name.substring(0, 3); // gets substring: aay

System.out.println(res);         // prints: aay
System.out.println(name.capacity()); // prints capacity (default 16 + str length)
System.out.println(name);        // prints modified StringBuffer

String str = name.toString();    // converts to String
System.out.println(str);
```

---

## 3. StringBuilder

### Description
- **StringBuilder** is also mutable.
- Not thread-safe (no synchronization), but faster than StringBuffer in single-threaded contexts.
- Recommended for performance when thread safety is not required.

### Key Methods and Usage

```java
StringBuilder name = new StringBuilder("aayush");
System.out.println(name);        // prints: aayush
name.append("null");             // appends "null": aayushnull
System.out.println(name);        // prints: aayushnull

String str = name.toString();    // converts to String
System.out.println(str);
```

---

## 4. Comparison Table

| Feature           | String         | StringBuffer     | StringBuilder     |
|-------------------|---------------|------------------|-------------------|
| Mutability        | Immutable     | Mutable          | Mutable           |
| Thread Safety     | Yes           | Yes              | No                |
| Performance       | Slowest       | Faster           | Fastest           |
| Use Case          | Constant data | Multi-threaded   | Single-threaded   |

---

## 5. Notes

- **Immutability** of String helps with security and caching but may cause performance issues if concatenated frequently.
- **StringBuffer** is preferable when thread safety is required during string modifications.
- **StringBuilder** is best for fast, single-threaded string manipulations.

---

## 6. Example Output

```
aayush
y
aayushkukade
a
a
y
u
s
h
aayush
aay
aay
22
aayjvaushnull
aayjvaushnull
aayush
aayushnull
aayushnull
```

---

## 7. References

- [Java String Documentation](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)
- [Java StringBuffer Documentation](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuffer.html)
- [Java StringBuilder Documentation](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html)
- [GeeksforGeeks: Differences between String, StringBuffer, and StringBuilder](https://www.geeksforgeeks.org/difference-between-string-stringbuffer-and-stringbuilder/)
