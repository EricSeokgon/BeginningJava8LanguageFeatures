package chapter2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: TitleList
 * Date: 2017-03-14
 * Time: 오후 3:37
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class TitleList {
    private ArrayList<String> titleList = new ArrayList<>();

    public void addTitle(String title) {
        titleList.add(title);
    }

    public void removeRirle(String title) {
        titleList.remove(title);
    }

    public Iterator<String> titleIterator() {
        class TitleIterator implements Iterator<String> {
            int count = 0;


            @Override
            public boolean hasNext() {
                return (count < titleList.size());
            }

            @Override
            public String next() {
                return titleList.get(count++);
            }
        }
        TitleIterator titleIterator = new TitleIterator();
        return titleIterator;
    }
}
