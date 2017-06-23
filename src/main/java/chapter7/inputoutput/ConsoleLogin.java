package chapter7.inputoutput;

import java.io.Console;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: ConsoleLogin
 * Date: 2017-06-23
 * Time: 오후 5:31
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ConsoleLogin {
    public static void main(String[] args) {
        Console console = System.console();
        if (console != null) {
            console.printf("Console is available.%n");
        } else {
            System.out.println("COnsole is not available.%n");
            return;

        }

        String userName = console.readLine("User Name: ");
        char[] passChars = console.readPassword("Password: ");
        String passString = new String(passChars);
        if (passString.equals("letmein")) {
            console.printf("Hello %s", userName);
        } else {
            console.printf("Invlid password");
        }
    }
}
