package chapter13.Streams;

import java.util.Arrays;
import java.util.List;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: SquaredIntsSum
 * Date: 2017-09-01
 * Time: 오전 10:17
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class SquaredIntsSum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream()
            .filter(n -> n % 2 == 1)
            .map(n -> n * n)
            .reduce(0, Integer::sum);
        System.out.println("Sum =" + sum);

    }
}
