package chapter10.NewInputOutput2;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.*;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: SupportedFileAttribViews
 * Date: 2017-07-14
 * Time: 오전 11:32
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class SupportedFileAttribViews {
    public static void main(String[] args) {
        // Use C: as the file store path on Windwos
        Path path = Paths.get("C:");
        try {
            FileStore fs = Files.getFileStore(path);
            printDetails(fs, AclFileAttributeView.class);
            printDetails(fs, BasicFileAttributeView.class);
            printDetails(fs, DosFileAttributeView.class);
            printDetails(fs, FileOwnerAttributeView.class);
            printDetails(fs, PosixFileAttributeView.class);
            printDetails(fs, UserDefinedFileAttributeView.class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void printDetails(FileStore fs,
                                    Class<? extends FileAttributeView> attribClass) {
        // Check if the file attribute view is supported
        boolean supported = fs.supportsFileAttributeView(attribClass);
        System.out.format("%s is supported: %s%n",
            attribClass.getSimpleName(), supported);
    }
}
