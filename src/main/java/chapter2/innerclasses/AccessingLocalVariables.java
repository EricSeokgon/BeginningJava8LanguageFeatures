package chapter2.innerclasses;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: AccessingLocalVariables
 * Date: 2017-03-27
 * Time: 오전 8:46
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class AccessingLocalVariables {
    public static void main(String... args) {
        int x = 100;
        final int y = 200;
        class LocalInner {
            void print() {
                // Accessing the local varibale x is fine as
                // it is effectively final.
                System.out.println("x = " + x);
                // The local variable y is effectively final as
                // it has been declared final.
                System.out.println("y = " + y);
            }
        }
        /* Uncommenting the following statement will make the variable x no longer
           an effectively final variable and the LocalIneer class wil not compile.
        */
        // x = 100;
        LocalInner li = new LocalInner();
        li.print();
    }
}
