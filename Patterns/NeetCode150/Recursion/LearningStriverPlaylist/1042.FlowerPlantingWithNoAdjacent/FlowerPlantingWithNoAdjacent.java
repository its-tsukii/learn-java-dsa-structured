// refer to the M-Coloring problem before this

import java.util.Arrays;

public class FlowerPlantingWithNoAdjacent {
    public static void main(String[] args) {
        int n = 3;
        int[][] paths = { { 1, 2 }, { 2, 3 }, { 3, 1 } };
        Arrays.stream(new Solution().gardenNoAdj(n, paths)).forEach(i -> System.out.print(i + " "));
    }
}

class Solution {
    public int[] gardenNoAdj(int n, int[][] paths) {
        int[] color = new int[n];
        func(0, color, n, paths);
        return color;
    }

    public boolean func(int node, int[] color, int n, int[][] edges) {
        if (node == n) {
            return true;
        }
        for (int i = 1; i <= 4; i++) {
            if (isColorable(node, color, i, n, edges)) {
                color[node] = i;
                if (func(node + 1, color, n, edges))
                    return true;
                else
                    color[node] = 0;
            }
        }
        return false;
    }

    boolean isColorable(int node, int[] color, int col, int n, int[][] edges) {
        for (int[] edge : edges) {
            int u = edge[0] - 1;
            int v = edge[1] - 1;
            if (u == node && color[v] == col) {
                return false;
            }
            if (v == node && color[u] == col) {
                return false;
            }
        }
        return true;
    }
}