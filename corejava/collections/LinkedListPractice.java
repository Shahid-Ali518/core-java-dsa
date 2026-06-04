package corejava.collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// LinkedList as a List,
public class LinkedListPractice {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(2);
        list.add(4);
        list.add(5);

        list.addFirst(0);
        list.addLast(100);

        System.out.println(list);

        // get access on index, O(n)
        System.out.println(list.get(4));

        // add at the middle, O(1)
        list.add(1, 1);
        System.out.println(list);

        list.remove(4); // O(1)
        System.out.println(list);

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat", "Dog", "Elephant"));

        List<String> list1 = Arrays.asList("Dog", "Eagle");

        animals.removeAll(list1);

        System.out.println(animals);

    }
}
