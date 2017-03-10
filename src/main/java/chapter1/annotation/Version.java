package chapter1.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: Version
 * Date: 2017-02-21
 * Time: 오전 8:37
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */

@Target({ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface Version {
    int major();
    int minor();
}
