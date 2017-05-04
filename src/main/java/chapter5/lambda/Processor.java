package chapter5.lambda;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: Processor
 * Date: 2017-05-04
 * Time: 오전 9:05
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
@FunctionalInterface
public interface Processor {
    <T> void process(T[] list);
}
