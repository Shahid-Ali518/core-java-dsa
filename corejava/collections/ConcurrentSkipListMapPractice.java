package corejava.collections;

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapPractice {

    public static void main(String[] args) {

        ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();

        map.put(1, "Ali");
        map.put(9, "Shahid");
        map.put(8, "Raza");
        map.put(4, "Usman");
        map.put(3, "Zeeshan");

        System.out.println(map);

        System.out.println(map.lowerEntry(8)); // return lower entry than given key
        System.out.println(map.lowerKey(5)); // return key

        System.out.println(map.descendingMap()); // reverse the map
        System.out.println(map.higherEntry(4)); // return entry above given key

        System.out.println(map.floorEntry(9)); // return entry if key match or return lower key entry

        System.out.println("Original Main");
    }

}
