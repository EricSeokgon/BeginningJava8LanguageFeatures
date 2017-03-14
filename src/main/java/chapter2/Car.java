package chapter2;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: Car
 * Date: 2017-03-14
 * Time: 오후 3:34
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Car {
    private int year;

    public class Tire {
        private double radius;

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }
    }

    public Car(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}
