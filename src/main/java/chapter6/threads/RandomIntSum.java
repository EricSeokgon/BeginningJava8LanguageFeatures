package chapter6.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.RecursiveTask;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: RandomIntSum
 * Date: 2017-06-14
 * Time: 오후 1:29
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class RandomIntSum extends RecursiveTask<Long> {
    private static Random randGenerator = new Random();
    private int count;

    public RandomIntSum(int count) {
        this.count = count;
    }

    @Override
    protected Long compute() {
        long result = 0;

        if (this.count <= 0) {
            return 0L;
        }

        if (this.count == 1) {
            return Long.valueOf(this.getRandomInteger());
        }

        List<RecursiveTask<Long>> forks = new ArrayList<>();

        for (int i = 0; i < this.count; i++) {
            RandomIntSum subTask = new RandomIntSum(1);
            subTask.fork();

            forks.add(subTask);
        }

        for (RecursiveTask<Long> subTask : forks) {
            result = result + subTask.join();
        }
        return result;
    }

    public int getRandomInteger() {
        int n = randGenerator.nextInt(100) + 1;
        return n;
    }
}
