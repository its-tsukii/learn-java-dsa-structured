package Algorithms.Arrays.SlidingWindow.DynamicWindow;

import java.util.Arrays;
import java.util.List;

// Find length of minimum size subarray where the sum is greater than or equal to the target : o(n)

public class Algo {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(2, 3, 1, 2, 4, 3);
        Algorithm algo = new Algorithm();
        System.out.println(algo.method(arr, 6));
    }
}

class Algorithm {
    Object method(List<Integer> arr, int target) {
        int l = 0;
        int total = 0;
        int length = Integer.MAX_VALUE;
        for (int r = 0; r < arr.size(); r++) {
            total += arr.get(r);
            while (total >= target) {
                length = Math.min(r - l + 1, length);
                total -= arr.get(l);
                l++;
            }
        }
        if (length == 0)
            return 0;
        else
            return length;
    }
}
