package chapter5.lambda;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: TargetTypeTest
 * Date: 2017-04-26
 * Time: 오전 9:19
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class TargetTypeTest {
    public static void main(String[] args) {
        // Creates an Adder using a lambda expression
        Adder adder = (x, y) -> x + y;
        // Creates a Joiner using a lambda expression
        Joiner joiner = (x, y) -> x + y;
        // Adds two doubles
        double sum1 = adder.add(10.34, 89.11);
        // Adds two ints
        double sum2 = adder.add(10, 89);
        // Joins two strings
        String str = joiner.join("Hello", " lambda");
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
        System.out.println("str = " + str);
    }
}
