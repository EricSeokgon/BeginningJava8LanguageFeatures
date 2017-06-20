package chapter7.inputoutput;

import java.io.*;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: ReadingPrimitives
 * Date: 2017-06-20
 * Time: 오후 2:26
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ReadingPrimitives {
    public static void main(String[] args) {
        String srcFile = "primirives.dat";

        try (DataInputStream dis = new DataInputStream(new FileInputStream(srcFile))) {
            int intValue = dis.readInt();
            double doubleValue = dis.readDouble();
            boolean booleanValue = dis.readBoolean();
            String msg = dis.readUTF();

            System.out.println(intValue);
            System.out.println(doubleValue);
            System.out.println(booleanValue);
            System.out.println(msg);
        } catch (FileNotFoundException e) {
            FileUtil.printFileNotFoundMsg(srcFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
