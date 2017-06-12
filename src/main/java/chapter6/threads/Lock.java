package chapter6.threads;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: Lock
 * Date: 2017-06-12
 * Time: 오전 11:41
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public interface Lock {
    void lock();

    Condition newCondition();

    void lockInterruptibly() throws InterruptedException;

    boolean tryLock();

    boolean tryLock(long time, TimeUnit unit) throws InterruptedException;

    void unlock();


}
