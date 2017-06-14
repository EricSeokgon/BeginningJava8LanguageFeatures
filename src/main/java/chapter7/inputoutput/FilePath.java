package chapter7.inputoutput;

import java.io.File;
import java.io.IOException;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: FilePath
 * Date: 2017-06-14
 * Time: 오후 4:38
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class FilePath {
    public static void main(String[] args) {
        String workingDir = System.getProperty("user.dir");
        System.out.println("Working Directory: " + workingDir);
        System.out.println("----------------------");
        printFilePath("dummy.txt");
        System.out.println("----------------------");
        printFilePath(".." + File.separator + "notes.txt");
    }

    private static void printFilePath(String pathname) {
        {
            File f = new File(pathname);
            System.out.println("File Name: " + f.getName());
            System.out.println("File exists: " + f.exists());
            System.out.println("Absolute Path: " + f.getAbsolutePath());
            try {
                System.out.println("Canonical Path: " + f.getCanonicalPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
