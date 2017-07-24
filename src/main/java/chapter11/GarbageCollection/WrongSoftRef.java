package chapter11.GarbageCollection;

import java.lang.ref.SoftReference;
import java.util.ArrayList;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: WrongSoftRef
 * Date: 2017-07-24
 * Time: 오전 8:59
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class WrongSoftRef {
    public static void main(String[] args) {
        // Create a big object with an id 101 for caching
        BigObject bigObj = new BigObject(101);
        // Wrap soft reference inside a soft reference
        SoftReference<BigObject> sr = new SoftReference<BigObject>(bigObj);
        // Let us try to create many big objects storing their
        // references in an array list, just to use up big memory.
        ArrayList<BigObject> bigList = new ArrayList<BigObject>();
        long counter = 102;
        while (true) {
            bigList.add(new BigObject(counter++));
        }
    }
}
