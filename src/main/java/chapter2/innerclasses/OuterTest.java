package chapter2.innerclasses;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: OuterTest
 * Date: 2017-03-21
 * Time: 오후 1:43
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class OuterTest {
    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner in = out.new Inner();

        //Print the value
        out.printValue();

        //Set a new value
        out.setValue(282);

        //Print the value
        out.printValue();
        in.printValue();
    }
}
