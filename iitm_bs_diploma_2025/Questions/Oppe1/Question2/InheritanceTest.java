package iitm_bs_diploma_2025.Questions.Oppe1.Question2;

import java.util.Scanner;

public class InheritanceTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Faculty obj1 = new Faculty(sc.next(), sc.nextDouble());
        Faculty obj2 = new Hod(sc.next(), sc.nextDouble(), sc.next());
        System.out.println(obj1.getDetails());
        System.out.println(obj1.getDetails(10));
        System.out.println(obj2.getDetails());
        System.out.println(obj2.getDetails(10));
    }
}

class Faculty {
    private String name;
    private double salary;

    public Faculty(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double bonus(float percent) {
        return (percent / 100.0) * salary;
    }

    // Define method getDetails()
    public String getDetails() {
        return name + ", " + salary;
    }

    // Override method getDetails(float percent)
    public String getDetails(float percent) {
        return getDetails() + ", bonus = " + bonus(percent);
    }
}

class Hod extends Faculty {
    private String personalAssistant;

    public Hod(String name, double salary, String pa) {
        super(name, salary);
        this.personalAssistant = pa;
    }

    // Override method bonus(float percent)
    public double bonus(float percent) {
        return 0.5 * super.bonus(percent);
    }

    // Override method getDetails()
    public String getDetails() {
        return super.getDetails() + ", " + personalAssistant;
    }

    // Override method getDetails(float percent)
    public String getDetails(float percent) {
        return getDetails() + ", " + bonus(percent);
    }
}