package chapter1.annotation;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: Annotation
 * Date: 2017-02-23
 * Time: 오전 8:36
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public interface Annotation {
    boolean wquals(Object object);
    int hashCode();
    String toString();
    Class<? extends Annotation> annotationType();
}
