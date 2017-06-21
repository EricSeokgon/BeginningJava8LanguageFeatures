package chapter7.inputoutput;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: PersonExtSerializationTest
 * Date: 2017-06-21
 * Time: 오후 3:31
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class PersonExtSerializationTest {
    public static void main(String[] args) {
        PersonExt john = new PersonExt("John", "Male", 6.7);
        PersonExt wally = new PersonExt("Wally", "Male", 5.7);
        PersonExt katrina = new PersonExt("Katrina", "Female", 5.4);
        // The output file
        File fileObject = new File("personext.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(
            new FileOutputStream(fileObject))) {
            // Write (or serialize) the objects to the object output stream
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
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
