package chapter7.inputoutput;

import java.io.PrintStream;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: SwallowOutput
 * Date: 2017-06-23
 * Time: 오전 11:00
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class SwallowOutput {
    public static void main(String[] args) {
        PrintStream ps = new PrintStream(new DummyStandardOutput());
        // Set the dummy standard output
        System.setOut(ps);
        // The following messages are not going anywhere
        System.out.println("Hello world!");
        System.out.println("Is someone listening?");
        System.out.println("No. We are all taking a nap!!!");
    }
}
