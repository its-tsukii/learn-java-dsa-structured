# Sorting Algorithms

Sorting is a fundamental operation in computer science. This document covers several common sorting algorithms, categorized as Basic, Efficient, and Special/Hybrid sorts.

---

## 1. Basic Sorting Algorithms

### Bubble Sort

**Description:**  
Repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The process is repeated until the list is sorted.

**Time Complexity:** O(n²)  
**Space Complexity:** O(1) (in-place)  
**Stable:** Yes

**Java Example:**
```java
void bubbleSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}
```

---

### Selection Sort

**Description:**  
Divides the array into a sorted and unsorted part. Repeatedly selects the minimum element from the unsorted part and puts it at the beginning.

**Time Complexity:** O(n²)  
**Space Complexity:** O(1)  
**Stable:** No (but can be made stable)

**Java Example:**
```java
void selectionSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
        int minIdx = i;
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[minIdx]) {
                minIdx = j;
            }
        }
        int temp = arr[minIdx];
        arr[minIdx] = arr[i];
        arr[i] = temp;
    }
}
```

---

### Insertion Sort

**Description:**  
Builds the sorted array one item at a time by repeatedly taking the next element and inserting it into the correct position.

**Time Complexity:** O(n²)  
**Space Complexity:** O(1)  
**Stable:** Yes

**Java Example:**
```java
void insertionSort(int[] arr) {
    int n = arr.length;
    for (int i = 1; i < n; i++) {
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }
}
```

---

## 2. Efficient Sorting Algorithms

### Merge Sort

**Description:**  
A divide-and-conquer algorithm that divides the array into halves, sorts each half, and merges them.

**Time Complexity:** O(n log n)  
**Space Complexity:** O(n)  
**Stable:** Yes

**Java Example:**
```java
void mergeSort(int[] arr, int l, int r) {
    if (l < r) {
        int m = (l + r) / 2;
        mergeSort(arr, l, m);
        mergeSort(arr, m + 1, r);
        merge(arr, l, m, r);
    }
}

void merge(int[] arr, int l, int m, int r) {
    int n1 = m - l + 1;
    int n2 = r - m;
    int[] L = new int[n1];
    int[] R = new int[n2];
    System.arraycopy(arr, l, L, 0, n1);
    System.arraycopy(arr, m + 1, R, 0, n2);
    int i = 0, j = 0, k = l;
    while (i < n1 && j < n2) {
        if (L[i] <= R[j]) arr[k++] = L[i++];
        else arr[k++] = R[j++];
    }
    while (i < n1) arr[k++] = L[i++];
    while (j < n2) arr[k++] = R[j++];
}
```

---

### Quick Sort

**Description:**  
A divide-and-conquer algorithm that picks a "pivot" element and partitions the array around the pivot.

**Time Complexity:** O(n log n) average, O(n²) worst-case  
**Space Complexity:** O(log n) auxiliary (due to recursion)  
**Stable:** No

**Java Example:**
```java
void quickSort(int[] arr, int low, int high) {
    if (low < high) {
        int pi = partition(arr, low, high);
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}

int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    int i = low - 1;
    for (int j = low; j < high; j++) {
        if (arr[j] <= pivot) {
            i++;
            int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
        }
    }
    int temp = arr[i+1]; arr[i+1] = arr[high]; arr[high] = temp;
    return i + 1;
}
```

---

## 3. Special / Hybrid Sorting Algorithms

### Radix Sort

**Description:**  
Non-comparative sorting algorithm that sorts numbers by processing individual digits. Works well for integers.

**Time Complexity:** O(nk), where k is the number of digits in the largest number  
**Space Complexity:** O(n + k)  
**Stable:** Yes

**Java Example:**
```java
void radixSort(int[] arr) {
    int max = Arrays.stream(arr).max().getAsInt();
    for (int exp = 1; max / exp > 0; exp *= 10)
        countingSortByDigit(arr, exp);
}

void countingSortByDigit(int[] arr, int exp) {
    int n = arr.length;
    int[] output = new int[n];
    int[] count = new int[10];
    for (int i = 0; i < n; i++)
        count[(arr[i] / exp) % 10]++;
    for (int i = 1; i < 10; i++)
        count[i] += count[i - 1];
    for (int i = n - 1; i >= 0; i--) {
        output[count[(arr[i] / exp) % 10] - 1] = arr[i];
        count[(arr[i] / exp) % 10]--;
    }
    System.arraycopy(output, 0, arr, 0, n);
}
```

---

### Bucket Sort

**Description:**  
Divides the array into a number of buckets, sorts each bucket individually, and then concatenates all buckets.

**Time Complexity:** O(n + k) average, where k = number of buckets  
**Space Complexity:** O(n + k)  
**Stable:** Yes (if stable sort is used in buckets)

**Java Example:**
```java
void bucketSort(float[] arr) {
    int n = arr.length;
    List<Float>[] buckets = new List[n];
    for (int i = 0; i < n; i++) buckets[i] = new ArrayList<>();
    for (float num : arr) {
        int idx = (int)(num * n);
        buckets[idx].add(num);
    }
    for (List<Float> bucket : buckets)
        Collections.sort(bucket);
    int idx = 0;
    for (List<Float> bucket : buckets)
        for (float num : bucket)
            arr[idx++] = num;
}
```

---

## References

- [GeeksforGeeks: Sorting Algorithms](https://www.geeksforgeeks.org/sorting-algorithms/)
- [Sorting (Wikipedia)](https://en.wikipedia.org/wiki/Sorting_algorithm)
