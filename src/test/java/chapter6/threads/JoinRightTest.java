package chapter6.threads;

import org.junit.Test;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: JoinRightTest
 * Date: 2017-06-01
 * Time: 오전 9:44
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class JoinRightTest {
    @Test
    public void JoinRightTest() {
        Thread t1 = new Thread(JoinRight::print);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}