public class LongestPalindromicSubstringOptimal {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(new Solution().longestPalindrome(s));
    }
}

class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        int start = 0;
        int end = 0;
        int max_Len = 0;
        for (int i = 0; i < s.length(); i++) {
            temp odd = expand(i, i, s);
            temp even = expand(i, i + 1, s);

            temp best = odd.value_len >= even.value_len ? odd : even;

            if (best.value_len > max_Len) {
                max_Len = best.value_len;
                start = best.start;
                end = best.end;
            }
        }
        return s.substring(start, end);
    }

    public temp expand(int left, int right, String s) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        temp tmp = new temp();
        tmp.value_len = right - left - 1;
        tmp.start = left + 1;
        tmp.end = right;
        return tmp;
    }
}

class temp {
    int value_len;
    int start;
    int end;
}