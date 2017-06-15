package chapter7.inputoutput;

import java.io.File;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: RootList
 * Date: 2017-06-15
 * Time: 오전 9:53
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class RootList {
    public static void main(String[] args) {
        File[] roots = File.listRoots();
        System.out.println("List of root directories:");
        for (File f : roots) {
            System.out.println(f.getPath());
        }
    }
}
