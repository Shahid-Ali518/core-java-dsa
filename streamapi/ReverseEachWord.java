package streamapi;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord {

    public  static String reverseEachWord(String sentence){
        return Arrays.stream(sentence.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {

        System.out.println(reverseEachWord("I love Java"));
        System.out.println(reverseEachWord("shahid"));

    }
}
