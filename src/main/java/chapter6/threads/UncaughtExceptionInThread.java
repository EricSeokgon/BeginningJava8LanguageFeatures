package chapter6.threads;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: UncaughtExceptionInThread
 * Date: 2017-06-12
 * Time: 오전 10:56
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class UncaughtExceptionInThread {
    public static void main(String[] args) {
        CatchAllThreadExceptionHandler handler = new CatchAllThreadExceptionHandler();
        // Set an uncaught exception handler for main thread
        Thread.currentThread().setUncaughtExceptionHandler(handler);
        // Throw an exception
        throw new RuntimeException();
    }
}
