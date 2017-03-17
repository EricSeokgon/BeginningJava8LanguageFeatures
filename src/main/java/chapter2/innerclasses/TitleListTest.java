package chapter2.innerclasses;

import java.util.Iterator;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: TitleListTest
 * Date: 2017-03-15
 * Time: 오전 9:17
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class TitleListTest {
    public static void main(String[] args) {
        TitleList tl = new TitleList();

        tl.addTitle("Beginning java8");
        tl.addTitle("Scripting in Java");

        Iterator iterator = tl.titleIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
