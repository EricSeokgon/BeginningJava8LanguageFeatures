package chapter7.inputoutput;

import java.util.Scanner;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: Calculator
 * Date: 2017-06-23
 * Time: 오후 5:37
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Calculator {
    public static void main(String[] args) {
        // Read three tokens from the console: operand-1 operation operand-2
        String msg = "You can evaluate an arithmetic expressing.\n" +
            "Expression must be in the form: a op b\n" +
            "a and b are two numbers and op is +, -, * or /." +
            "\nPlease enter an expression and press Enter: ";
        System.out.print(msg);
        // Build a scanner for the standard input
        Scanner scanner = new Scanner(System.in);
        double n1 = Double.NaN;
        double n2 = Double.NaN;
        String operation = null;
        try {
            n1 = scanner.nextDouble();
            operation = scanner.next();
            n2 = scanner.nextDouble();
            double result = calculate(n1, n2, operation);
            System.out.printf("%s %s %s = %.2f%n", n1,
                operation, n2, result);
        } catch (Exception e) {
            System.out.println("An invalid expression.");
        }
    }

    private static double calculate(double op1, double op2, String operation) {
        switch (operation) {
            case "+":
                return op1 + op2;
            case "-":
                return op1 - op2;
            case "*":
                return op1 * op2;
            case "/":
                return op1 / op2;
        }
        return Double.NaN;
    }
}
