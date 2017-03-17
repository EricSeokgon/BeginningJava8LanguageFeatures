package chapter2.innerclasses;

/**
 * Created by hadeslee on 2017-03-18.
 */
public class HelloAnonymous {
    public static void main(String[] args) {
        new Object() {
            // An instance initializer
            {
                System.out.println();
            }
        }; // A semi-colon is necessary to end the statement
    }

}
