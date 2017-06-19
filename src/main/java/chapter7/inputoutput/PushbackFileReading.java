package chapter7.inputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PushbackInputStream;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: PushbackFileReading
 * Date: 2017-06-19
 * Time: 오전 11:32
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class PushbackFileReading {
    public static void main(String[] args) {
        String srcFile = "luci1.txt";

        try (PushbackInputStream pis = new PushbackInputStream(new FileInputStream(srcFile))) {
            byte byteData;
            while ((byteData = (byte) pis.read()) != -1) {
                System.out.println((char) byteData);

                pis.unread(byteData);

                byteData = (byte) pis.read();
                System.out.println((char) byteData);
            }
        } catch (FileNotFoundException e1) {
            FileUtil.printFileNotFoundMsg(srcFile);
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

}
