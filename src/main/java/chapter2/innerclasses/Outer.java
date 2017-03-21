package chapter2.innerclasses;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: Outer
 * Date: 2017-03-14
 * Time: 오후 3:33
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Outer {
    private int value;

    public void printValue() {
    }

    public void setValue(int value) {
        this.value = value;
    }

    public class Inner {
        public void printValue() {
        }
    }
}
