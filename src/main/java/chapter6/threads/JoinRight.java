package chapter6.threads;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: JoinRight
 * Date: 2017-06-01
 * Time: 오전 9:24
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class JoinRight {
    public static void main(String[] args) {
        Thread t1 = new Thread(JoinRight::print);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void print() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Counter: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
