package chapter13.Streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: CollectJoiningTest
 * Date: 2017-09-11
 * Time: 오전 9:48
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class CollectJoiningTest {
    public static void main(String[] args) {
        List<Person> persons = Person.persons();
        String names = persons.stream()
            .map(Person::getName)
            .collect(Collectors.joining());
        String delimitedNames = persons.stream()
            .map(Person::getName)
            .collect(Collectors.joining(", "));
        String prefixedNames = persons.stream()
            .map(Person::getName)
            .collect(Collectors.joining(", ", "Hello ", ". Goodbye."));
        System.out.println("Joined names: " + names);
        System.out.println("Joined, delimited names: " + delimitedNames);
        System.out.println(prefixedNames);
    }
}
