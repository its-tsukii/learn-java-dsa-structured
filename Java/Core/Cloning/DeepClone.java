package Java.Core.Cloning;

public class DeepClone {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person original = new Person("Alice", 16);
        Person copy = original.clone();
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

    public Person(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public void setname(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name : " + name + ", Age : " + age);
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }
}
