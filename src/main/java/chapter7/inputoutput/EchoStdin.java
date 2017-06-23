package chapter7.inputoutput;

import java.io.IOException;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: EchoStdin
 * Date: 2017-06-23
 * Time: 오후 5:21
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class EchoStdin {
    public static void main(String[] args) throws IOException {
        System.out.println("Please type a message and press enter: ");
        int c = '\n';
        while ((c = System.in.read()) != '\n') {
            System.out.println();
        }

    }
}
