package chapter6.threads;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: PrinterThread
 * Date: 2017-05-23
 * Time: 오전 8:59
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class PrinterThread {
    public static void main(String[] args) {
        // Create a Thread object
        Thread t = new Thread(PrinterThread::print);
        // Start the thread
        t.start();
    }
    public static void print() {
        for (int i = 1; i <= 500; i++) {
            System.out.print(i + " ");
        }
    }
}
