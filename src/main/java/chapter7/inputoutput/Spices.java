package chapter7.inputoutput;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: Spices
 * Date: 2017-06-19
 * Time: 오전 9:19
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Spices extends DrinkDecorator {
    public Spices(Drink drink) {
        this.drink = drink;
        this.name = "Spices";
        this.price = 0.10;
    }
}
