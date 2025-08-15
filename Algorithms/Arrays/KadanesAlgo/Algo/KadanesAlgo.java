package Algorithms.Arrays.KadanesAlgo.Algo;

import java.util.Arrays;
import java.util.List;

public class KadanesAlgo {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(4, -1, 2, -7, 3, 4);
        Algo bf = new Algo();
        System.out.println(bf.method(arr));
    }
}

class Algo {
    int method(List<Integer> arr) {
        int maxSum = arr.get(0);
        int currSum = 0;
        for (int i = 0; i < arr.size(); i++) {
            currSum = Math.max(currSum, 0);
            currSum += arr.get(i);
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
}