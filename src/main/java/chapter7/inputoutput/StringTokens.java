package chapter7.inputoutput;

import java.util.StringTokenizer;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: StringTokens
 * Date: 2017-06-23
 * Time: 오후 5:45
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class StringTokens {
    public static void main(String[] args) {
        String str = "This is a test, which is simple";
        String delimiters = " , ";
        StringTokenizer st = new StringTokenizer(str, delimiters);

        System.out.println("Tokens using a StringTokenizer: ");
        String token = null;
        while (st.hasMoreTokens()) {
            token = st.nextToken();
            System.out.println(token);
        }
        System.out.println("\nTokens using the String.split() method: ");
        String regex = "[ ,]+";
        String[] s = str.split(regex);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
