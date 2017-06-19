package chapter7.inputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: FileWritingWithPrintStream
 * Date: 2017-06-19
 * Time: 오후 12:55
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class FileWritingWithPrintStream {
    public static void main(String[] args) {
        String destFile = "luci3.txt";

        try (PrintStream ps = new PrintStream(destFile)) {
            ps.println("Upon the moon I fix'd my eye,");
            ps.println("All over the wide lea;");
            ps.println("With quickening pace my horse drew nigh");
            ps.println("Those paths so dear to me.");

            ps.flush();

            System.out.println("Text has been written to " + new File(destFile).getAbsolutePath());
        } catch (FileNotFoundException e1) {
            FileUtil.printFileNotFoundMsg(destFile);
        }
    }
}
