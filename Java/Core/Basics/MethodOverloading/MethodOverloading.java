package Java.Core.Basics.MethodOverloading;

public class MethodOverloading {
    public int add(int x, int y) {
        int z = x + y;
        return z;
    }

    public int add(int x, int y, int z) {
        int w = x + y + z;
        return w;
    }

    public double add(double x, double y) {
        double z = x + y;
        return z;
    }

    public static void main(String[] args) {
        MethodOverloading m = new MethodOverloading();
        double m1 = m.add(456.67, 678.98);
        System.out.println(m1);
        int m2 = m.add(4, 5);
        System.out.println(m2);
        int m3 = m.add(45, 67, 89);
        System.out.println(m3);
    }
}
