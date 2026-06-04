package corejava.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPractice {

    public static void main(String[] args) {

        // LinkedHashMap used to store order of elements
        Map<Integer, String> map = new LinkedHashMap<>();

        map.put(1, "Orange");
        map.put(2, "Apple");
        map.put(3, "Banana");
        map.put(4, "Watermelon");

        for (int i : map.keySet())
            System.out.println("Item: " + map.get(i)); // return the values in Insertion order

        // Access Order makes it LRU algorithm
        Map<String, Integer> students = new LinkedHashMap<>(17, .75f, true);

        students.put("Ali", 88);
        students.put("Raza", 36);
        students.put("Muneer", 74);
        students.put("Amjad", 55);
        students.put("Bilal", 75);

        students.get("Raza"); // move to last
        students.get("Ali"); // move to last
        students.get("Muneer"); // move to last

        for (Map.Entry<String, Integer> entry : students.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());

    }
}
