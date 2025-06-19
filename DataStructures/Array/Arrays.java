package DataStructures.Array;

public class Arrays {

    static void ArrayClass() {

        // Creating new arrays
        int nums[] = { 1, 2, 3, 4, 5 };
        int arr[] = new int[6];

        // printing the arrays
        System.out.println(java.util.Arrays.toString(nums));
        System.out.println(nums[1]);
        System.out.println(java.util.Arrays.toString(arr));

        // replace the elements
        nums[1] = 6;
        nums[3] = 8;
        System.out.println(java.util.Arrays.toString(nums));

        // printing using loop
        for (var each : nums) {
            System.out.print(each);
            System.out.print(' ');
        }
        System.out.println();
    }

    static void MultiArray() {
        int nums2[][] = new int[3][4];

        for (int i = 0; i < nums2.length; i++) {

            System.out.println();

            for (int j = 0; j < nums2.length; j++) {

                System.out.print(nums2[i][j]);
                System.out.print(' ');
            }
        }
    }

    static void Random() {
        int nums3[][] = new int[7][7];
        for (int i = 0; i < nums3.length; i++) {

            System.out.println();

            for (int j = 0; j < nums3.length; j++) {
                nums3[i][j] = (int) (Math.random() * 10);

                System.out.print(nums3[i][j] + " ");
            }
        }
    }

    static void enhancedLoops() {
        int nums3[][] = new int[7][7];

        for (int i = 0; i < nums3.length; i++) {

            for (int j = 0; j < nums3.length; j++) {
                nums3[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int n[] : nums3) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }

    static class Student {
        int rollno;
        String name;
        int marks;
    }

    public static void main(String[] args) {

        ArrayClass();
        /*
         * This Involves array creation these are 1d arrays and thus can be handled
         * easily
         */
        MultiArray();
        /*
         * This involves array creation that are oa little more complex these are multi
         * dimensional arrays they can be of any dimensions such [3][4]
         */
        System.out.println();

        Random();
        /*
         * this involves the use Math.random() to populate the elements in the
         * multi-dimensional arrays
         */
        enhancedLoops();
        /* this involves the use of high end loops syntax to be used */

        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Harsh";
        s1.marks = 97;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "kiran";
        s2.marks = 87;

        Student s3 = new Student();
        s3.rollno = 1;
        s3.name = "Shruti";
        s3.marks = 89;

        Student student[] = new Student[3]; // we are creating an array that can hold student references
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        for (var stud : student) {
            System.out.println(stud); // this would print the address , we would have to iterate over the stud with
                                      // its traits
        }

        for (var stud : student) {
            System.out.println("rollno:" + stud.rollno);
            System.out.println("name:" + stud.name);
            System.out.println("marks:" + stud.marks);
        }

        // concatanation
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].name + " : " + student[i].marks);
        }
    }
}