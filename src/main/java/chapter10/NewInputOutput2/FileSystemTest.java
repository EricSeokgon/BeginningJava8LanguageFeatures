package chapter10.NewInputOutput2;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: FileSystemTest
 * Date: 2017-07-07
 * Time: 오전 10:50
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class FileSystemTest {
    public static void main(String[] args) {
        // Create the platform-specific default file system object
        FileSystem fs = FileSystems.getDefault();
        System.out.println("Read-only file system: " + fs.isReadOnly());
        System.out.println("File name separator: " + fs.getSeparator());
        System.out.println("\nAvailable file-stores are");
        for (FileStore store : fs.getFileStores()) {
            printDetails(store);
        }
        System.out.println("\nAvailable root directories are");
        for (Path root : fs.getRootDirectories()) {
            System.out.println(root);
        }

    }

    private static void printDetails(FileStore store) {
        try {
            String desc = store.toString();
            String type = store.type();
            long totalSpace = store.getTotalSpace();
            long unallocatedSpace = store.getUnallocatedSpace();
            long availableSpace = store.getUsableSpace();
            System.out.println(desc + ", Total: " + totalSpace +
                ", Unallocated: " + unallocatedSpace +
                ", Available: " + availableSpace);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
