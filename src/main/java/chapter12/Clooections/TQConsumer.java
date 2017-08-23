package chapter12.Clooections;

import java.util.Random;
import java.util.concurrent.TransferQueue;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: TQConsumer
 * Date: 2017-08-24
 * Time: 오전 8:55
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class TQConsumer extends Thread {
    private final String name;
    private final TransferQueue<Integer> tQueue;
    private final Random rand = new Random();
    public TQConsumer(String name, TransferQueue<Integer> tQueue) {
        this.name = name;
        this.tQueue = tQueue;
    }
    @Override
    public void run() {
        while (true) {
            try {
// Sleep for 1 tp 5 random number of seconds
                int sleepTime = rand.nextInt(5) + 1;
                Thread.sleep(sleepTime * 1000);
                int item = tQueue.take();
                System.out.format("%s removed: %d%n", name, item);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
