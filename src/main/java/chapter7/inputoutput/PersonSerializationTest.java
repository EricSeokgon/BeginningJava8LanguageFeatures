package chapter7.inputoutput;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: PersonSerializationTest
 * Date: 2017-06-20
 * Time: 오후 2:38
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class PersonSerializationTest {
    public static void main(String[] args) {
        Person john = new Person("John", "Male", 6.7);
        Person wally = new Person("wally", "Male", 5.7);
        Person katrina = new Person("katrina", "Female", 5.4);

        File fileObject = new File("person.ser");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileObject))) {

            oos.writeObject(john);
            oos.writeObject(wally);
            oos.writeObject(katrina);
            // Display the serialized objects on the standard output
            System.out.println(john);
            System.out.println(wally);
            System.out.println(katrina);
            // Print the output path
            System.out.println("Objects were written to " +
                fileObject.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
