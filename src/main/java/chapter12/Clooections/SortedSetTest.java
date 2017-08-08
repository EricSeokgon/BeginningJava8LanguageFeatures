package chapter12.Clooections;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: SortedSetTest
 * Date: 2017-08-08
 * Time: 오전 9:19
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class SortedSetTest {
    public static void main(String[] args) {
            // Create a sorted set of some names
            SortedSet<String> sortedNames = new TreeSet<>();
            sortedNames.add("John");
            sortedNames.add("Adam");
            sortedNames.add("Eve");
            sortedNames.add("Donna");
            // Print the sorted set of names
            System.out.println(sortedNames);
    }
}
