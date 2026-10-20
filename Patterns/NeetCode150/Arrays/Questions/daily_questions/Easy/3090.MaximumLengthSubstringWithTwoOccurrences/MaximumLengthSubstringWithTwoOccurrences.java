import java.util.HashMap;

public class MaximumLengthSubstringWithTwoOccurrences {
    public static void main(String[] args) {
        String s = "bcbbbcba";
        System.out.println(new Solution().maximumLengthSubstring(s));
    }
}

class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            while (map.get(s.charAt(i)) > 2) {
                map.put(s.charAt(left), map.getOrDefault(s.charAt(left), 0) - 1);
                ans = Math.max(ans, i - left + 1);
                left++;
            }
        }
        return ans;
    }
}