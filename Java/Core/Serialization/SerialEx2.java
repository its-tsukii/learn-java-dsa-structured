package Java.Core.Serialization;

import java.io.*;

public class SerialEx2 {
    public static void main(String[] args) {
        String filepath = "Employeeser.txt";

        // serialization
        // writing
        Employee1 emp1 = new Employee1("Arun", 50000.0);
        Employee1 emp2 = new Employee1("Varun", 70000.0);

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
            Employee1 deserializedEmp1 = (Employee1) ois.readObject();
            Employee1 deserializedEmp2 = (Employee1) ois.readObject();

            System.out.println("Employee object deserialized : " + deserializedEmp1);
            System.out.println("Employee object deserialized : " + deserializedEmp2);
        } catch (Exception e) {
            System.out.println("Error during deserialization " + e.getMessage());
        }
    }
}

class Employee1 implements Serializable {
    private String name;
    private transient double salary;

    public Employee1(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject(); // write default serialized fields
        out.writeDouble(salary); // write salary manually
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject(); // write default serialized fields
        salary = in.readDouble(); // write salary manually
    }

    @Override
    public String toString() {
        return "Name : " + name + ", Salary : " + salary;
    }
}

// transit variables are not serialized but the object will be serialized but
// the variables will not be serialized