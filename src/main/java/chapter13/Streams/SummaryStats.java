package chapter13.Streams;

import java.util.DoubleSummaryStatistics;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: SummaryStats
 * Date: 2017-09-08
 * Time: 오전 9:44
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class SummaryStats {
    public static void main(String[] args) {
        DoubleSummaryStatistics stats = new DoubleSummaryStatistics();
        stats.accept(100.0);
        stats.accept(500.0);
        stats.accept(400.0);
        // Get stats
        long count = stats.getCount();
        double sum = stats.getSum();
        double min = stats.getMin();
        double avg = stats.getAverage();
        double max = stats.getMax();
        System.out.printf("count=%d, sum=%.2f, min=%.2f, average=%.2f, max=%.2f%n",
            count, sum, min, max, avg);
    }
}
