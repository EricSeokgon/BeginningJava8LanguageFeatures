package chapter7.inputoutput;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: NotSerializable
 * Date: 2017-06-22
 * Time: 오전 10:48
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class NotSerializable implements Serializable {
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        throw new IOException("Not meant for serialization!!!");
    }

    private void writeObject(ObjectOutputStream os) throws IOException {
        throw new IOException("Not meant for serialization!!!");
    }
}
