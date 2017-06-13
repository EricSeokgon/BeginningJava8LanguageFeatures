package chapter6.threads;

import java.util.Random;
import java.util.concurrent.Phaser;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: StartTogetherTask
 * Date: 2017-06-13
 * Time: 오전 11:34
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class StartTogetherTask extends Thread {
    private Phaser phaser;
    private String taskName;
    private static Random rand = new Random();

    public StartTogetherTask(String taskName, Phaser phaser) {
        this.taskName = taskName;
        this.phaser = phaser;
    }

    @Override
    public void run() {
        System.out.println(taskName + ":Initializing...");

        int sleepTime = rand.nextInt(5) + 1;
        try {
            Thread.sleep(sleepTime * 1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(taskName + ":Initialized...");
        phaser.arriveAndAwaitAdvance();
        System.out.println(taskName + ":Started...");
    }
}
