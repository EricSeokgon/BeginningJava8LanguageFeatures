package chapter10.NewInputOutput2;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: PathMatching
 * Date: 2017-07-14
 * Time: 오전 9:02
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class PathMatching {
    public static void main(String[] args) {
        String globPattern = "glob:**txt";
        PathMatcher matcher =
            FileSystems.getDefault().getPathMatcher(globPattern);
        Path path = Paths.get("C:\\poems\\luci1.txt");
        boolean matched = matcher.matches(path);
        System.out.format("%s matches %s: %b%n",
            globPattern, path, matched);
    }
}
