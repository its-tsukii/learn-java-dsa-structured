package Java.Core.InputOutput.FileHandling;

import java.io.*;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) throws IOException {
        try {
            var in = new Scanner(new FileInputStream("infile.txt"));
            var out = new PrintWriter(new FileOutputStream("outfile.txt"));

            while (in.hasNext()) {
                String line = in.nextLine();
                out.println(line);
            }
            in.close();
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("input file not found");
        }
    }
}
