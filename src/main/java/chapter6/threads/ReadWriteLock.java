package chapter6.threads;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: ReadWriteLock
 * Date: 2017-06-12
 * Time: 오후 2:14
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public interface ReadWriteLock {
    Lock readLock();
    Lock writeLock();
}
