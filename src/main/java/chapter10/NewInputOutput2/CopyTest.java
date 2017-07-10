package chapter10.NewInputOutput2;

import java.io.IOException;
import java.nio.file.*;

import static java.nio.file.StandardCopyOption.COPY_ATTRIBUTES;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: CopyTest
 * Date: 2017-07-10
 * Time: 오후 1:20
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class CopyTest {
    public static void main(String[] args) {
        // Change the paths for teh source and target files
        // before you run the program
        Path source = Paths.get("C:\\poems\\luci1.txt");
        Path target = Paths.get("C:\\poems\\luci1_backup.txt");
        try {
            Path p = Files.copy(source, target,
                REPLACE_EXISTING, COPY_ATTRIBUTES);
            System.out.println(source + " has been copied to " + p);
        } catch (FileAlreadyExistsException e) {
            System.out.println(target + " already exists.");
        } catch (DirectoryNotEmptyException e) {
            System.out.println(target + " is not empty.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
