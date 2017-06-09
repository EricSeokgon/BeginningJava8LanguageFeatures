package chapter6.threads;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: VolatileVariable
 * Date: 2017-06-09
 * Time: 오전 11:47
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class VolatileVariable extends Thread {
    private volatile boolean keepRunning = true;

    public void run() {
        System.out.println("Thread started...");

        while (keepRunning) {
            try {
                System.out.println("Going to sleep ...");
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread stopped...");
    }

    public void stopThread() {
        this.keepRunning = false;
    }

    public static void main(String[] args) {
        VolatileVariable vv = new VolatileVariable();
        vv.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Going to set the stop flag to true...");
        vv.stopThread();
    }
}
