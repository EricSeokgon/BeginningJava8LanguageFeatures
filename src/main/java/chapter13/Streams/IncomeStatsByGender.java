package chapter13.Streams;

import java.util.DoubleSummaryStatistics;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summarizingDouble;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: IncomeStatsByGender
 * Date: 2017-09-12
 * Time: 오후 4:42
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class IncomeStatsByGender {
    public static void main(String[] args) {
        Map<Person.Gender, DoubleSummaryStatistics> incomeStatsByGender =
            Person.persons()
                .stream()
                .collect(groupingBy(Person::getGender,
                    summarizingDouble(Person::getIncome)));
        System.out.println(incomeStatsByGender);
    }
}
