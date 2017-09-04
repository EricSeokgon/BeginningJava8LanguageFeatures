package chapter13.Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: IOStream
 * Date: 2017-09-04
 * Time: 오전 10:25
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class IOStream {
    public static void main(String[] args) {
        // Read the contents of teh file luci1.txt
        readFileContents("luci1.txt");
// Print the file tree for the current working directory
        listFileTree();
    }

    public static void readFileContents(String filePath) {
        Path path = Paths.get(filePath);
        if (!Files.exists(path)) {
            System.out.println("The file " +
                path.toAbsolutePath() + " does not exist.");
            return;
        }
        try (Stream<String> lines = Files.lines(path)) {
// Read and print all lines
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void listFileTree() {
        Path dir = Paths.get("");
        System.out.printf("%nThe file tree for %s%n", dir.toAbsolutePath());
        try (Stream<Path> fileTree = Files.walk(dir)) {
            fileTree.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
