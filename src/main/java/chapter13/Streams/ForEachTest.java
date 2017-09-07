package chapter13.Streams;

import java.util.List;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: ForEachTest
 * Date: 2017-09-07
 * Time: 오전 9:20
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ForEachTest {
    public static void main(String[] args) {
        // Get the list of persons
        List<Person> persons = Person.persons();
        // Print the list
        System.out.println("Before increasing the income: " + persons);
        // Increase the income of females by 10%
        persons.stream()
            .filter(Person::isFemale)
            .forEach(p -> p.setIncome(p.getIncome() * 1.10));
        // Print the list again
        System.out.println("After increasing the income: " + persons);
    }
}
