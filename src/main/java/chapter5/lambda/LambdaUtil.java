package chapter5.lambda;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: LambdaUtil
 * Date: 2017-04-27
 * Time: 오전 10:10
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class LambdaUtil {
    public void testAdder(Adder adder) {
        double x = 190.90;
        double y = 8.50;
        double sum = adder.add(x, y);
        System.out.println("Using an Adde:");
        System.out.println(x + " + " + y + " = " + sum);
    }

    public void testJoiner(Joiner joiner) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = joiner.join(s1, s2);
        System.out.println("Using a Joiner");
        System.out.println("\"" + s1 + "\"+\"" + s2 + "\" = \"" + s3 + "\"");
    }
}
