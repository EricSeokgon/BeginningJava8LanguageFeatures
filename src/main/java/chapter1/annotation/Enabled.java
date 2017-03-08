package chapter1.annotation;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: Enabled
 * Date: 2017-03-09
 * Time: 오전 8:46
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public @interface Enabled {
    boolean status() default true;
}
