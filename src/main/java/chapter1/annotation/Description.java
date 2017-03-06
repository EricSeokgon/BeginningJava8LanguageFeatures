package chapter1.annotation;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: Description
 * Date: 2017-03-07
 * Time: 오전 8:52
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public @interface Description {
    Name name();
    Version version();
    String comments() default "";
}
