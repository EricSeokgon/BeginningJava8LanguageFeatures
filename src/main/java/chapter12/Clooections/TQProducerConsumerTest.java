package chapter12.Clooections;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: TQProducerConsumerTest
 * Date: 2017-08-25
 * Time: 오전 10:11
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class TQProducerConsumerTest {
    public static void main(String[] args) {
        final TransferQueue<Integer> tQueue = new LinkedTransferQueue<>();
        final AtomicInteger sequence = new AtomicInteger();
// Initialize transfer queue with five items
        for(int i = 0; i < 5; i++) {
            try {
                tQueue.put(sequence.incrementAndGet());
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Initial queue: " + tQueue);
// Create and start a producer and a consumer
        new TQProducer("Producer-1", tQueue, sequence).start();
        new TQConsumer("Consumer-1", tQueue).start();
    }
}
