import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        String[] tokens = { "2", "1", "+", "3", "*" };
        System.out.println(new Solution().evalRPN(tokens));
    }
}

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String str : tokens) {
            if (str.equals("+")) {
                int x = stack.pop();
                int y = stack.pop();
                stack.push(x + y);
            } else if (str.equals("-")) {
                int x = stack.pop();
                int y = stack.pop();
                stack.push(y - x);
            } else if (str.equals("*")) {
                int x = stack.pop();
                int y = stack.pop();
                stack.push(x * y);
            } else if (str.equals("/")) {
                int x = stack.pop();
                int y = stack.pop();
                stack.push(y / x);
            } else {
                stack.push(Integer.parseInt(str));
            }
        }
        return stack.peek();
    }
}