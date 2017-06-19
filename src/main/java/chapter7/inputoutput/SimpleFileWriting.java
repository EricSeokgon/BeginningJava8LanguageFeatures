package chapter7.inputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: SimpleFileWriting
 * Date: 2017-06-19
 * Time: 오전 10:50
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class SimpleFileWriting {
    public static void main(String[] args) {
        String destFile = "luci2.txt";

        String lineSeparator = System.getProperty("line.seprator");
        String line1 = "When she I loved look'd every day";
        String line2 = "Fresh as a rose in June,";

        String line3 = "I to Her cottage bent my way";
        String line4 = "Beneath an evening moon";

        try (FileOutputStream fos = new FileOutputStream(destFile)) {
            fos.write(line1.getBytes());
            fos.write(lineSeparator.getBytes());

            fos.write(line2.getBytes());
            fos.write(lineSeparator.getBytes());

            fos.write(line3.getBytes());
            fos.write(lineSeparator.getBytes());

            fos.write(line4.getBytes());
            fos.write(lineSeparator.getBytes());

            fos.flush();

            System.out.println("Text has been written to " + (new File(destFile)).getAbsolutePath());

        } catch (FileNotFoundException e1) {
            FileUtil.printFileNotFoundMsg(destFile);
        } catch (IOException e2) {
            e2.printStackTrace();
        }

    }
}
