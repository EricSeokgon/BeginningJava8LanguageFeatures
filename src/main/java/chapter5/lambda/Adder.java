package chapter5.lambda;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: Adder
 * Date: 2017-04-26
 * Time: 오전 9:21
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
@FunctionalInterface
public interface Adder {
    double add(double n1, double n2);
}
