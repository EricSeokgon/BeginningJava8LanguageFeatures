package chapter13.Streams;

import java.time.Month;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import static java.util.stream.Collectors.*;

/**
 * Created by hadeslee on 2017-09-10.
 */
public class DobCalendar {
    public static void main(String[] args) {
        Map<Month, String> dobCalendar = Person.persons()
            .stream().collect(collectingAndThen(
                groupingBy(p -> p.getDob().getMonth(),
                    mapping(Person::getName, joining(", "))),
                result -> {
                    // Add missing months
                    for (Month m : Month.values()) {
                        result.putIfAbsent(m, "None");
                    }
                    // Return a sorted, unmodifiable map
                    return Collections.unmodifiableMap(new TreeMap<>(result));
                }));
        dobCalendar.entrySet().forEach(System.out::println);
    }
}
