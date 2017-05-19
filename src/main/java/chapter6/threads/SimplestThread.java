package chapter6.threads;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: SimplestThread
 * Date: 2017-05-19
 * Time: 오전 9:47
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class SimplestThread {
    public static void main(String[] args) {
        // Creates a thread object
        Thread simplestThread = new Thread();
        // Starts the thread
        simplestThread.start();
    }
}
