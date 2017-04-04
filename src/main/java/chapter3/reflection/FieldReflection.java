package chapter3.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: FieldReflection
 * Date: 2017-04-04
 * Time: 오후 1:48
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class FieldReflection {
    public static void main(String[] args) {
        Class<Person> c = Person.class;

        ArrayList<String> filedsDesciption = getDeclaredFiledsList(c);

        System.out.println("Declared Fields for " + c.getName());
        for (String desc : filedsDesciption) {
            System.out.println(desc);
        }

        // Get the accessible public fields
        filedsDesciption = getFieldsList(c);

        System.out.println("\nAccessible Fields for " + c.getName());
        for (String desc : filedsDesciption) {
            System.out.println(desc);
        }

    }

    public static ArrayList<String> getFieldsList(Class c) {
        Field[] fields = c.getFields();
        ArrayList<String> fieldsList = getFieldsDeciption(fields);
        return fieldsList;
    }

    public static ArrayList<String> getDeclaredFiledsList(Class c) {
        Field[] fields = c.getDeclaredFields();
        ArrayList<String> fieldsList = getFieldsDeciption(fields);
        return fieldsList;
    }

    private static ArrayList<String> getFieldsDeciption(Field[] fields) {
        ArrayList<String> fieldList = new ArrayList<>();

        for (Field f : fields) {
            // Get the modifiers for the field
            int mod = f.getModifiers() & Modifier.fieldModifiers();
            String modifiers = Modifier.toString(mod);

            //Get the simple name of the field type
            Class<?> type = f.getType();
            String typeName = type.getSimpleName();

            //Get the name of hte field
            String fieldName = f.getName();

            fieldList.add(modifiers + " " + typeName + " " + fieldName);
        }
        return fieldList;
    }


}
