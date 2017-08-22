package chapter12.Clooections;

import java.util.concurrent.TimeUnit;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: DelayClass
 * Date: 2017-08-22
 * Time: 오전 9:56
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class DelayClass implements Delayed {
    public long getDelay(TimeUnit timeUnit){
        long delay = timeUnit.convert(10, TimeUnit.SECONDS);
        return delay;
    }

    @Override
    public int compareTo(Delayed o) {
        return 0;
    }
}
