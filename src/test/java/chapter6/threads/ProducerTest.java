package chapter6.threads;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by hadeslee on 2017-05-28.
 */
public class ProducerTest {
    @Test
    public void producerTest() {
        // Create Buffer, Producer and Consumer objects
        Buffer buffer = new Buffer();
        Producer p = new Producer(buffer);
        Consumer c = new Consumer(buffer);
        // Start the producer and consumer threads
        p.start();
        c.start();
    }

}