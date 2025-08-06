# 🧮 Basic Sorting Algorithms in Java

This module includes implementations and performance metrics for three fundamental sorting algorithms:

- 🔁 Bubble Sort
- 🔂 Selection Sort
- ⏬ Insertion Sort

Each algorithm is written in Java and benchmarked using:

- **Execution time** (`System.nanoTime()`)
- **Memory usage** (`Runtime.getRuntime()`)

---

## 📁 File: `BubbleSort_SelectionSort_InsertionSort.java`

### Contents:

- `bubble_sort(int[] arr, int n)`
- `selection_sort(int[] arr, int n)`
- `insertion_sort(int[] arr, int n)`
- Benchmarking for time and memory
- Console output for results

---

## 📊 Algorithm Comparison Table

| Algorithm       | Time Complexity (Best) | Time (Avg/Worst) | Space Complexity | Stable | Adaptive | In-place |
|----------------|------------------------|------------------|------------------|--------|----------|----------|
| Bubble Sort     | O(n)                  | O(n²)           | O(1)             | ✅     | ✅       | ✅       |
| Selection Sort  | O(n²)                 | O(n²)           | O(1)             | ❌     | ❌       | ✅       |
| Insertion Sort  | O(n)                  | O(n²)           | O(1)             | ✅     | ✅       | ✅       |

---

## 🔍 Real-World Use Cases

### 🔁 Bubble Sort

- Educational purposes (easy to understand)
- Checking if the list is already sorted with minimal overhead

### 🔂 Selection Sort

- When memory writes are expensive (e.g., flash memory)
- Useful in embedded systems with limited resources

### ⏬ Insertion Sort

- Efficient for small datasets
- Often used as a hybrid approach in more complex algorithms like Timsort (Python/Java)

---

## 🧪 Sample Output

```output

Before Sorting : [13, 46, 24, 52, 20, 9]
------------------------------------------
Bubble_Sort    : [9, 13, 20, 24, 46, 52]
Bubble Sort Time: 25100 ns
Bubble Sort Memory Used: 3456 bytes
Bubble Sort Memory Used: 3 kb
------------------------------------------
Selection_Sort : [9, 13, 20, 24, 46, 52]
Selection Sort Time: 19300 ns
Selection Sort Memory Used: 3456 bytes
Selection Sort Memory Used: 3 kb
------------------------------------------
Insertion_Sort : [9, 13, 20, 24, 46, 52]
Insertion Sort Time: 16400 ns
Insertion Sort Memory Used: 3456 bytes
Insertion Sort Memory Used: 3 kb
------------------------------------------
```

✅ How to Run

### Compile

```java

javac BubbleSort_SelectionSort_InsertionSort.java

```

### Run

```java

java BubbleSort_SelectionSort_InsertionSort

```
