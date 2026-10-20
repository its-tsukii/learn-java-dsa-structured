public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(new Solution().longestPalindrome(s));
    }
}

class Solution {
    public String longestPalindrome(String s) {
        StringBuilder ans = new StringBuilder();
        int max_ans = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPalindrome(i, j, s)) {
                    max_ans = Math.max(max_ans, j - i + 1);
                    if (max_ans == j - i + 1) {
                        ans.replace(0, ans.length(), s.substring(i, j + 1));
                    }
                }
            }
        }
        return ans.toString();
    }

    public boolean isPalindrome(int first, int second, String s) {
        int left = first;
        int right = second;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}