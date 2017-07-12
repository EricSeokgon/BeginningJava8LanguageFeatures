package chapter10.NewInputOutput2;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

import static java.nio.file.FileVisitResult.CONTINUE;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: WalkFileTreeTest
 * Date: 2017-07-12
 * Time: 오전 9:20
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class WalkFileTreeTest {
    public static void main(String[] args) {
        // Get the Path obejct for the default directory
        Path startDir = Paths.get("");
        // Get a file visitor object
        FileVisitor<Path> visitor = getFileVisitor();
        try {
            // Traverse the contents of the startDir
            Files.walkFileTree(startDir, visitor);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static FileVisitor<Path> getFileVisitor() {
        // Declare a local class DirVisitor that
        // inherits fron the SimpleFileVisitor<Path> class
        class DirVisitor<Path> extends SimpleFileVisitor<Path> {
            @Override
            public FileVisitResult preVisitDirectory(Path dir,
                                                     BasicFileAttributes attrs) {
                System.out.format("%s [Directory]%n", dir);
                return CONTINUE;
            }

            @Override
            public FileVisitResult visitFile(Path file,
                                             BasicFileAttributes attrs) {
                System.out.format("%s [File, Size: %s bytes]%n",
                    file, attrs.size());
                return CONTINUE;
            }
        }
        // Create an obejct of the DirVisitor
        FileVisitor<Path> visitor = new DirVisitor<>();
        return visitor;
    }
}