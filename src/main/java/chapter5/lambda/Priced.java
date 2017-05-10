package chapter5.lambda;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: Priced
 * Date: 2017-05-10
 * Time: 오전 9:31
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public interface Priced {
    default double getPrice() {
        return 1.0;
    }
}
