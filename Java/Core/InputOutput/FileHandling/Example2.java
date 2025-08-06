package Java.Core.InputOutput.FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Example2 {
    public static void main(String[] args) throws IOException {
        var fout = new FileOutputStream("output.txt", true); // by default its false it only says if to append or not to
                                                             // the file
        var pout = new PrintWriter(fout);
        String msg = "hello world";
        pout.println(msg);
        pout.close();
    }
}
