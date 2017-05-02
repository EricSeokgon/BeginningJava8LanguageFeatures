package chapter5.lambda;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: Comparator
 * Date: 2017-05-02
 * Time: 오전 10:22
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */

@FunctionalInterface
public interface Comparator<T> {
    // An abstract method declared in the interface
    int compare(T o1, T o2);
    // Re-declaration of the equals() method in the Object class
    boolean equals(Object obj);
/* Many static and default methods that are not shown here. */
}
