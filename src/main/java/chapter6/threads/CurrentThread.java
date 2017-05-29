package chapter6.threads;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: CurrentThread
 * Date: 2017-05-29
 * Time: 오전 9:09
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class CurrentThread extends Thread {
    public CurrentThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        String threadName = t.getName();
        System.out.println("Inside run() method: " + threadName);
    }

    public static void main(String[] args) {
        CurrentThread ct1 = new CurrentThread("First Thread");
        CurrentThread ct2 = new CurrentThread("Second Thread");
        ct1.start();
        ct2.start();
        // Let’s see which thread is executing the following statement
        Thread t = Thread.currentThread();
        String threadName = t.getName();
        System.out.println("Inside main() method: " + threadName);
    }
}
