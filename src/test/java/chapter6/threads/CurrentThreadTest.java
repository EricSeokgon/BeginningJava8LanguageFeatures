package chapter6.threads;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: CurrentThreadTest
 * Date: 2017-05-29
 * Time: 오전 9:13
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class CurrentThreadTest {

    @Test
    public void currentThreadTest() {
        CurrentThread ct1 = new CurrentThread("First Thread");
        CurrentThread ct2 = new CurrentThread("Second Thread");
        ct1.start();
        ct2.start();
        // Let’s see which thread is executing the following statement
        Thread t = Thread.currentThread();
        String threadName = t.getName();
        System.out.println("Inside main() method: " + threadName);
        assertThat(threadName, is("main"));
    }

}