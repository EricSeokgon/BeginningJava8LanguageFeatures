package chapter7.inputoutput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: BufferedFileReading
 * Date: 2017-06-19
 * Time: 오전 11:16
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class BufferedFileReading {
    public static void main(String[] args) {
        String srcFile = "luci1.txt";

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile))) {
            byte byteData;
            while ((byteData = (byte) bis.read()) != -1) {
                System.out.println((char) byteData);
            }
        } catch (FileNotFoundException e1) {
            FileUtil.printFileNotFoundMsg(srcFile);
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}
