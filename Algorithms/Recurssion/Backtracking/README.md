# Backtracking in Java

**Backtracking** is a problem-solving algorithmic technique used for finding solutions by trying out different possibilities and undoing ("backtracking") when a choice leads to failure. It is especially useful for problems that require exploring all possible configurations to find one or all solutions, such as puzzles, permutations, and combinations.

---

## Key Concepts

- **Recursive Exploration:** Backtracking uses recursion to explore all possible states or configurations.
- **Decision Tree:** Each recursive call represents a decision point. If a choice doesn’t lead to a solution, the algorithm "backtracks" to the previous state and tries another option.
- **Pruning:** Unpromising paths are abandoned early to optimize the search.

---

## Typical Use Cases

- Permutations and combinations
- N-Queens problem
- Sudoku Solver
- Subset generation
- Word search problems

---

## Example: N-Queens Problem

Place N queens on an N×N chessboard so that no two queens threaten each other.

```java
public class NQueens {
    public void solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        char[][] board = new char[n][n];
        for (char[] row : board)
            Arrays.fill(row, '.');
        backtrack(solutions, board, 0);
        // Print or use 'solutions'
    }

    private void backtrack(List<List<String>> solutions, char[][] board, int row) {
        if (row == board.length) {
            solutions.add(construct(board));
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (isValid(board, row, col)) {
                board[row][col] = 'Q';
                backtrack(solutions, board, row + 1);
                board[row][col] = '.'; // Undo move
            }
        }
    }

    private boolean isValid(char[][] board, int row, int col) {
        for (int i = 0; i < row; i++)
            if (board[i][col] == 'Q')
                return false;
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q')
                return false;
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++)
            if (board[i][j] == 'Q')
                return false;
        return true;
    }

    private List<String> construct(char[][] board) {
        List<String> res = new ArrayList<>();
        for (char[] row : board)
            res.add(new String(row));
        return res;
    }
}
```

---

## Template for Backtracking

```java
void backtrack(choices):
    if (solution found):
        record solution
        return
    for (choice in choices):
        make choice
        backtrack(next choices)
        undo choice
```

---

## Pros and Cons

| Pros                                 | Cons                           |
|---------------------------------------|--------------------------------|
| Finds all solutions                   | Can be slow (exponential time) |
| Simple and elegant for many problems  | May use lots of recursion      |
| Useful for constraint satisfaction    |                                |

---

## Tips

- Use pruning to optimize (skip invalid candidates early).
- Combine with other strategies (e.g., memoization) when possible.

---

## References

- [Backtracking - GeeksforGeeks](https://www.geeksforgeeks.org/backtracking-algorithms/)
- [N-Queens Problem - LeetCode](https://leetcode.com/problems/n-queens/)