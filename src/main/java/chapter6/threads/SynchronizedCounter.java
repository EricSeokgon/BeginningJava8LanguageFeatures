package chapter6.threads;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: SynchronizedCounter
 * Date: 2017-06-12
 * Time: 오전 11:37
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class SynchronizedCounter {
    private long value;

    public synchronized long next() {
        return ++value;
    }
}
