package chapter6.threads;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: DaemonThread
 * Date: 2017-06-05
 * Time: 오전 9:12
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class DaemonThread {
    public static void main(String[] args) {
        Thread t = new Thread(DaemonThread::print);
        t.setDaemon(true);
        t.start();
        System.out.println("Exiting main method");
    }

    public static void print() {
        int counter = 1;
        while (true) {
            try {
                System.out.println("Counter:" + counter++);
                Thread.sleep(2000); // sleep for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
