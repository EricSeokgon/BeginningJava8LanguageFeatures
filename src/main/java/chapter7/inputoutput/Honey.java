package chapter7.inputoutput;

/**
 * Created by hadeslee on 2017-06-17.
 */
public class Honey extends DrinkDecorator {
    public Honey(Drink drink) {
        this.drink = drink;
        this.name = "Honey";
        this.price = 0.25;
    }

}
