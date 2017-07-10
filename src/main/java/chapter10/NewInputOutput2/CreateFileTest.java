package chapter10.NewInputOutput2;

import java.io.IOException;
import java.nio.file.*;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: CreateFileTest
 * Date: 2017-07-10
 * Time: 오전 9:05
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class CreateFileTest {
    public static void main(String[] args) {
        Path p1 = Paths.get("test.txt");
        try {
            Files.createFile(p1);
            System.out.format("File created: %s%n", p1.toRealPath());
        } catch (FileAlreadyExistsException e) {
            System.out.format("File %s already exists.%n",
                p1.normalize());
        } catch (NoSuchFileException e) {
            System.out.format("Directory %s does not exists.%n",
                p1.normalize().getParent());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
