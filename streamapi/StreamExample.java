package streamapi;


import javax.swing.*;
import java.util.*;
import java.util.stream.Stream;


public class StreamExample {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(6);
        numbers.add(7);
        numbers.add(9);
        numbers.add(3);

        System.out.println(numbers);

        Stream<Integer> stream = numbers.stream();

        Optional<Integer> maxValue = stream.max(Integer::compare);

        maxValue.ifPresent(integer -> System.out.println("Max value is: " + integer));

        Optional<Integer> minVal = numbers.stream().min(Integer::compare);

        minVal.ifPresent(integer -> System.out.println("Min value is : " + integer));

        long count = numbers.stream().count();

        System.out.println("total elements: " + count);

        Stream<Integer> sortedNumbers = numbers.stream().sorted();

        sortedNumbers.forEach(n -> System.out.print( "Sorted Array " + n + " "));
        System.out.println();

        Stream<Integer> oddVals = numbers.stream().sorted().filter(n -> n % 2 == 1);

        System.out.print("Odd values: ");
        oddVals.forEach(n -> System.out.print(n + " "));
        System.out.println();

        Stream<Integer> oddValues = numbers.stream().filter(n -> n % 2 == 1 && n > 5);
        System.out.print("Odd values greater than 5: ");
        oddValues.forEach(n -> System.out.print(n + " "));
        System.out.println();

        // reduce function
        Optional<Integer> productResult = numbers.stream().reduce((a, b) -> a*b);
        productResult.ifPresent(integer -> System.out.println("Product: " + integer));

        int pR = numbers.stream().reduce(1, (a, b) -> a*b);
        System.out.println("Product: " + pR);



    }
}
