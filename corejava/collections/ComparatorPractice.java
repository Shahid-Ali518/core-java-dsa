package corejava.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


class IntegerComparator implements Comparator<Integer>{

    // if = 0, return same order
    // if > 0, return o2 first, means descending order
    // if < 0, return o1 first, means ascending order
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}

// ok, bye
class StringComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o2.length() - o1.length();
    }
}


public class ComparatorPractice {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(3);
        list.add(1);
        list.add(2);

        // sorting
        list.sort(null); // comparator null, by default ascending order
        System.out.println(list);

        // if we need to custom sorting, we have to implement comparator or lamda
        list.sort(new IntegerComparator());
        System.out.println(list);

        // list
        List<String> fruits = Arrays.asList("orange", "apple", "watermelon", "banana");

        fruits.sort(null);
        System.out.println(fruits);

//        fruits.sort(new StringComparator());
        // sort using lamdas
        fruits.sort((a, b) -> b.length() - a.length());
        System.out.println(fruits);

        // now list of students
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Ali", 2.5));
        students.add(new Student("Bushra", 2.5));
        students.add(new Student("Haroon", 3.3));
        students.add(new Student("Saqib", 3.54));



        // students.sort(null); // throw exception due to not implementing Comparable

        // sort with custom logic using lamda expression
//        students.sort((o1, o2) -> {
//            if(o2.getCgpa() - o1.getCgpa() > 0)
//                return 1;
//            else if(o2.getCgpa() - o1.getCgpa() < 0)
//                return -1;
//            else{
//                return 0;
//            }
//        });

        // comparing using Java 8
        Comparator<Student> comparator = Comparator.comparing(Student::getCgpa).reversed()
                .thenComparing(Student::getName);

        students.sort(comparator);
        System.out.println(students);


    }
}
