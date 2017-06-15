package chapter7.inputoutput;

import java.io.File;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: FileLists
 * Date: 2017-06-15
 * Time: 오전 10:40
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class FileLists {
    public static void main(String[] args) {
        // Change the dirPath value to list files from your directory
        String dirPath = "C:\\";
        File dir = new File(dirPath);
        File[] list = dir.listFiles();
        for (File f : list) {
            if (f.isFile()) {
                System.out.println(f.getPath() + " (File)");
            } else if (f.isDirectory()) {
                System.out.println(f.getPath() + " (Directory)");
            }
        }
    }
}
