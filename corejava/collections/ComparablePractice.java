package corejava.collections;

import java.util.ArrayList;

public class ComparablePractice {



    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Ali", 2.5));
        students.add(new Student("Bushra", 2.5));
        students.add(new Student("Haroon", 3.3));
        students.add(new Student("Saqib", 3.54));

        students.sort(null); // throws exception because if comparable is not implemented, otherwise run
        System.out.println(students);

    }
}
