package Algorithms.Arrays.SlidingWindow.BruteForce;

import java.util.Arrays;
import java.util.List;

//Check if array contains a pair of duplicate values
// where two duplicates are no farther than k positions from 
// eachother (i.e arr[i] == arr[j] and abs(i - j) <= k).
// o(n * k)

public class BruteForce {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 7, 5, 6, 7);
        int k = 3;
        Brute b = new Brute(arr, k);
        System.out.println(b.x);
    }
}

class Brute {
    public boolean x;
    public int k;

    Brute(List<Integer> arr, int k) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i).equals(arr.get(j)) && Math.abs(i - j) <= k) {
                    x = true;
                    return;
                } else {
                    x = false;
                }
            }
        }
    }
}