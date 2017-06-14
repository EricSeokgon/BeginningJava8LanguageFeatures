package chapter6.threads;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: SleepingTask
 * Date: 2017-06-13
 * Time: 오후 5:46
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class SleepingTask implements Callable<TaskResult> {
    private int taskId;
    private int loopCounter;
    private Random random = new Random();

    public SleepingTask(int taskId, int loopCounter) {
        this.taskId = taskId;
        this.loopCounter = loopCounter;
    }

    public TaskResult call() throws InterruptedException {
        int totalSleepTime = 0;

        for (int i = 0; i <= loopCounter; i++) {
            try {
                int sleepTime = random.nextInt(10) + 1;
                System.out.println("Task #" + this.taskId + " - Iteration #" + i
                    + " is going to sleep for " + sleepTime + " seconds.");
                Thread.sleep(sleepTime * 1000);
                totalSleepTime = totalSleepTime + sleepTime;
            } catch (InterruptedException e) {
                System.out.println("Task #" + this.taskId +
                    " has been interupted.");
                throw e;
            }
        }
        return new TaskResult(taskId, totalSleepTime);
    }
}
