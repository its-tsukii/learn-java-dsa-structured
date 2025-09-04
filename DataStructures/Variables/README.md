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


## Output 
```text
PS D:\internships\personal\java-learning> java D:\internships\personal\java-learning\DataStructures\Variables\Main.java
=== Java Primitives with Memory ===
int: 42 (Size: 32 bits = 4 bytes)
double: 3.14159 (Size: 64 bits = 8 bytes)
float: 2.5 (Size: 32 bits = 4 bytes)
long: 123456789 (Size: 64 bits = 8 bytes)
boolean: true (Size: ~1 byte in arrays/objects)
char: 'A' (Size: 16 bits = 2 bytes)

=== Wrapper Objects and Memory ===
Integer object: 42
Double object: 3.14
Boolean object: true
Approximate memory size:
Integer: ~16-24 bytes (object header + 4 bytes value)
Double: ~24 bytes
Boolean: ~16 bytes

=== String and StringBuffer ===
String: "Hello World"
Each character: 2 bytes (Unicode), total: 22 bytes + object overhead
StringBuffer: Java is cool
Mutable string, size = character array + object overhead

=== Character & ASCII Table ===
Character: 'G' -> ASCII: 71

--- ASCII A-Z ---
'A' = 65
'B' = 66
'C' = 67
'D' = 68
'E' = 69
'F' = 70
'G' = 71
'H' = 72
'I' = 73
'J' = 74
'K' = 75
'L' = 76
'M' = 77
'N' = 78
'O' = 79
'P' = 80
'Q' = 81
'R' = 82
'S' = 83
'T' = 84
'U' = 85
'V' = 86
'W' = 87
'X' = 88
'Y' = 89
'Z' = 90

--- ASCII a-z ---
'a' = 97
'b' = 98
'c' = 99
'd' = 100
'e' = 101
'f' = 102
'g' = 103
'h' = 104
'i' = 105
'j' = 106
'k' = 107
'l' = 108
'm' = 109
'n' = 110
'o' = 111
'p' = 112
'q' = 113
'r' = 114
's' = 115
't' = 116
'u' = 117
'v' = 118
'w' = 119
'x' = 120
'y' = 121
'z' = 122

=== Character Utility Methods ===
isDigit('8') = true
isLetter('A') = true
isLetterOrDigit('!') = false
isWhitespace(' ') = true
toUpperCase('x') = X
toLowerCase('J') = j

=== Type Conversion / Parsing ===
Parsed int: 123
Parsed double: 45.67
Parsed boolean: true
int to String: 100
Casted double to int (9.99 -> 9)

=== Null Character (\0) ===
Null char: '' (ASCII: 0)

=== Object Comparison ===
Integer a == b? false
Integer a.equals(b)? true
Integer c == d (within cache)? true
```