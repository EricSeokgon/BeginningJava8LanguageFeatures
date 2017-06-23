package chapter7.inputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: CustomStdOut
 * Date: 2017-06-23
 * Time: 오전 10:50
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class CustomStdOut {
    public static void main(String[] args) throws FileNotFoundException {
        // Create a PrintStream for file stdout.txt
        File outFile = new File("stdout.txt");
        PrintStream ps = new PrintStream(new FileOutputStream(outFile));
        //Print a message on console
        System.out.println("Messages will be redirected to " +
            outFile.getAbsolutePath());
        // Set the standard out to the file
        System.setOut(ps);
        // The following messages will be sent to the stdout.txt file
        System.out.println("Hello world!");
        System.out.println("Java I/O is cool!");
    }
}
