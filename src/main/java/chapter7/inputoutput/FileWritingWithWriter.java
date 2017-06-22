package chapter7.inputoutput;

import java.io.*;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: FileWritingWithWriter
 * Date: 2017-06-22
 * Time: 오전 10:52
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class FileWritingWithWriter {
    public static void main(String[] args) {
        String destFile = "luci4.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(destFile))) {
            bw.append("And now we reach'd the orchard=plot;");
            bw.newLine();
            bw.append("And, as we climb'd the hill,");
            bw.newLine();
            bw.append("The sinking moon to Lucy's cot");
            bw.newLine();
            bw.append("Came near and nearer still.");

            bw.flush();

            System.out.println("Text was written to " + (new File(destFile).getAbsolutePath()));

        } catch (FileNotFoundException e1) {
            FileUtil.printFileNotFoundMsg(destFile);
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}
