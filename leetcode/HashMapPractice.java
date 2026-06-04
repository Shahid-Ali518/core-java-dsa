package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapPractice {


    // get frequency of each character
    public static Map<Character, Integer> frequencyCount(String string){
        Map<Character, Integer> map = new HashMap<>();

        char[] chars = string.toCharArray();

        for(char c: chars){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        return map;
    }

    // two sum problem optimized
    public static boolean checkTwoSumExists(int[] nums, int k){

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){

            int diff = k - nums[i];

            if(map.containsKey(diff))
                return true;

            map.put(nums[i], i);

        }

        return false;
    }

    // find longest consecutive consequence
    public static  int longestSequence(int[] array){
        Set<Integer> set = new HashSet<>();

        for(int i : array)
            set.add(i);

        int longest = 0;

        for(int i : set){

            if(!set.contains(i - 1)){

                int count = 1;
                int current = i;

                while (set.contains(current + 1)){
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }

        }

        return longest;
    }


    public static void main(String[] args) {

        String str = "programming";

        System.out.println(frequencyCount(str));


        int[] towSum = {2, 5, 6, 7, 9};
        int k = 19;
        System.out.println(checkTwoSumExists(towSum, k));

        int[] array = {100, 1, 222, 3, 4, 2};

        System.out.println(longestSequence(array));

    }

}
