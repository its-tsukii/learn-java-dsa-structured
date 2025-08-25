# Sliding Window Technique

The **Sliding Window** is a highly efficient technique used to solve problems involving arrays or lists, especially for finding subarrays or substrings that satisfy certain properties (such as maximum sum, minimum length, or unique elements). It is widely used for problems related to sequences and contiguous data.

---

## What is the Sliding Window Technique?

The sliding window approach uses two pointers (usually called `start` and `end`) to create a "window" which can expand or contract over the input data, typically an array or string. The window slides forward as you process the data, maintaining an efficient O(n) time complexity for many problems that would otherwise require nested loops.

---

## Typical Use Cases

- Finding the maximum/minimum sum of subarrays of size `k`
- Finding the smallest/largest substring that satisfies a condition
- Counting unique elements in subarrays
- Problems involving contiguous subarrays or substrings

---

## Example 1: Maximum Sum Subarray of Size K

**Problem:**  
Given an array of integers and a number `k`, find the maximum sum of any contiguous subarray of size `k`.

**Algorithm:**
1. Compute the sum of the first `k` elements.
2. Slide the window by one position at a time:
    - Subtract the element going out and add the new element coming in.
3. Update the maximum sum as you go.

**Java Implementation:**
```java
public class SlidingWindowMaxSum {
    public static int maxSum(int[] nums, int k) {
        int windowSum = 0, maxSum = 0;
        // sum of first window
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        maxSum = windowSum;
        // slide the window
        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
}
```

---

## Example 2: Smallest Substring with All Unique Characters

**Problem:**  
Given a string, find the length of the smallest substring containing all unique characters.

**Algorithm:**  
Use a HashSet to track unique characters and adjust the window as duplicates are found.

---

## Tips

- Use HashMaps or HashSets to efficiently track elements in the window if needed.
- The window can either be of fixed size (as in the first example) or variable size (as in finding the smallest substring).

---

## Time and Space Complexity

- **Time Complexity:** O(n) for most problems.
- **Space Complexity:** O(k) or O(n), depending on the use of auxiliary data structures.

---

## References

- [Sliding Window Pattern - LeetCode Explore](https://leetcode.com/explore/learn/card/sliding-window/)
- [GeeksforGeeks: Sliding Window Technique](https://www.geeksforgeeks.org/window-sliding-technique/)
