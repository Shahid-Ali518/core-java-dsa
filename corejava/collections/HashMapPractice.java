package corejava.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

    public static void main(String[] args) {

        Map<Integer, String> names = new HashMap<>();

        names.put(1, "Ali");
        names.put(2, "Raza");
        names.put(3, "Nouman");
        names.put(4, "Haider");

        System.out.println(names);

        // overwrite the existing entry with new one
        names.put(4, "Sana");

        System.out.println(names);

        // Some other methods

        names.get(4); // return the value by key

        names.getOrDefault(4, "Name"); // return if found otherwise default

        names.size(); // return size

        names.putIfAbsent(4, "Aliza"); // only set when paired data is not present

        System.out.println(names);

        // How to iterate in the Map, by values
        for(String name : names.values()) // return values
            System.out.println(name);

        // How to iterate in the Map by Keys
        for(int i : names.keySet()) // return set of keys
            System.out.println(names.get(i));

        // Remove the element
        names.remove(4);

        names.replace(3, "Nouman", "Zeeshan");

        System.out.println(names);

        // Now Implement

        Map<Student, String> map1 = new HashMap<>(17, .5f);

        Student s1 = new Student("ali", 2.4);
        Student s2 = new Student("raza", 3.2);
        Student s3 = new Student("ali", 2.4);

        map1.put(s1, "Average");
        map1.put(s2, "Brilliant");
        map1.put(s3, "Above Average"); // override only possible when we override equals method in Custom class

        map1.size();
        String s = map1.get(s3);
        System.out.println(s);

    }
}
