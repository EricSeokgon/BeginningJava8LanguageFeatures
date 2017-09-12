package chapter13.Streams;

import java.time.Month;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: NestedGroupings
 * Date: 2017-09-12
 * Time: 오전 9:48
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class NestedGroupings {
    public static void main(String[] args) {
        Map<Person.Gender, Map<Month, String>> personsByGenderAndDobMonth
            = Person.persons()
            .stream()
            .collect(Collectors.groupingBy(Person::getGender,
                Collectors.groupingBy(p -> p.getDob().getMonth(),
                    Collectors.mapping(Person::getName,
                        Collectors.joining(", ")))));
        System.out.println(personsByGenderAndDobMonth);
    }
}
