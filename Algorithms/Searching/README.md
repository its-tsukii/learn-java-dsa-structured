# Searching Algorithms

This folder contains implementations of searching algorithms.

---

## Subfolders

- [`BinaryAndLinear/`](BinaryAndLinear) - Comparison of Binary Search and Linear Search with benchmarking.

Explore individual folders for detailed explanations and code.

## Binary Search and Linear Search Algorithms

Searching is a fundamental operation in computer science, used to find the presence or position of an element in a data structure. Two of the most common searching algorithms are **Linear Search** and **Binary Search**.

---

## 1. Linear Search

**Linear Search** is the simplest searching algorithm. It checks each element of the list sequentially until the desired element is found or the list ends.

### Characteristics
- **Works on:** Unsorted or sorted arrays
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

### Pseudocode

```
function linearSearch(arr, target):
    for i from 0 to length(arr) - 1:
        if arr[i] == target:
            return i   // Found at index i
    return -1           // Not found
```

### Java Implementation

```java
public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // Not found
    }
}
```

---

## 2. Binary Search

**Binary Search** is a much faster searching algorithm but requires the array to be **sorted** in advance.

### Characteristics
- **Works on:** Sorted arrays only
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1) (iterative version), O(log n) (recursive version)

### Algorithm
1. Find the middle element of the array.
2. If the middle element is the target, return its index.
3. If the target is smaller, search the left half; if larger, search the right half.
4. Repeat until the target is found or the search space is empty.

### Pseudocode

```
function binarySearch(arr, target):
    left = 0
    right = length(arr) - 1
    while left <= right:
        mid = left + (right - left) / 2
        if arr[mid] == target:
            return mid
        else if arr[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
    return -1
```

### Java Implementation

```java
public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1; // Not found
    }
}
```

---

## Comparison Table

| Algorithm      | Works On         | Time Complexity | Space Complexity | When to Use                   |
|----------------|------------------|-----------------|------------------|-------------------------------|
| Linear Search  | Sorted/Unsorted  | O(n)            | O(1)             | Small or unsorted datasets    |
| Binary Search  | Sorted Only      | O(log n)        | O(1)/O(log n)    | Large, sorted datasets        |

---

## References

- [Linear Search - GeeksforGeeks](https://www.geeksforgeeks.org/linear-search/)
- [Binary Search - GeeksforGeeks](https://www.geeksforgeeks.org/binary-search/)