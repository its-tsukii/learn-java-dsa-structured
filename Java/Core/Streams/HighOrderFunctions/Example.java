package Java.Core.Streams.HighOrderFunctions;

public class Example {
    public static void main(String[] args) {
        calculator add = (x, y) -> x + y;
        int result1 = compute(23, 45, add);
        int result2 = compute(34, 2, (x, y) -> x * y);

        show(result1, (r) -> System.out.println(r));
        show(result2, (r) -> System.out.println(r));
    }

    public static int compute(int a, int b, calculator op) {
        return op.operation(a, b);
    }

    public static void show(int r, Displayable dp) {
        dp.print(r);
    }

}

interface calculator {
    int operation(int a, int b);
}

interface Displayable {
    void print(int r);
}
