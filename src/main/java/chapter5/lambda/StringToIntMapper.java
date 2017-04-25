package chapter5.lambda;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: StringToIntMapper
 * Date: 2017-04-25
 * Time: 오전 9:16
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
@FunctionalInterface
public interface StringToIntMapper {
    int map(String string);
}
