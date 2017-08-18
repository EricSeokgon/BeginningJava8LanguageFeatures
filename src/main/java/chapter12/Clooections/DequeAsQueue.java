package chapter12.Clooections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: DequeAsQueue
 * Date: 2017-08-17
 * Time: 오전 9:37
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class DequeAsQueue {
    public static void main(String[] args) {
        // Create a Deque and add elements at its tail using
        // addLast() or offerLast() method
        Deque<String> deque = new LinkedList<>();
        deque.addLast("John");
        deque.offerLast("Richard");
        deque.offerLast("Donna");
        deque.offerLast("Ken");
        System.out.println("Deque: " + deque);
        // Let's remove elements from the Deque until it is empty
        while (deque.peekFirst() != null) {
            System.out.println("Head Element: " + deque.peekFirst());
            deque.removeFirst();
            System.out.println("Removed one element from Deque");
            System.out.println("Deque: " + deque);
        }
        // Now, the Deque is empty. Try to call its peekFirst(),
        // getFirst(), pollFirst() and removeFirst() methods
        System.out.println("deque.isEmpty(): " + deque.isEmpty());
        System.out.println("deque.peekFirst(): " + deque.peekFirst());
        System.out.println("deque.pollFirst(): " + deque.pollFirst());
        try {
            String str = deque.getFirst();
            System.out.println("deque.getFirst(): " + str);
        } catch (NoSuchElementException e) {
            System.out.println("deque.getFirst(): Deque is empty.");
        }
        try {
            String str = deque.removeFirst();
            System.out.println("deque.removeFirst(): " + str);
        } catch (NoSuchElementException e) {
            System.out.println("deque.removeFirst(): Deque is empty.");
        }
    }
}
