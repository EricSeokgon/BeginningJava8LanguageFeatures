package chapter4.generics;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: GenericsRuntimeClassTest
 * Date: 2017-04-24
 * Time: 오전 10:26
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class GenericsRuntimeClassTest {
    public static void main(String[] args) {
        Wrapper<String> a = new Wrapper<String>("Hello");
        Wrapper<Integer> b = new Wrapper<Integer>(new Integer(123));
        Class aClass = a.getClass();
        Class bClass = b.getClass();
        System.out.println("Class for a: " + aClass.getName());
        System.out.println("Class for b: " + bClass.getName());
        System.out.println("aClass == bClass: " + (aClass == bClass));
    }
}
