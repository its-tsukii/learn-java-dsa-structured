# Arrays in Java

Arrays are one of the fundamental data structures in Java. An array is a collection of elements, all of the same type, stored in a contiguous block of memory. Arrays provide fast access to elements via an index, making them suitable for a variety of programming tasks.

## Declaration and Initialization

```java
// Declaration
int[] numbers;

// Initialization
numbers = new int[5]; // array of size 5, default values 0

// Declaration and initialization together
int[] primes = {2, 3, 5, 7, 11};

// Accessing elements
System.out.println(primes[2]); // Output: 5

// Updating elements
primes[2] = 13;
```

## Key Properties

- **Fixed Size:** Once created, the length of an array cannot be changed.
- **Zero-based Indexing:** The first element is at index 0.
- **Homogeneous Elements:** All elements must be of the same data type.
- **Random Access:** Accessing any element by index is O(1) time.

## Common Operations

| Operation                   | Time Complexity |
|-----------------------------|----------------|
| Access (by index)           | O(1)           |
| Update (by index)           | O(1)           |
| Search (unsorted)           | O(n)           |
| Insert/Delete (fixed size)  | O(n)           |

## Iterating Over Arrays

```java
int[] arr = {1, 2, 3, 4, 5};

// Traditional for loop
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}

// Enhanced for loop
for (int num : arr) {
    System.out.println(num);
}
```

## Multidimensional Arrays

```java
// 2D array declaration and initialization
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6}
};

// Accessing elements
System.out.println(matrix[1][2]); // Output: 6
```

## Limitations

- Fixed size (cannot grow/shrink dynamically)
- All elements must be of the same type
- No built-in methods for advanced operations (sorting, searching, etc.)

## Alternatives

- Use `ArrayList` for resizable arrays (dynamic size)
- Use `Collections` utility class for advanced operations

## Useful Links

- [Java Arrays (Official Docs)](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html)
- [Arrays in Java - GeeksforGeeks](https://www.geeksforgeeks.org/arrays-in-java/)
