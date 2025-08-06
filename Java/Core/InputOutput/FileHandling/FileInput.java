package Java.Core.InputOutput.FileHandling;

import java.io.FileInputStream;
import java.util.Scanner;

public class FileInput {
    public static void main(String[] args) {
        try {
            var fin = new FileInputStream("data.txt");
            var scin = new Scanner(fin);
            // var scin = new Scanner(new FileInputStream("data.txt"));
            while (scin.hasNext() == true) {
                String line = scin.next();
                System.out.println(line);
            }
        } catch (Exception e) {
        }
    }
}
