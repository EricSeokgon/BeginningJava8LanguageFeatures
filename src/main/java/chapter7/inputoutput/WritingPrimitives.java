package chapter7.inputoutput;

import java.io.*;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: WritingPrimitives
 * Date: 2017-06-20
 * Time: 오전 9:21
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class WritingPrimitives {
    public static void main(String[] args) {
        String destFile = "primitives.dat";
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(destFile))) {
            dos.writeInt(765);
            dos.writeDouble(6789.50);
            dos.writeBoolean(true);
            dos.writeUTF("Java Input/Output is cool!");
            dos.flush();

            System.out.println("Data has been written to " + (new File(destFile).getAbsolutePath()));
        } catch (FileNotFoundException e) {
            FileUtil.printFileNotFoundMsg(destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
