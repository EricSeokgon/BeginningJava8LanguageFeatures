package chapter5.lambda;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: lambda_expression_exam
 * Date: 2017-04-25
 * Time: 오전 9:21
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class lambda_expression_exam {
    public static int sum(int x, int y) {
        System.out.println(x + y);
        return x + y;
    }

    public static void main(String[] args) {
        sum(1, 2);
    }
}
