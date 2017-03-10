package chapter1.annotation;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: AccessAnnotationTest
 * Date: 2017-03-10
 * Time: 오후 5:21
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class AccessAnnotationTest {
    public static void main(String[] args) {
        Class<AccessAnnotation> c = AccessAnnotation.class;
        System.out.println("Annotations for class  : " + c.getName());
        printAnntations(c);

        Package p = c.getPackage();
        System.out.println("Annotations for package : " + p.getName());
        printAnntations(p);

        System.out.println("Method annotations : ");
        Method[] m = c.getDeclaredMethods();
        for (int i = 0; i < m.length; i++) {
            System.out.println("Annotations for method: " + m[i].getName());
            printAnntations(m[i]);
        }
    }

    private static void printAnntations(AnnotatedElement programElement) {
        Annotation[] annList = (Annotation[]) programElement.getAnnotations();
        for (int i = 0; i < annList.length; i++) {
            System.out.println(annList[i]);
            if (annList[i] instanceof Version) {
                Version v = (Version) annList[i];
                int major = v.major();
                int minor = v.minor();
                System.out.println("Found Version annotation: " +
                        "major =" + major + ", minor=" + minor);
            }
        }
        System.out.println();
    }

}