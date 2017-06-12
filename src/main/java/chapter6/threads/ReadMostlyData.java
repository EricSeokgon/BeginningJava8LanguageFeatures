package chapter6.threads;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: ReadMostlyData
 * Date: 2017-06-12
 * Time: 오후 2:15
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ReadMostlyData {
    private int value;
    private ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();
    private Lock rLock = (Lock) rwLock.readLock();
    private Lock wLock = (Lock) rwLock.writeLock();

    public ReadMostlyData(int value) {
        this.value = value;
    }

    public int getValue() {
        rLock.lock();
        try {
            return value;
        } finally {
            rLock.unlock();
        }
    }

    public void setValue(int value) {
        wLock.lock();
        try {
            this.value = value;
        }finally {
            wLock.unlock();
        }
    }
}
