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
        try{

        } finally {
            myLock.unlock();
        }
    }

}
