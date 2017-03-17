package chapter2.innerclasses;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: LocalInnerTest
 * Date: 2017-03-17
 * Time: 오전 11:03
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class LocalInnerTest {
    public static void main(String[] args) {
        // Generate random integers using the RandomInteger class
        RandomInteger rTop = new RandomInteger();
        System.out.println("Random integers using Top-level class:");
        System.out.println(rTop.getValue());
        System.out.println(rTop.getValue());
        System.out.println(rTop.getValue());
        // Generate random integers using the RandomIntegerLocal class
        RandomLocal local = new RandomLocal();
        RandomInteger rLocal = local.getRandomInteger();
        System.out.println("\nRandom integers using local inner class:");
        System.out.println(rLocal.getValue());
        System.out.println(rLocal.getValue());
        System.out.println(rLocal.getValue());
    }
}
