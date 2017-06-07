package chapter6.threads;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: SimpleInterrupt
 * Date: 2017-06-07
 * Time: 오전 9:25
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class SimpleInterrupt {
    public static void main(String[] args) {
        System.out.println("#1:" + Thread.interrupted());
        // Now interrupt the main thread
        Thread.currentThread().interrupt();
        // Check if it has been interrupted
        System.out.println("#2:" + Thread.interrupted());
        // Check again if it has been interrupted
        System.out.println("#3:" + Thread.interrupted());
    }
}
