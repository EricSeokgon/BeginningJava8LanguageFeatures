package chapter12.Clooections;

import java.util.ArrayList;
import java.util.List;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: ForEachLoop
 * Date: 2017-08-03
 * Time: 오전 8:43
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ForEachLoop {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> names = new ArrayList<>();
        // Add some names to the list
        names.add("Ken");
        names.add("Lee");
        names.add("Joe");
        // Print all elements of the names list
        for(String name : names) {
            System.out.println(name);
        }
    }
}
