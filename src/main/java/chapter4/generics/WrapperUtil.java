package chapter4.generics;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: WrapperUtil
 * Date: 2017-04-18
 * Time: 오전 9:54
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class WrapperUtil {
    public static void printDetails(Wrapper<Object> wrapper){
        // Can assign get() return value to Object
        Object value = wrapper.get();
        String className = null;
        if (value != null) {
            className = value.getClass().getName();
        }
        System.out.println("Class: " + className);
        System.out.println("Value: " + value);
    }

    public static double sum(Wrapper<? extends Number> n1,
                             Wrapper<? extends Number> n2) {
        Number num1 = n1.get();
        Number num2 = n2.get();
        double sum = num1.doubleValue() + num2.doubleValue();
        return sum;
    }

    public static <T> void copy(Wrapper<T> source, Wrapper<T> dest) {
        T value = source.get();
        dest.set(value);
    }
}
