package chapter6.threads;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: MeetAtBarrier
 * Date: 2017-06-13
 * Time: 오전 10:46
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class MeetAtBarrier extends Thread {
    private CyclicBarrier barrier;
    private int ID;
    private static Random random = new Random();

    public MeetAtBarrier(int ID, CyclicBarrier barrier) {
        this.ID = ID;
        this.barrier = barrier;
    }

    public void run() {
        try {
            // Generate a random number between 1 and 30 to wait
            int workTime = random.nextInt(30) + 1;
            System.out.println("Thread #" + ID + " is going to work for " +
                workTime + " seconds");
            // Yes. Sleeping is working for this thread!!!
            Thread.sleep(workTime * 1000);
            System.out.println("Thread #" + ID + " is waiting at the barrier...");
            // Wait at barrier for other threads in group to arrive
            this.barrier.await();
            System.out.println("Thread #" + ID + " passed the barrier...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            System.out.println("Barrier is broken...");
        }
    }

    public static void main(String[] args) {
        // Create a barrier for a group of three threads with a barrier action
        Runnable barrierAction
            = () -> System.out.println("We are all together. It's party time...");
        CyclicBarrier barrier = new CyclicBarrier(3, barrierAction);
        for (int i = 1; i <= 3; i++) {
            MeetAtBarrier t = new MeetAtBarrier(i, barrier);
            t.start();
        }
    }
}
