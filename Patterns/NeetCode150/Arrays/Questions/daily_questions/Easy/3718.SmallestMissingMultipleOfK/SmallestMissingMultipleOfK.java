import java.util.HashSet;

public class SmallestMissingMultipleOfK {
    public static void main(String[] args) {
        int[] nums = { 8, 2, 3, 4, 6 };
        int k = 2;
        System.out.println(new Solution().missingMultiple(nums, k));
    }
}

class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int multiple = k;
        while (set.contains(multiple)) {
            multiple += k;
        }
        return multiple;
    }
}