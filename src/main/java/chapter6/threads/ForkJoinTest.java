package chapter6.threads;

import java.util.concurrent.ForkJoinPool;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: ForkJoinTest
 * Date: 2017-06-14
 * Time: 오후 3:22
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ForkJoinTest {
    public static void main(String[] args) {
        // Create a ForkJoinPool to run the task
        ForkJoinPool pool = new ForkJoinPool();
        // Create an instance of the task
        RandomIntSum task = new RandomIntSum(3);
        // Run the task
        long sum = pool.invoke(task);
        System.out.println("Sum is " + sum);
    }
}
