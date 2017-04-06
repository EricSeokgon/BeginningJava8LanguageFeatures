package chapter3.reflection;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: MethodReflection
 * Date: 2017-04-06
 * Time: 오전 9:34
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class MethodReflection {
    public static void main(String[] args) {
        Class<Person> c = Person.class;

        //Get the declared methods
        ArrayList<String> methodsDesciption = getDeclaredMethodsList(c);
        System.out.println("Declared Methods for " + c.getName());
        for (String desc : methodsDesciption) {
            System.out.println(desc);
        }

        methodsDesciption = getMethodsList(c);
        System.out.println("\nMethods for" + c.getName());
        for (String desc : methodsDesciption) {
            System.out.println(desc);
        }
    }

    public static ArrayList<String> getMethodsList(Class c) {
        Method[] methods = c.getMethods();
        ArrayList<String> methodsList = getMethodsList(methods);
        return methodsList;
    }

    public static ArrayList<String> getDeclaredMethodsList(Class c) {
        Method[] methods = c.getDeclaredMethods();
        ArrayList<String> methodsList = getMethodsList(methods);
        return methodsList;
    }

    public static ArrayList<String> getmethodsDesciption(Method[] methods) {
        ArrayList<String> methodList = new ArrayList<>();
        for (Method m : methods) {
            String modifiers = ExecutableUtil.getModifiers(m);

            //Get the method return type
            Class returnType = m.getReturnType();
            String returnTypeName = returnType.getSimpleName();

            //Get the name of the method
            String methodName = m.getName();

            //Get the parameters of the method
            ArrayList<String> paramsList = ExecutableUtil.getParameters(m);
            String params = ExecutableUtil.arrayListToString(paramsList, ",");

            //Get the Exceptions thrown by method
            String throwsClause = ExecutableUtil.getThrowsClause(m);

            methodList.add(modifiers + " " + returnTypeName + " " + methodName + "(" + params + ")" + throwsClause);

        }
        return methodList;
    }

}
