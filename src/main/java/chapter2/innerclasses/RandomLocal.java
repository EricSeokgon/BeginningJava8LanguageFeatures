package chapter2.innerclasses;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: RandomLocal
 * Date: 2017-03-16
 * Time: 오전 9:25
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class RandomLocal {
    public RandomInteger getRandomInteger() {
        // Local inner class that inherits RandomInteger class
        class RandomIntegerLocal extends RandomInteger {
            @Override
            public int getValue() {
                // Get two random integers and return the average
                // ignoring the fraction part
                long n1 = rand.nextInt();
                long n2 = rand.nextInt();
                int value = (int) ((n1 + n2) / 2);
                return value;
            }
        }
        return new RandomIntegerLocal();
    } // End of getRandomInteger() method
}
