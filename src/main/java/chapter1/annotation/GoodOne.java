package chapter1.annotation;

/**
 * Created by hadeslee on 2017-02-25.
 */
public @interface GoodOne {
    Class element1();
    Class<Test> element2();
    Class<? extends Test> element3();
}
