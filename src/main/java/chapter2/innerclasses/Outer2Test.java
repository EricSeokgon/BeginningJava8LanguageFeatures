package chapter2.innerclasses;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: Outer2Test
 * Date: 2017-03-23
 * Time: 오전 8:37
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Outer2Test {
    public static void main(String[] args) {
        Outer2 out = new Outer2();
        Outer2.Inner2 in = out.new Inner2();
        // Print the value
        out.printValue();
        in.printValue();

        // Set a new value
        out.setValue(828);
        // Print the value
        out.printValue();
        in.printValue();
    }
}

