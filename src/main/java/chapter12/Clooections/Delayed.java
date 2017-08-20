package chapter12.Clooections;

import java.util.concurrent.TimeUnit;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: Delayed
 * Date: 2017-08-21
 * Time: 오전 8:49
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public interface Delayed extends Comparable<Delayed> {
    long getDelay(TimeUnit timeUnit);
}
