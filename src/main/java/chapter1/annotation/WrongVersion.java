package chapter1.annotation;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: WrongVersion
 * Date: 2017-02-23
 * Time: 오전 8:35
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public @interface WrongVersion {
    // Cannot have parameters
    //String concatenate(int major, int minor);
    //int major() throws Exception; // Cannot have a throws clause
    int minor(); // OK
}
