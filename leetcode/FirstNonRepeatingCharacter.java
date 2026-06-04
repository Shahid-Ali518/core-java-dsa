package leetcode;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static char findFirstNonRepeatingCharacter(String string){

        char[] chars = string.toCharArray();

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        // put all elements into the map
        for(char c : chars)
            map.put(c, map.getOrDefault(c, 0) + 1);

        // check occurrence
        for(char c: chars)
            if(map.get(c) == 1)
                return c;

        return '_';
    }

    public static void main(String[] args) {

        String str = "swiss";

        char c = findFirstNonRepeatingCharacter(str);
        System.out.println(c);

    }
}


