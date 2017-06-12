package chapter6.threads;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: SimpleExplicitLock
 * Date: 2017-06-12
 * Time: 오전 11:44
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class SimpleExplicitLock {
    private Lock myLock = (Lock) new ReentrantLock();

    public void updateesource() {
        myLock.lock();
        try {
            // Logic for updating/reading the shared resource goes here
        } finally {
            // Release the lock
            myLock.unlock();
        }
    }

    public void updateResource() {
        // Acquire the lock and the lock will be released automatically by the
        // JVM when your code exits the block
        synchronized (this) {
            // Logic for updating/reading the shared resource goes here
        }
    }

}
