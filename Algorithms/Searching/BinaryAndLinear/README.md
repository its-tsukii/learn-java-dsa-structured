# Binary Search and Linear Search

This folder contains Java implementations comparing **Binary Search** and **Linear Search** algorithms.

## Overview

| Algorithm      | Time Complexity | Space Complexity | Notes                            |
|----------------|-----------------|------------------|---------------------------------|
| Linear Search  | O(n)            | O(1)             | Checks each element sequentially.|
| Binary Search  | O(log n)        | O(1)             | Requires sorted array; divides search space.|

## Code Summary

- `linear_search(int[] arr, int n, int x)`  
  Iterates over the array sequentially to find element `x`.

- `binary_search(int[] arr, int n, int x)`  
  Uses divide-and-conquer to locate element `x` efficiently.

## Benchmarking

Time and memory usage measured via Java's `System.nanoTime()` and `Runtime.getRuntime()`.

## Sample Output
  
  Element found at index (binary_search): 2  
  Binary Search Time: 1400 ns  
  Binary Search Memory Used: 2048 bytes  
  Binary Search Memory Used: 2 kb  
  Element found at index (linear_search): 2  
  Linear Search Time: 3500 ns  
  Linear Search Memory Used: 4096 bytes  
  Linear Search Memory Used: 4 kb  

*Note:* Memory usage can fluctuate due to JVM garbage collection and runtime optimizations.

## Notes

- Binary Search is significantly faster than Linear Search for large sorted arrays.
- Both algorithms use O(1) space, but actual memory use may differ due to JVM internals.

---

Feel free to modify and experiment with the code to deepen your understanding!
