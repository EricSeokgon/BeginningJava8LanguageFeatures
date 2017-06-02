package chapter6.threads;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: ThreadState
 * Date: 2017-06-02
 * Time: 오전 11:46
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ThreadState extends Thread {
    private boolean keepRunning = true;
    private boolean wait = false;
    private Object syncObject = null;

    public ThreadState(Object syncObject) {
        this.syncObject = syncObject;
    }

    public void run() {
        while (keepRunning) {
            synchronized (syncObject) {
                if (wait) {
                    try {
                        syncObject.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public void setKeepRunning(boolean keepRunning) {
        this.keepRunning = keepRunning;
    }

    public void setWait(boolean wait) {
        this.wait = wait;
    }
}
