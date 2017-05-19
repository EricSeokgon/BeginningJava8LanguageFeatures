package chapter6.threads;

/**
 * Created by hadeslee on 2017-05-20.
 */
public class MyThreadClass extends Thread {
    @Override
    public void run() {
        System.out.println("Hello Java thread!");
    }
// More code goes here
}
