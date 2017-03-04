package chapter1.annotation;

import java.io.IOException;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: PolicyTestCases
 * Date: 2017-03-03
 * Time: 오후 1:08
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class PolicyTestCases {
    // Must throw IOExceptionn
    @TestCase(willThrow = IOException.class)
    public static void testCase1() {
        // Code goes here
    }

    // We are not expecting any exception
    @TestCase()
    public static void testCase2() {
// Code goes here
    }
}

