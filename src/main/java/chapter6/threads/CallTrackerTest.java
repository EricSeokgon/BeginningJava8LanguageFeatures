package chapter6.threads;

import java.util.Random;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: CallTrackerTest
 * Date: 2017-06-14
 * Time: 오후 4:34
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class CallTrackerTest {
    public static void main(String[] args) {
        new Thread(CallTrackerTest::run).start();
        new Thread(CallTrackerTest::run).start();
        new Thread(CallTrackerTest::run).start();
    }

    private static void run() {
        Random random = new Random();
        int count = random.nextInt(5) + 1;

        System.out.println(Thread.currentThread().getName() + " generated counter: " + count);
        for (int i = 0; i<count; i++) {
            CallTracker.call();
        }
    }
}
