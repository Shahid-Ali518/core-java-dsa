package corejava.collections;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class NavigableMapPractice {

    public static void main(String[] args) {

        NavigableMap<Integer, String> map = new TreeMap<>(); // with comparator, to sort in descending order

        map.put(1, "Ali");
        map.put(9, "Shahid");
        map.put(8, "Raza");
        map.put(4, "Usman");
        map.put(3, "Zeeshan");

        System.out.println(map.lowerEntry(8)); // return lower entry than given key
        System.out.println(map.lowerKey(5)); // return key

        System.out.println(map.descendingMap()); // reverse the map
        System.out.println(map.higherEntry(4)); // return entry above given key

        System.out.println(map.floorEntry(9)); // return entry if key match or return lower key entry




    }
}
