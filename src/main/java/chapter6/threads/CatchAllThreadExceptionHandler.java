package chapter6.threads;

/**
 * Created by hadeslee on 2017-06-11.
 */
public class CatchAllThreadExceptionHandler implements Thread.UncaughtExceptionHandler {
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("Caught Exception from Thread:" + t.getName());
    }
}
