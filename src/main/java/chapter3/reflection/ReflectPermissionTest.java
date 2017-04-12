package chapter3.reflection;

import java.lang.reflect.ReflectPermission;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: ReflectPermissionTest
 * Date: 2017-04-12
 * Time: 오전 10:50
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ReflectPermissionTest {
    public static void main(String[] args) {
        try {
            // Create a permission object
            ReflectPermission rp = new ReflectPermission("suppressAccessChecks");
            // check for permission
            rp.checkGuard(null);
            System.out.println("Reflect permission is granted");
        }
        catch (SecurityException e) {
            System.out.println("Reflect permission is not granted");
        }
    }
}
