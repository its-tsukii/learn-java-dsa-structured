public class Practise {

    public static void main(String[] args) {
        Animal<Integer> a = new Dog<>();
        Dog<Integer> d = new Dog<>();
        d.speak();
        ((Dog<Integer>) a).fetch();
        d.Age(45);
    }
}

interface Animal<T> {
    void speak();
}

class Dog<T> implements Animal<T> {
    T age;

    public void speak() {
        System.out.println("Woof");
    }

    public void Age(T age) {
        this.age = age;
    }

    public String toString() {
        return age.toString();
    }

    public void fetch() {
        System.out.println("Fetching");
    }
}
