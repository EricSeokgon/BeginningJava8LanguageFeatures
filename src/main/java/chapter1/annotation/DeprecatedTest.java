package chapter1.annotation;

/**
 * Created by hadeslee on 2017-03-12.
 */
@Deprecated
public class DeprecatedTest {
    private DeprecatedTest() {

    }
    public static DeprecatedTest getInstance() {
        DeprecatedTest dt = new DeprecatedTest();
        return dt;
    }
}
