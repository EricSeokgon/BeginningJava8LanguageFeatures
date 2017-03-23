package chapter2.innerclasses;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: QualifiedThis
 * Date: 2017-03-23
 * Time: 오후 1:31
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class QualifiedThis {
    private int value = 828;
    public void printValue() {
        System.out.println("value = " + value);
        System.out.println("this.value = " + this.value);
        System.out.println("QualifiedThis.this.value= " + QualifiedThis.this.value);
    }
}
