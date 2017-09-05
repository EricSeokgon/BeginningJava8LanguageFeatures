package chapter13.Streams;

import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: OptionalTest
 * Date: 2017-09-05
 * Time: 오전 9:48
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class OptionalTest {
    public static void main(String[] args) {
        // Get the maximum of odd integers from the stream
        OptionalInt maxOdd = IntStream.of(10, 20, 30)
            .filter(n -> n % 2 == 1)
            .max();
        if (maxOdd.isPresent())

        {
            int value = maxOdd.getAsInt();
            System.out.println("Maximum odd integer is " + value);
        } else

        {
            System.out.println("Stream is empty.");
        }

        // Get the maximum of odd integers from the stream
        OptionalInt numbers = IntStream.of(1, 10, 37, 20, 31)
            .filter(n -> n % 2 == 1)
            .max();
        if (numbers.isPresent())

        {
            int value = numbers.getAsInt();
            System.out.println("Maximum odd integer is " + value);
        } else

        {
            System.out.println("Stream is empty.");
        }

        // Get the longest name
        Optional<String> name = Stream.of("Ken", "Ellen", "Li")
            .max(Comparator.comparingInt(String::length));
        if (name.isPresent())

        {
            String longestName = name.get();
            System.out.println("Longest name is " + longestName);
        } else

        {
            System.out.println("Stream is empty.");
        }
    }
}
