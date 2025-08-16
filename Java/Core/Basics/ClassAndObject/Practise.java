import java.util.ArrayList;

public class Practise {
    public static void main(String[] args) {
        employee<Object> e = new employee<>();
        e.setName("aayush");
        e.setSalary(90);
        e.addToArr();
        System.out.println(e.PrintArray());

    }
}

class employee<T> {
    private T name;
    private T salary;
    private ArrayList<T> arr = new ArrayList<T>();

    public void setName(T name) {
        this.name = name;
    }

    public void setSalary(T salary) {
        this.salary = salary;
    }

    public T getName() {
        return name;
    }

    public T getSalary() {
        return salary;
    }

    public ArrayList<T> PrintArray() {
        return arr;
    }

    public void addToArr() {
        arr.add(name);
        arr.add(salary);
    }
}