package chapter7.inputoutput;

import java.io.Closeable;
import java.io.IOException;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: FileUtil
 * Date: 2017-06-19
 * Time: 오전 10:17
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class FileUtil {
    public static void printFileNotFoundMsg(String fileName) {
        String workingDir = System.getProperty("user.dir");
        System.out.println("Could not find the file '" +
            fileName + "' in '" + workingDir + "' directory ");
    }

    // Closes a Closeable resource such as an input/output stream
    public static void close(Closeable resource) {
        if (resource != null) {
            try {
                resource.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
