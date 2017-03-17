package chapter2.innerclasses;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: SomeTopLevelClass
 * Date: 2017-03-15
 * Time: 오전 9:21
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class SomeTopLevelClass {
    // Some code for SomeTopLevelClass goes here
    public void someMethod() {
        class SomeLocalInnerClass {
            // Some code for SomeLocalInnerClass goes here
        }
        // SomeLocalInnerClass can only be used here
    }
}
