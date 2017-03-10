package chapter1.annotation;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: VersionTest
 * Date: 2017-02-21
 * Time: 오전 8:38
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
@Version(major = 1, minor = 0)
public class VersionTest {
    // OK. A constructor declaration
    @Version(major = 1, minor = 0)
    public VersionTest() {
        // Code goes here
    }

    // OK. A method declaration
    @Version(major = 1, minor = 1)
    public void doSomething() {
        // Code goes here
    }
}


