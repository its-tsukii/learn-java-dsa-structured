/**
 * Given an array of values, 
 * design a data Structure that can query the 
 * sum of a subarray of the values.
 */

package Algorithms.Arrays.Post_Prefix_Sums;

import java.util.ArrayList;
import java.util.Arrays;

public class Prefix_Sums {
    public static void main(String[] args) {
        Prefix p = new Prefix(new ArrayList<Integer>(Arrays.asList(2, -1, 3, -3, 4)));
        System.out.println(p.rangeSum(2, 4));
    }
}

class Prefix {
    /*
     * Prefix(int[] arr) {
     * int[] prefix = new int[arr.length];
     * int total = 0;
     * for (int i = 0; i < arr.length; i++) {
     * total += arr[i];
     * prefix[i] = total;
     * }
     * }
     */

    ArrayList<Integer> prefix = new ArrayList<>();

    Prefix(ArrayList<Integer> arr) {
        int total = 0;
        for (Integer i : arr) {
            total += i;
            prefix.add(total);
        }
    }

    int rangeSum(int left, int right) {
        int prefRight = prefix.get(right);
        int prefLeft = (left > 0) ? prefix.get(left - 1) : 0;
        /*
         * if(left > 0){
         * int prefLeft = Prefix.prefix.get(left - 1);
         * }
         * else{
         * int prefLeft = 0;
         * }
         */

        return prefRight - prefLeft;
    }
}