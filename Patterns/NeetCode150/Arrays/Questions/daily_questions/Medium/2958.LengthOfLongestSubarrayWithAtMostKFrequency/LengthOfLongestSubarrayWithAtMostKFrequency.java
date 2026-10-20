import java.util.*;

public class LengthOfLongestSubarrayWithAtMostKFrequency {
    public static void main(String[] args) {
        int[] nums = { 5, 5, 5, 5, 5, 5, 5 };
        int k = 4;
        System.out.println(new Solution().maxSubarrayLength(nums, k));
    }
}

class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            while (map.get(nums[i]) > k) {
                map.put(nums[left], map.put(nums[left], 0) - 1);
                left++;
            }
            ans = Math.max(ans, i - left + 1);
        }
        return ans;
    }
}