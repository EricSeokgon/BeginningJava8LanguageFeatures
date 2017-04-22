package chapter4.generics;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: Test
 * Date: 2017-04-20
 * Time: 오전 10:05
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Test<T> {
    public <V> void m1(Wrapper<V> a, Wrapper<V> b, T c) {
        Test<String> t = new Test<String>();
        Wrapper<Integer> iw1 = new Wrapper<Integer>(new Integer(201));
        Wrapper<Integer> iw2 = new Wrapper<Integer>(new Integer(202));

        // Specify that Integer is the actual type for the type parameter for m1()
        t.<Integer>m1(iw1, iw2, "hello");
        // Let the compiler figure out the actual type parameter for the m1() call
        // using types for iw1 and iw2
        t.m1(iw1, iw2, "hello"); // OK
    }
}
