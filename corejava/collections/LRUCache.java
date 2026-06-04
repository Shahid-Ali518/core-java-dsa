package corejava.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {

    private final int capacity;

    // Constructor for given capacity
    public LRUCache(int capacity){
        super(5, .75f, true);
        this.capacity = capacity;
    }

    // method to override that achieve LRU algorithm
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {

        Map<String, Integer> students = new LRUCache<>(5);

        students.put("Ali", 80);
        students.put("Raza", 67);
        students.put("Haider", 76);
        students.put("Muneer", 56);
        students.put("Hassan", 87);

        students.put("Noor", 54); // Ali removed
        students.get("Muneer");
        students.get("Haider");
        students.get("Raza");

        for (Map.Entry<String, Integer> entry : students.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());

    }
}
