package chapter6.threads;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: Philosopher
 * Date: 2017-06-12
 * Time: 오후 2:08
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Philosopher {
    private Lock leftFork;
    private Lock rightFork;
    private String name;

    public Philosopher(Lock leftFork, Lock rightFork, String name) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
        this.name = name;
    }

    public void think() {
        System.out.println(name + " is thinking...");
    }

    public void eat() {
        if (leftFork.tryLock()) {
            try {
                if (rightFork.tryLock()) {
                    try {

                        System.out.println(name + " is eating...");
                    } finally {
                        rightFork.unlock();
                    }
                }
            } finally {
                leftFork.unlock();
            }

        }
    }
}
