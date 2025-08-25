# Variables in Java

A **variable** in Java is a container that holds data that can be changed during the execution of a program. Variables are fundamental to all programming languages and allow programmers to store, retrieve, and manipulate data.

---

## 1. Declaration and Initialization

Variables must first be **declared** (with a type and name) before they can be used. They can be **initialized** (assigned a value) at the time of declaration or later.

```java
// Declaration
int number;

// Initialization
number = 10;

// Declaration and initialization together
int age = 25;
```

---

## 2. Types of Variables

### a. Local Variables
- Declared inside methods, constructors, or blocks.
- Must be initialized before use.
- Scope is limited to the block in which they are declared.

```java
void example() {
    int x = 5; // local variable
    System.out.println(x);
}
```

### b. Instance Variables (Non-static fields)
- Declared inside a class but outside any method.
- Each object of the class has its own copy.
- Initialized to default values if not explicitly set.

```java
class Person {
    String name; // instance variable
    int age;
}
```

### c. Static Variables (Class variables)
- Declared with the static keyword inside a class, but outside any method.
- Shared among all instances of the class.
- Also known as class variables.

```java
class Counter {
    static int count = 0; // static variable
}
```

---

## 3. Variable Naming Rules

- Must begin with a letter, $, or _ (underscore).
- Subsequent characters may also include digits (0-9).
- Cannot be a Java keyword (e.g., int, class, public).
- Java is case sensitive: `Age` and `age` are different variables.

**Examples:**
```java
int age;
double _salary;
String $name;
```

---

## 4. Data Types

Variables in Java must be declared with a data type.

| Primitive Types | Examples                  |
|-----------------|--------------------------|
| byte            | byte b = 10;             |
| short           | short s = 100;           |
| int             | int i = 1000;            |
| long            | long l = 10000L;         |
| float           | float f = 10.5f;         |
| double          | double d = 20.99;        |
| char            | char c = 'A';            |
| boolean         | boolean flag = true;     |

Other types are **reference types** (objects, arrays, etc.).

---

## 5. Default Values

| Type         | Default Value  |
|--------------|---------------|
| byte         | 0             |
| short        | 0             |
| int          | 0             |
| long         | 0L            |
| float        | 0.0f          |
| double       | 0.0d          |
| char         | '\u0000'      |
| boolean      | false         |
| reference    | null          |

**Note:** Local variables do NOT have default values and must be initialized before use.

---

## 6. Examples

```java
public class VariablesDemo {
    static int staticVar = 100;    // static variable
    int instanceVar = 200;         // instance variable

    public void display() {
        int localVar = 300;        // local variable
        System.out.println(staticVar);
        System.out.println(instanceVar);
        System.out.println(localVar);
    }

    public static void main(String[] args) {
        VariablesDemo obj = new VariablesDemo();
        obj.display();
    }
}
```

---

## 7. References

- [Java Variables - Oracle Docs](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html)
- [GeeksforGeeks: Variables in Java](https://www.geeksforgeeks.org/variables-in-java/)
