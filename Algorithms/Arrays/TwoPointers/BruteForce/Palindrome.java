package Algorithms.Arrays.TwoPointers.BruteForce;

import java.util.ArrayList;
import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 7, 7, 5, 2, 1 };
        CheckPalindrome p = new CheckPalindrome();
        System.out.println(p.isPalindrome(arr));

        ArrayList<Integer> arr_ = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 7, 7, 5, 2, 1));
        System.out.println(p.isPalindrome(arr_));
    }
}

class CheckPalindrome {
    public boolean isPalindrome(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            if (arr[l] != arr[r]) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public boolean isPalindrome(ArrayList<Integer> arr) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            if (arr.get(l) != arr.get(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}