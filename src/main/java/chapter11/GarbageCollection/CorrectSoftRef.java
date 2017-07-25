package chapter11.GarbageCollection;

import java.lang.ref.SoftReference;
import java.util.ArrayList;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: CorrectSoftRef
 * Date: 2017-07-25
 * Time: 오전 9:00
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class CorrectSoftRef {
    public static void main(String[] args) {
        // Create a big object with an id 101 for caching
        BigObject bigObj = new BigObject(101);
        // Wrap soft reference inside a soft reference
        SoftReference<BigObject> sr = new SoftReference<BigObject>(bigObj);
        // Set bigObj to null, so the big object will be
        // softly reachable and can be reclaimed, if necessary.
        bigObj = null;
        // Let us try to create many big objects storing their
        // references in an array list, just to use up big memory.
        ArrayList<BigObject> bigList = new ArrayList<BigObject>();
        long counter = 102;
        while (true) {
            bigList.add(new BigObject(counter++));
        }
    }
}
