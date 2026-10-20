import java.util.*;

public class CinemaSeatAllocation {
    public static void main(String[] args) {
        int n = 3;
        int[][] reservedSeats = { { 1, 2 }, { 1, 3 }, { 1, 8 }, { 2, 6 }, { 3, 1 }, { 3, 10 } };
        System.out.println(new Solution().maxNumberOfFamilies(n, reservedSeats));
    }
}

class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashSet<String> reserved = new HashSet<>();
        for (int[] i : reservedSeats) {
            reserved.add(i[0] + "," + i[1]);
        }
        int ans = 0;
        for (int row = 1; row <= n; row++) {
            boolean left = true;
            for (int seat = 2; seat <= 5; seat++) {
                if (reserved.contains(row + "," + seat)) {
                    left = false;
                }
            }
            boolean middle = true;
            for (int seat = 4; seat <= 7; seat++) {
                if (reserved.contains(row + "," + seat)) {
                    middle = false;
                }
            }
            boolean right = true;
            for (int seat = 6; seat <= 9; seat++) {
                if (reserved.contains(row + "," + seat)) {
                    right = false;
                }
            }
            if (left && right) {
                ans += 2;
            } else if (left || middle || right) {
                ans++;
            }
        }
        return ans;
    }
}