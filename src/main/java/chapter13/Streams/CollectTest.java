package chapter13.Streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: CollectTest
 * Date: 2017-09-06
 * Time: 오전 10:37
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class CollectTest {
    public static void main(String[] args) {
        List<String> sortedNames = Person.persons()
            .stream()
            .map(Person::getName)
            .sorted()
            .collect(Collectors.toList());
        System.out.println(sortedNames);
    }
}
