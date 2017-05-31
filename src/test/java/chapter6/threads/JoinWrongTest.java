package chapter6.threads;

import org.junit.Test;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: JoinWrongTest
 * Date: 2017-05-31
 * Time: 오전 9:28
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class JoinWrongTest {
    @Test
    public void JoinWeongTest() {
        JoinWrong joinWrong = new JoinWrong();
        Thread t1 = new Thread(JoinWrong::print);
        t1.start();
        System.out.println("We are done.");
    }

}