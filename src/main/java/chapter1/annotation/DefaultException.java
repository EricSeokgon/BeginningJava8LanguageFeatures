package chapter1.annotation;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: DefaultException
 * Date: 2017-03-03
 * Time: 오전 10:40
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class DefaultException extends java.lang.Throwable {
    public DefaultException() {

    }

    public DefaultException(String msg) {
        super(msg);
    }
}
