package chapter1.annotation;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: AccessAnnotation
 * Date: 2017-03-10
 * Time: 오후 5:19
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
@Version(major = 1, minor = 0)
public class AccessAnnotation {
    @Version(major = 1, minor = 1)
    public void testMethod1() {

    }

    @Version(major = 1, minor = 2)
    @Deprecated
    public void testMethod2() {

    }
}
