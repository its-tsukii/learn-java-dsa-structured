package Java.Core.Serialization;

import java.io.*;

public class SerialEx1 {
    public static void main(String[] args) {
        String filepath = "Employeeser.txt";

        // serialization
        // writing
        Employee emp1 = new Employee("Arun", 50000.0);
        Employee emp2 = new Employee("Varun", 70000.0);

        try {
            FileOutputStream fos = new FileOutputStream(filepath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(emp1);
            oos.writeObject(emp2);
            System.out.println("Employee object serialized and saved to " + filepath);
        } catch (Exception e) {
            System.out.println("Error during serialization : " + e.getMessage());
        }
        // deserialization
        // reading
        try {
            FileInputStream fis = new FileInputStream(filepath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employee deserializedEmp1 = (Employee) ois.readObject();
            Employee deserializedEmp2 = (Employee) ois.readObject();

            System.out.println("Employee object deserialized : " + deserializedEmp1);
            System.out.println("Employee object deserialized : " + deserializedEmp2);
        } catch (Exception e) {
            System.out.println("Error during deserialization " + e.getMessage());
        }
    }
}

class Employee implements Serializable {
    private String name;
    private double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Name : " + name + ", Salary : " + salary;
    }
}