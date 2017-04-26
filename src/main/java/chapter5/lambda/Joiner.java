package chapter5.lambda;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: Joiner
 * Date: 2017-04-26
 * Time: 오전 9:20
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
@FunctionalInterface
public interface Joiner {
    String join(String s1, String s2);
}
