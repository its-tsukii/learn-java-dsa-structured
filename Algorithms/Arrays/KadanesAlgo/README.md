# Kadane's Algorithm

Kadane's Algorithm is a dynamic programming approach used to find the **maximum sum subarray** within a one-dimensional array of numbers (both positive and negative). It is widely known for its efficient linear time complexity.

## Problem Statement

Given an array of integers, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

**Example:**
```
Input:  nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
```

## Algorithm

1. Initialize two variables:
   - `max_so_far` = first element of array (or `Integer.MIN_VALUE` if empty)
   - `max_ending_here` = first element of array

2. Loop through the array starting from the second element:
   - For each element `x`, set:  
     `max_ending_here = max(x, max_ending_here + x)`
   - Update:  
     `max_so_far = max(max_so_far, max_ending_here)`

3. After the loop, `max_so_far` contains the maximum sum.

## Pseudocode

```
function kadane(arr):
    max_so_far = arr[0]
    max_ending_here = arr[0]

    for i from 1 to length(arr)-1:
        max_ending_here = max(arr[i], max_ending_here + arr[i])
        max_so_far = max(max_so_far, max_ending_here)

    return max_so_far
```

## Java Implementation

```java
public class KadanesAlgorithm {
    public static int maxSubArraySum(int[] arr) {
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum subarray sum is " + maxSubArraySum(nums));
    }
}
```

## Time & Space Complexity

- **Time Complexity:** O(n) — Only one pass through the array.
- **Space Complexity:** O(1) — Constant extra space.

## Applications

- Stock market analysis (maximum profit within a period)
- Dynamic programming subproblems
- Any situation requiring maximum-sum contiguous subarrays

## References

- [Kadane's Algorithm - GeeksforGeeks](https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/)
- [Kadane's Algorithm - Wikipedia](https://en.wikipedia.org/wiki/Maximum_subarray_problem)
