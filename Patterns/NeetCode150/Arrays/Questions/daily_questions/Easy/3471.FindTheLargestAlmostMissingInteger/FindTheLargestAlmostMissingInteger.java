import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FindTheLargestAlmostMissingInteger {
    public static void main(String[] args) {
        int[] nums = { 3, 9, 2, 1, 7 };
        int k = 3;
        System.out.println(new Solution().largestInteger(nums, k));
    }
}

class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (right - left + 1 == k) {
                HashSet<Integer> set = new HashSet<>();
                for (int i = left; i <= right; i++) {
                    set.add(nums[i]);
                }
                for (int s : set) {
                    map.put(s, map.getOrDefault(s, 0) + 1);
                }
                left++;
            }
        }
        int max_value = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (value == 1) {
                max_value = Math.max(max_value, key);
            }
        }
        return max_value;
    }
}