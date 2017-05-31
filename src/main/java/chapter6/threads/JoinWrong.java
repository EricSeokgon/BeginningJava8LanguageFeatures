package chapter6.threads;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: JoinWrong
 * Date: 2017-05-31
 * Time: 오전 9:25
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class JoinWrong {
    public static void main(String[] args) {
        Thread t1 = new Thread(JoinWrong::print);
        t1.start();
        System.out.println("We are done");
    }

    public static void print() {
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println("Counter: " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
