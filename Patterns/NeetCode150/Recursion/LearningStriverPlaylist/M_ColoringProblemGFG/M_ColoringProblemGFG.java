import java.util.*;

public class M_ColoringProblemGFG {
    public static void main(String[] args) {
        int v = 4;
        int[][] edges = { { 0, 1 }, { 1, 3 }, { 2, 3 }, { 3, 0 }, { 0, 2 } };
        int m = 3;
        System.out.println(new Solution().graphColoring(v, edges, m));
    }
}

class Solution {
    boolean graphColoring(int v, int[][] edges, int m) {
        int[] color = new int[v];
        return func(0, color, m, v, edges);
    }

    boolean func(int node, int[] color, int m, int n, int[][] edges) {
        if (node == n) {
            return true;
        }
        for (int i = 1; i <= m; i++) {
            if (isColorable(node, color, i, n, edges)) {
                color[node] = i;
                if (func(node + 1, color, m, n, edges) == true) {
                    return true;
                } else {
                    color[node] = 0;
                }
            }

        }
        return false;
    }

    boolean isColorable(int node, int[] color, int col, int n, int[][] edges) {
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
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