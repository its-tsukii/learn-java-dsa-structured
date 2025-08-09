package Algorithms.Arrays.SlidingWindow.Algo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//Check if array contains a pair of duplicate values
// where two duplicates are no farther than k positions from 
// eachother (i.e arr[i] == arr[j] and abs(i - j) <= k).
// o(n * k)

public class Algo {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 5, 7, 6, 7);
        int k = 3;
        Optimised b = new Optimised();
        System.out.println(b.optimisedAlgo(arr, k));
    }
}

class Optimised {
    boolean optimisedAlgo(List<Integer> arr, int k) {
        HashSet<Integer> h = new HashSet<>();
        int l = 0;

        for (int r = 0; r < arr.size(); r++) {
            if (r - l + 1 > k) {
                h.remove(arr.get(l));
                l++;
            }
            if (h.contains(arr.get(r))) {
                return true;
            }
            h.add(arr.get(r));
        }
        return false;
    }
}