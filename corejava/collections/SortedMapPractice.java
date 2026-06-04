package corejava.collections;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapPractice {

    public static void main(String[] args) {

        // SortedMap<Integer, String> sortedMap = new TreeMap<>(); // without comparator
        SortedMap<Integer, String> sortedMap = new TreeMap<>((a, b) -> b - a); // with comparator, to sort in descending order

        sortedMap.put(1, "Ali");
        sortedMap.put(9, "Shahid");
        sortedMap.put(8, "Raza");
        sortedMap.put(4, "Usman");
        sortedMap.put(3, "Zeeshan");

        System.out.println(sortedMap); // prints sorted from 1 to 9

        System.out.println(sortedMap.firstKey()); // returns first key
        System.out.println(sortedMap.lastKey()); // returns last key
        System.out.println(sortedMap.lastEntry()); // return last entry as 9=Shahid

        System.out.println(sortedMap.reversed()); // reverse the map

        System.out.println(sortedMap.headMap(8)); // before 8 excludes given key
        System.out.println(sortedMap.tailMap(4)); // starts from given key and till end


    }

}
