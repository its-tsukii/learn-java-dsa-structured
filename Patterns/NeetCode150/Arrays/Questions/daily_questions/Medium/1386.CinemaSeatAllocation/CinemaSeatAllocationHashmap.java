import java.util.*;

public class CinemaSeatAllocationHashmap {
    public static void main(String[] args) {
        int n = 3;
        int[][] reservedSeats = { { 1, 2 }, { 1, 3 }, { 1, 8 }, { 2, 6 }, { 3, 1 }, { 3, 10 } };
        System.out.println(new Solution().maxNumberOfFamilies(n, reservedSeats));
    }
}

class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer, Set<Integer>> rows = new HashMap<>();
        for (int[] i : reservedSeats) {
            rows.computeIfAbsent(i[0], k -> new HashSet<>()).add(i[1]);
        }
        int ans = 0;
        for (Set<Integer> seat : rows.values()) {
            boolean left = true;
            for (int seats = 2; seats <= 5; seats++) {
                if (seat.contains(seats)) {
                    left = false;
                }
            }
            boolean middle = true;
            for (int seats = 4; seats <= 7; seats++) {
                if (seat.contains(seats)) {
                    middle = false;
                }
            }
            boolean right = true;
            for (int seats = 6; seats <= 9; seats++) {
                if (seat.contains(seats)) {
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