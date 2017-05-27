package chapter6.threads;

/**
 * Created by hadeslee on 2017-05-28.
 */
public class Consumer extends Thread {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        int data;
        while (true) {
            // Consume the data from the buffer. We are not using the consumed
            // data for any other puporse here
            data = buffer.consume();
        }
    }
}
