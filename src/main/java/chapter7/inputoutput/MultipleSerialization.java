package chapter7.inputoutput;

import java.io.*;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: MultipleSerialization
 * Date: 2017-06-22
 * Time: 오전 9:20
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class MultipleSerialization {
    public static void main(String[] args) {
        String fileName = "mutableperson.ser";

        serialize(fileName);

        System.out.println("------------------------------------------");

        deserialize(fileName);
    }

    private static void deserialize(String fileName) {
        MutablePerson john = new MutablePerson("John", "Male", 6.7);

        File fileObject = new File(fileName);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileObject))) {
            System.out.println("Objects are written to " + fileObject.getAbsolutePath());

            oos.writeObject(john);
            System.out.println(john);

            john.setName("John Jacobs");
            john.setHeight(6.9);

            oos.writeObject(john);
            System.out.println(john);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void serialize(String fileName) {
        File fileObject = new File(fileName);

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileObject))) {
            MutablePerson john1 = (MutablePerson) ois.readObject();
            MutablePerson john2 = (MutablePerson) ois.readObject();

            System.out.println("Objects are read from " + fileObject.getAbsolutePath());
            System.out.println(john1);
            System.out.println(john2);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
