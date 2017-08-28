package chapter12.Clooections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: MapViews
 * Date: 2017-08-28
 * Time: 오전 9:23
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class MapViews {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("John", "(342)113-9878");
        map.put("Richard", "(245)890-9045");
        map.put("Donna", "(205)678-9823");
        map.put("Ken", "(205)678-9823");
        System.out.println("Map: " + map.toString());
        // Print keys, values, and entries in the map
        listKeys(map);
        listValues(map);
        listEntries(map);
    }

    private static void listEntries(Map<String, String> map) {
        System.out.println("Entry Set:");
        // Get the entry Set
        Set<Map.Entry<String, String>>entries = map.entrySet();
        entries.forEach((Map.Entry<String, String> entry) -> {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key=" + key + ", value=" + value);
        });
    }

    private static void listValues(Map<String, String> map) {
        System.out.println("Values Collection:");
        Collection<String> values = map.values();
        values.forEach(System.out::println);
        System.out.println();
    }

    private static void listKeys(Map<String, String> map) {
        System.out.println("Key Set:");
        Set<String> keys = map.keySet();
        keys.forEach(System.out::println);
        System.out.println();
    }
}
