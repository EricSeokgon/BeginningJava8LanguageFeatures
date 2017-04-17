package chapter4.generics;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: Wrapper
 * Date: 2017-04-17
 * Time: 오전 10:15
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Wrapper<T> {
    private T ref;

    public Wrapper(T ref) {
        this.ref = ref;
    }

    public T get() {
        return ref;
    }

    public void set(T a) {
        this.ref = ref;
    }
}
