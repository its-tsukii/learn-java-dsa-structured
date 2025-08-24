/**
 * Performs Various functions and demonstrates various functions of objects.
 * 
 * @param obj       add(), multiply().
 * @param num1,num2 holds numerical values.
 * @print obj.
 */

public class ClassAndObject {

    public static void main(String[] args) {
        int num1 = 89;
        int num2 = 90;

        Calculator calc = new Calculator();
        int result = calc.add(num1, num2);
        System.out.println(result);
        vehicle v = new car();
        v.display();
    }
}

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

/*
 * this demostrates the Object and its pracitcal use : we can create as many
 * object as we want basically an object or obj is bascially an instance of that
 * class : the instance or obj inherits the class traits
 */

class vehicle {

    public void display() {
        System.out.println("This is Vehicle");
    }
}

class car extends vehicle {
    public void display() {
        System.out.println("This is car");
    }
}

// left side = visible scope
// right side = behavior