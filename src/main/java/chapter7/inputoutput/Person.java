package chapter7.inputoutput;

import java.io.Serializable;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: Person
 * Date: 2017-06-20
 * Time: 오후 2:36
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Person implements Serializable {
    private String name = "Unknown";
    private String gender = "Unknown";
    private double height = Double.NaN;

    public Person(String name, String gender, double height) {
        this.name = name;
        this.gender = gender;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
            "name='" + name + '\'' +
            ", gender='" + gender + '\'' +
            ", height=" + height +
            '}';
    }
}
