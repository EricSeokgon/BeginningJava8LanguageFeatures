package chapter6.threads;

import java.util.Random;

/**
 * Created by hadeslee on 2017-05-27.
 */
public class Producer extends Thread {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        Random rand = new Random();
        while (true) {
            // Generate a random integer and store it in the buffer
            int n = rand.nextInt();
            buffer.produce(n);
        }
    }
}
