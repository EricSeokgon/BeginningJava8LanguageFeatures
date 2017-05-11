package chapter5.lambda;

import java.util.function.Supplier;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: Item
 * Date: 2017-05-11
 * Time: 오전 8:59
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Item implements Priced {
    private String name = "Unknown";
    private double price = 0.0;

    public Item() {
        System.out.println("Constructor Item() called.");
    }

    public Item(String name) {
        this.name = name;
    }

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
            "name='" + name + '\'' +
            ", price=" + price +
            '}';
    }

    public void test() {
        // Uses the Item.toString() method
        Supplier<String> s1 = this::toString;
        // Uses Object.toString() method
        Supplier<String> s2 = Item.super::toString;
        // Uses Item.getPrice() method
        Supplier<Double> s3 = this::getPrice;
        // Uses Priced.getPrice() method
        Supplier<Double> s4 = Priced.super::getPrice;

        // Uses all method references and prints the results
        System.out.println("this::toString: " + s1.get());
        System.out.println("Item.super::toString: " + s2.get());
        System.out.println("this::getPrice: " + s3.get());
        System.out.println("Priced.super::getPrice: " + s4.get());
    }
}
