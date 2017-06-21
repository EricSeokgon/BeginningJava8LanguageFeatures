package chapter7.inputoutput;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: PersonExt
 * Date: 2017-06-21
 * Time: 오전 11:39
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class PersonExt implements Externalizable {
    private String name = "Unknown";
    private String gender = "Unknown";
    private double height = Double.NaN;

    public PersonExt() {
    }

    public PersonExt(String name, String gender, double height) {
        this.name = name;
        this.gender = gender;
        this.height = height;
    }

    @Override
    public String toString() {
        return "PersonExt{" +
            "name='" + name + '\'' +
            ", gender='" + gender + '\'' +
            ", height=" + height +
            '}';
    }

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.name = in.readUTF();
        this.gender = in.readUTF();
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(this.name);
        out.writeUTF(this.gender);
    }
}
