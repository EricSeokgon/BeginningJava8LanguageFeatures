package chapter2;

import java.util.Random;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: RandomInteger
 * Date: 2017-03-16
 * Time: 오전 9:27
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class RandomInteger {
    protected Random rand = new Random();

    public int getValue() {
        return rand.nextInt();
    }
}
