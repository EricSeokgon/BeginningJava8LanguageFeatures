package chapter6.threads;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: AtomicCounter
 * Date: 2017-06-12
 * Time: 오전 11:39
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class AtomicCounter {
    private AtomicLong value = new AtomicLong(0);
    public long next() {
        return value.incrementAndGet();
    }
}
