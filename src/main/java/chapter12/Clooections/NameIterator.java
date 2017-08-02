package chapter12.Clooections;

import java.util.ArrayList;
import java.util.List;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: NameIterator
 * Date: 2017-08-02
 * Time: 오전 9:00
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class NameIterator {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> names = new ArrayList<>();
        // Add some names to the list
        names.add("Ken");
        names.add("Lee");
        names.add("Joe");
        // Print all elements of the names list
        names.iterator()
            .forEachRemaining(System.out::println);
    }
}
