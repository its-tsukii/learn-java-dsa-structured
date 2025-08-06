package Java.Core.Generics;

import java.util.*;

public class Practise {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Hello");

        Object o = arr.get(0);
        System.out.println(o);
        T t = new T(34, "hello");
        System.out.println(t.getAge() + t.getName());

        Box<Integer, String> b = new Box<Integer, String>(34, "hello");
        System.out.println("this is : the age :" + b.getAge() + " this is the name : " + b.getName());

        Ghost gh = (Ghost) new Host<String>("null");
        System.out.println(gh.host());

        Boxxx<Integer> bx = new Boxxx<Integer>(34);
        bx.display();
    }

}

class T {
    private int age;
    public String name = "";

    public T(int age, String name) {
        this.age = age;
        this.name = name;

    }

    public String getAge() {
        return name;
    }

    public int getName() {
        return age;
    }
}

class Box<I, S> {
    private I age;
    private S name;

    public Box(I age, S name) {
        this.age = age;
        this.name = name;
    }

    public I getAge() {
        return age;
    }

    public S getName() {
        return name;
    }
}

interface Ghost {
    default String host() {
        return " ok form Ghost";
    };
}

class Host<H> implements Ghost {
    private H name;

    public Host(H name) {
        this.name = name;
    }

    public H setName() {
        return name;
    }

}

interface Boxx<T extends Number> {
    public abstract void display();
}

class Boxxx<T extends Number> implements Boxx {
    private T str;

    public Boxxx(T str) {
        this.str = str;
    }

    @Override
    public void display() {
        System.out.println(str);
    }
}