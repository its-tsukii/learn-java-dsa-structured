import java.util.*;

public class DistributeElementsIntoTwoArraysI {
    public static void main(String[] args) {
        int[] nums = { 2, 1, 3 };
        Arrays.stream(new Solution().resultArray(nums)).forEach(i -> System.out.print(i + " "));
    }
}

class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for (int i = 2; i < nums.length; i++) {
            if (arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1)) {
                arr1.add(nums[i]);
            } else {
                arr2.add(nums[i]);
            }
        }
        int[] result = new int[nums.length];
        int left = 0;
        while (left < arr1.size()) {
            result[left] = arr1.get(left);
            left++;
        }
        while (left < nums.length) {
            result[left] = arr2.get(left - arr1.size());
            left++;
        }

        return result;
    }
}