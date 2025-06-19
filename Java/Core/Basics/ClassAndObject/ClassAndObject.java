class Calculator {
    public int add(int a, int b) {
        int r = a + b;
        return r;
    }

    public int multiply(int a, int b) {
        int r = a * b;
        return r;
    }
}

public class ClassAndObject {

    public static void main(String[] args) {
        int num1 = 89;
        int num2 = 90;

        Calculator calc = new Calculator();
        int result = calc.add(num1, num2);
        System.out.println(result);
    }
}
