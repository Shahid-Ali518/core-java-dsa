package corejava.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice {


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // adding elements with O(n) time
        list.add(3);
        list.addFirst(1);
        list.addLast(5);

        System.out.println(list);


        // remove by values
        list.remove(Integer.valueOf(4)); // did give the exception because element does not exists
        list.remove(Integer.valueOf(1));

        // remove by index
        list.remove(1);

        // remove all values
        list.removeFirst();

        System.out.println(list);


        // Creating the list with initial capacity, by default it is 10
        ArrayList<Integer> list1 = new ArrayList<>(12);

        // creating list as Arrays.asList
        List<String> list2 = Arrays.asList("My", "We", "You");

        // Immutable, doesn't allow add or remove, but can modify as
        list2.set(2, "Me");

//        list2.remove("My"); // throws exception

        System.out.println(list2);

        // Creating complete Immutable list as
        List<Integer> integers = List.of(1, 3, 4, 5, 6);
        System.out.println(integers);

        // convert to arrays as
        Object[] array = integers.toArray();
        System.out.println(Arrays.toString(array));


    }


}
