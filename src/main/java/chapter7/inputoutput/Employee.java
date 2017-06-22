package chapter7.inputoutput;

import java.io.Serializable;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: Employee
 * Date: 2017-06-22
 * Time: 오전 9:30
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Employee implements Serializable {
    private String name;
    private String gender;
    private transient String ssn;
    private transient double salary;
}
