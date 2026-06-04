package corejava.collections;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListPractice {

    public static void main(String[] args) {

//         ArrayList<String> fruits = new ArrayList<>(); // causes ConcurrentModificationException

        List<String> fruits = new CopyOnWriteArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("mango");

        for(String fruit : fruits){
            System.out.println(fruit);
            if(fruit.equals("orange")){
                fruits.add("watermelon"); // this operation done in new created copy of original, and original remains unaffected
                System.out.println("Add another item");
            }
        }

        System.out.println(fruits);
    }
}
