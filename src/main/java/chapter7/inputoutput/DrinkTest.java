package chapter7.inputoutput;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: DrinkTest
 * Date: 2017-06-19
 * Time: 오전 9:27
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class DrinkTest {
    public static void main(String[] args) {
        Drink d1 = new Whiskey();
        printReceipt(d1);

        Drink d2 = new Honey(new Whiskey());
        printReceipt(d2);

        Drink d3 = new Spices(new Vodka());
        printReceipt(d3);

        Drink d4 = new Spices(new Honey(new Honey(new Rum())));
        printReceipt(d4);
    }

    private static void printReceipt(Drink drink) {
        String name = drink.getName();
        double price = drink.getPrice();
        System.out.println(name + " - $" + price);
    }
}
