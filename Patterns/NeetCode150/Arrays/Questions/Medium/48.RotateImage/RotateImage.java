import java.util.*;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        new Solution().rotate(matrix);
        Arrays.stream(matrix).forEach(i -> {
            System.out.print("{");
            Arrays.stream(i).forEach(j -> System.out.print(" " + j + " "));
            System.out.print("}");
            System.out.println();
        });
    }
}

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // step 1 : just transpose of the matrix that is row becomes the column and
        // column becomes the row
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                swap(matrix, i, j, j, i);
            }
        }
        // step 2 : reverse the rows
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                swap(matrix, i, left, i, right);
                left++;
                right--;
            }
        }
    }

    public void swap(int[][] matrix, int first, int second, int third, int fourth) {
        int temp = matrix[first][second];
        matrix[first][second] = matrix[third][fourth];
        matrix[third][fourth] = temp;
    }
}