/**
 * Given a sorted input array, return the two indices of two elements which sum up to the target value.
 * Assume there's exactly one solution.
 * @param nums
 * @param target
 * Shrinking Window
 * o(n)
 */

package Algorithms.Arrays.TwoPointers.Algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetSum {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(-1, 2, 3, 4, 8, 9));
        System.out.println(Solution.TargetSumMethod(arr, 7));
    }
}

class Solution {
    public static List<Integer> TargetSumMethod(ArrayList<Integer> arr, int target) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            if (arr.get(l) + arr.get(r) > target) {
                r--;
            } else if (arr.get(l) + arr.get(r) < target) {
                l++;
            } else {
                return Arrays.asList(l, r);
            }
        }
        return Arrays.asList();
    }
}