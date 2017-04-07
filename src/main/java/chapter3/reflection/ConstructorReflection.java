package chapter3.reflection;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: ConstructorReflection
 * Date: 2017-04-07
 * Time: 오전 11:19
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ConstructorReflection {
    public static void main(String[] args) {
        Class<Person> c = Person.class;

        //Get the declared constructors
        System.out.println("Constructors for " + c.getName());
        Constructor[] constructors = c.getConstructors();
        ArrayList<String> constructDescList = getConstructorsDesciption(constructors);
    }

    private static ArrayList<String> getConstructorsDesciption(Constructor[] constructors) {
        ArrayList<String> constructorList = new ArrayList<>();

        for (Constructor constructor : constructors) {
            String modifiers = ExecutableUtil.getModifiers(constructor);
        }

    }
}
