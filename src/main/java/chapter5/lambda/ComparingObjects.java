package chapter5.lambda;

import java.util.List;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: ComparingObjects
 * Date: 2017-05-17
 * Time: 오전 9:29
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ComparingObjects {
    public static void main(String[] args) {
        List<Person> persons = Person.getPersons();
        // Sort using the first name

        // Print the sorted list
        System.out.println("Sorted by the first name:");
        FunctionUtil.forEach(persons, System.out::println);
        // Sort using the last name, first name, and then DOB

        // Print the sorted list
        System.out.println("\nSorted by the last name, first name, and dob:");
        FunctionUtil.forEach(persons, System.out::println);
    }
}
