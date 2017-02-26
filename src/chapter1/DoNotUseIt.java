package chapter1;

import java.lang.annotation.Annotation;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: DoNotUseIt
 * Date: 2017-02-27
 * Time: 오전 8:42
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class DoNotUseIt implements Version {
    @Override
    public int major() {
        return 0;
    }

    @Override
    public int minor() {
        return 0;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
