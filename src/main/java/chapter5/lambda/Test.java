package chapter5.lambda;

/**
 * Created by hadeslee on 2017-05-15.
 */
public class Test {
    public static void main(String[] args) {
        String msg = "Hello";
        Printer printer = msg1 -> {
           // String msg = "Hi"; // A compile-time error
            System.out.println(msg1);
        };
    }
}
