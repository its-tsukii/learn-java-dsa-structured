package Java.Core.Cloning;

public class ShallowClone {

    public static void main(String[] args) {
        Person original = new Person("Alice", 16);
        Person copy = original;
        copy.setname("Bob");
        System.out.println("Original Object : ");
        original.display();
        System.out.println("Copy Object : ");
        copy.display();
    }
}

class Person implements Cloneable {
    private String name;
    int age;

    Person(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public void setname(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name : " + name + ", Age : " + age);
    }
}
