package Algorithms.Arrays.KadanesAlgo.BruteForce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KadanesAlgo {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(4, -1, 2, -7, 3, 4);
        BruteForce bf = new BruteForce();
        System.out.println(bf.method(arr));
    }
}

class BruteForce {
    int method(List<Integer> arr) {
        int maxSum = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            int currSum = 0;
            for (int j = i; j < arr.size(); j++) {
                currSum = currSum + arr.get(j);
                maxSum = Math.max(maxSum, currSum);
            }
        }
        return maxSum;
    }
}