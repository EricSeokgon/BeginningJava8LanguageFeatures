package chapter7.inputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: SimpleFileReading
 * Date: 2017-06-19
 * Time: 오전 10:44
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class SimpleFileReading {
    public static void main(String[] args) {
        String dataSourceFile = "luci1.txt";
        try (FileInputStream fin = new FileInputStream(dataSourceFile)) {
            byte bytedata;
            while ((bytedata = (byte) fin.read()) != -1) {
                System.out.println((char) bytedata);
            }
        } catch (FileNotFoundException e) {
            FileUtil.printFileNotFoundMsg(dataSourceFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
