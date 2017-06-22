package chapter7.inputoutput;

import java.io.Serializable;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: MutablePerson
 * Date: 2017-06-22
 * Time: 오전 9:13
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class MutablePerson implements Serializable {
    private String name = "Unknown";
    private String gender = "Unknown" ;
    private double height = Double.NaN;

    public MutablePerson(String name, String gender, double height) {
        this.name = name;
        this.gender = gender;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "MutablePerson{" +
            "name='" + name + '\'' +
            ", gender='" + gender + '\'' +
            ", height=" + height +
            '}';
    }
}
