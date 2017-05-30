package chapter6.threads;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: LetMeSleep
 * Date: 2017-05-30
 * Time: 오전 9:06
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class LetMeSleep {
    public static void main(String[] args) {
        try {
            System.out.println("I am going sleep for 5 seconds.");
            Thread.sleep(5000);
            System.out.println("I woke up.");
        } catch (InterruptedException e) {
            System.out.println("Someone interrupted me in my sleep.");
        }
        System.out.println("I am done.");
    }
}
