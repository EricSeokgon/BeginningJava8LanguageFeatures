package chapter12.Clooections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: PriorityQueueComparatorTest
 * Date: 2017-08-16
 * Time: 오전 8:33
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class PriorityQueueComparatorTest {
    public static void main(String[] args) {
        int initialCapacity = 5;
        Comparator<ComparablePerson> nameComparator =
            Comparator.comparing(ComparablePerson::getName);
        Queue<ComparablePerson> pq =
            new PriorityQueue<>(initialCapacity, nameComparator);
        pq.add(new ComparablePerson(1, "John"));
        pq.add(new ComparablePerson(4, "Ken"));
        pq.add(new ComparablePerson(2, "Richard"));
        pq.add(new ComparablePerson(3, "Donna"));
        pq.add(new ComparablePerson(4, "Adam"));
        System.out.println("Priority queue: " + pq);
        while (pq.peek() != null) {
            System.out.println("Head Element: " + pq.peek());
            pq.remove();
            System.out.println("Removed one element from Queue");
            System.out.println("Priority queue: " + pq);
        }
    }
}
