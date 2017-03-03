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
    //Annotation for instance variable xyz
    @Version(major = 1, minor = 1)
    private int xyz = 110;

    // Annotation for constructor VersionTest()
    @Version(major = 1, minor = 0)
    public VersionTest() {
    }

    // Annotation for constructor VersionTest(int xyz)
    @Version(major = 1, minor = 1)
    public VersionTest(int xyz) {
        this.xyz = xyz;
    }

    // Annotation for the printData() method
    @Version(major = 1, minor = 0)
    public void printData() {
    }

    // Annotation for the setXyz() method
    @Version(major = 1, minor = 1)
    public void setXyz(int xyz) {

        // Annotation for local variable newValue
        @Version(major = 1, minor = 2)
        int newValue = xyz;
        this.xyz = xyz;
    }
}


