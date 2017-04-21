package chapter4.generics;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: GenericArrayTest
 * Date: 2017-04-21
 * Time: 오전 11:10
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class GenericArrayTest<T> {
    private T[] elements;
    public GenericArrayTest(int howMany) {
        //elements = new T[howMany]; // A compile-time error
        Wrapper<?>[] anotherArray = new Wrapper<?>[10]; // Ok
    }
// More code goes here
}
