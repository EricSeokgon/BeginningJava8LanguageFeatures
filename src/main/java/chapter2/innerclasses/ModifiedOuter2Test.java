package chapter2.innerclasses;

/**
 * Created by Hadeslee on 2017-03-26.
 */
public class ModifiedOuter2Test {
    public static void main(String[] args) {
        ModifiedOuter2 out = new ModifiedOuter2();
        ModifiedOuter2.Inner in = out.new Inner();
// Print the value
        out.printValue();
        in.printValue();
// Set a new value
        out.setValue(828);
// Print the value
        out.printValue();
        in.printValue();
    }
}
