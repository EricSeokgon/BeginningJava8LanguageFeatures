package chapter6.threads;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: DefaultThreadGroup
 * Date: 2017-06-08
 * Time: 오후 5:40
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class DefaultThreadGroup {
    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();

        ThreadGroup tg1 = t1.getThreadGroup();

        System.out.println("Current thread's name  : " + t1.getName());
        System.out.println("Current thread's group name : " + tg1.getName());

        Thread t2 = new Thread("my new thread");

        ThreadGroup tg2 = t2.getThreadGroup();
        System.out.println("New thread's name :" + t2.getName());
        System.out.println("New thread's group name : " + tg2.getName());
    }
}
