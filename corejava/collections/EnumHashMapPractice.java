package corejava.collections;

import java.util.EnumMap;
import java.util.Map;

public class EnumHashMapPractice {

    public static void main(String[] args) {

        Map<Day, String> map = new EnumMap<>(Day.class);

        map.put(Day.WEDNESDAY, "Go to Lahore");
        map.put(Day.MONDAY, "University Word");
        map.put(Day.SUNDAY, "New Task");

        System.out.println(Day.FIRDAY.ordinal()); // gives index of enum value

        System.out.println(map); // maintain order as well

        Map<Integer, String> map1 = Map.of(1, "Ali", 2, "Raza"); // immutable map but 10 entries will be added

        Map<Integer, String> map2 = Map.ofEntries(Map.entry(1, "new"), Map.entry(2, "old"));// save large count of entries

        System.out.println(map1);
        System.out.println(map2);

    }


    enum Day {
           MONDAY, TUEDAY, WEDNESDAY, THRUSDAY, FIRDAY, SATURDAY, SUNDAY
    }
}
