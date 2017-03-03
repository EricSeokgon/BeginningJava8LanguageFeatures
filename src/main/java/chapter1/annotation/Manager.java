package chapter1.annotation;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: Manager
 * Date: 2017-02-20
 * Time: 오전 9:06
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Manager extends Employee {
    @Override
    public void setSalary(double salary) {
        System.out.println("Manager.setSalary(): " + salary);
    }
}
