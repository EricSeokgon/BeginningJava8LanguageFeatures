package chapter7.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: EchoBufferedStdin
 * Date: 2017-06-23
 * Time: 오후 5:26
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class EchoBufferedStdin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text = "q";
        while (true) {
            System.out.println("Please type a message (0/q to quit) " + "and press enter: ");

            text = br.readLine();
            if (text.equalsIgnoreCase("q")) {
                System.out.println("You have decided to exit the program");
                break;
            } else {
                System.out.println("You typed: " + text);
            }
        }
    }
}
