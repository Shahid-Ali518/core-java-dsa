package corejava.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class VectorPractice {

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>(5, 5);

        vector.add(3);
        vector.add(3);
        vector.add(3);
        vector.add(3);
        vector.add(3);

        System.out.println(vector.capacity());

        vector.add(3);
        System.out.println(vector.capacity());



        vector.addAll(Arrays.asList(4, 5, 6));

        System.out.println(vector);

        System.out.println(vector.contains(67));

        vector.clear();

        System.out.println(vector);

        // this is not the thread safe
        ArrayList<Integer> list1 = new ArrayList<>();

        // this is thread safe
        Vector<Integer> list = new Vector<>();

        Thread t1 = new Thread(() ->{
            for (int i = 0; i < 1000; i++)
                list.add(i);
        });

        Thread t2 = new Thread(() ->{
            for (int i = 0; i < 1000; i++)
                list.add(i);
        });

        t1.start();
        t2.start();


        try{
            t1.join();
            t2.join();
        }
        catch (InterruptedException e){
            System.out.println();
        }

        System.out.println("List Size: " + list.size());



    }

}
