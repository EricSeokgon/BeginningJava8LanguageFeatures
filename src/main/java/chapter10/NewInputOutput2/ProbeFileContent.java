package chapter10.NewInputOutput2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: ProbeFileContent
 * Date: 2017-07-10
 * Time: 오후 3:01
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ProbeFileContent {
    public static void main(String[] args) {
        Path p = Paths.get("C:\\poems\\luci1.txt");
        try {
            String contentType = Files.probeContentType(p);
            System.out.format("Content type of %s is %s%n", p, contentType);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
