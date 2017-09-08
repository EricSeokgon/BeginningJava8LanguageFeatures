package chapter13.Streams;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by hadeslee on 2017-09-09.
 */
public class CollectIntoMapTest {
    public static void main(String[] args) {
        Map<Person.Gender, Person> highestEarnerByGender =
            Person.persons()
                .stream()
                .collect(Collectors.toMap(Person::getGender, Function.identity(),
                    (oldPerson, newPerson) ->
                        newPerson.getIncome() > oldPerson.getIncome()?newPerson:oldPerson));
        System.out.println(highestEarnerByGender);
    }
}
