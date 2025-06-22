package Java.Core.OOP.Super;

public class SuperTheory {
    public static void main(String[] args) {
        B obj = new B(2);
        obj.Display();
    }
}

class A {
    A() {
        super();
        System.out.println("In A");
    }

    A(int a) {
        super();
        System.out.println("In B int :" + a);
    }
}

class B extends A {
    int nValue;

    B() {
        super();
        System.out.println("In B");
    }

    B(int n) {
        super(n);
        this.nValue = n;
        System.out.println("In B int :" + n);
    }

    public void Display() {
        System.out.println("Printing the object methods");
        System.out.println(nValue);
    }
}