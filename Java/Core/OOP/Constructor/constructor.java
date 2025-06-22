package Java.Core.OOP.Constructor;

public class constructor {

    public static void main(String[] args) {
        Human obj1 = new Human(20, "aayush");
        Human obj = new Human();
        System.out.println(obj1.getAge() + " : " + obj1.getName());
        System.out.println(obj.getAge() + " : " + obj.getName());

        // obj1.setAge(30);
        // obj1.setName("aayush");
        // System.out.println(obj1.getAge() + " : " + obj1.getName());
    }
}

class Human {
    private int age;
    private String name;

    public Human() {
        age = 12;
        name = "aayush";
    }

    public Human(int a, String b) {
        age = a;
        name = b;
        System.out.println("hiya");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}