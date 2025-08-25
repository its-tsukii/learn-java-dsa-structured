# Arrays in Java – Practical Usage and Examples

This document explains the practical usage of arrays in Java as illustrated in the `DataStructures.Array.Arrays` class. It covers array creation, manipulation, iteration, multidimensional arrays, random population, enhanced loops, and storing object references.

---

## 1. Array Creation and Manipulation

- **One-dimensional arrays** can be created and initialized as follows:
    ```java
    int nums[] = { 1, 2, 3, 4, 5 };
    int arr[] = new int[6]; // Initialized with default values (0)
    ```
- **Printing and accessing elements:**
    ```java
    System.out.println(java.util.Arrays.toString(nums)); // Prints array
    System.out.println(nums[1]); // Accesses element at index 1
    ```
- **Updating elements:**
    ```java
    nums[1] = 6;
    nums[3] = 8;
    ```
- **Iterating using enhanced for loop:**
    ```java
    for (var each : nums) {
        System.out.print(each + " ");
    }
    ```

---

## 2. Multidimensional Arrays

- **Creation:**
    ```java
    int nums2[][] = new int[3][4]; // 3 rows, 4 columns
    ```
- **Access and iteration:**
    ```java
    for (int i = 0; i < nums2.length; i++) {
        for (int j = 0; j < nums2.length; j++) {
            System.out.print(nums2[i][j] + " ");
        }
        System.out.println();
    }
    ```

---

## 3. Populating Arrays with Random Numbers

- **Using Math.random():**
    ```java
    int nums3[][] = new int[7][7];
    for (int i = 0; i < nums3.length; i++) {
        for (int j = 0; j < nums3.length; j++) {
            nums3[i][j] = (int) (Math.random() * 10);
            System.out.print(nums3[i][j] + " ");
        }
        System.out.println();
    }
    ```

---

## 4. Enhanced For Loops with Multidimensional Arrays

- **Filling and printing:**
    ```java
    for (int n[] : nums3) {
        for (int m : n) {
            System.out.print(m + " ");
        }
        System.out.println();
    }
    ```

---

## 5. Arrays of Objects

- **Defining a class:**
    ```java
    static class Student {
        int rollno;
        String name;
        int marks;
    }
    ```
- **Creating and storing object references in an array:**
    ```java
    Student[] student = new Student[3];
    student[0] = s1;
    student[1] = s2;
    student[2] = s3;
    ```
- **Iterating and accessing object fields:**
    ```java
    for (var stud : student) {
        System.out.println("rollno:" + stud.rollno);
        System.out.println("name:" + stud.name);
        System.out.println("marks:" + stud.marks);
    }
    ```

---

## 6. Additional Notes

- Printing an object reference in Java (like `System.out.println(stud);`) displays its memory address unless `toString()` is overridden.
- Arrays can store any type – primitives or objects.
- Use enhanced for loops for cleaner, more readable code.
- Arrays in Java are zero-indexed.
- Multidimensional arrays in Java are arrays of arrays.

---

## Example Output

```
[1, 2, 3, 4, 5]
2
[0, 0, 0, 0, 0, 0]
[1, 6, 3, 8, 5]
1 6 3 8 5 
// ... (Multidimensional arrays printed)
rollno:1
name:Harsh
marks:97
rollno:2
name:kiran
marks:87
rollno:1
name:Shruti
marks:89
Harsh : 97
kiran : 87
Shruti : 89
```

---

## References

- [Java Arrays – Official Documentation](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html)
- [Arrays in Java – GeeksforGeeks](https://www.geeksforgeeks.org/arrays-in-java/)
