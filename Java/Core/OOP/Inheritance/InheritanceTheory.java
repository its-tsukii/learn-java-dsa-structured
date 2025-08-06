package Java.Core.OOP.Inheritance;

public class InheritanceTheory {

    public static void main(String[] args) {
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(6, 7);
        int r2 = obj.sub(6, 7);
        int r3 = obj.multi(6, 7);
        int r4 = obj.Division(6, 7);
        double r5 = obj.power(6, 7);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
    }
}
