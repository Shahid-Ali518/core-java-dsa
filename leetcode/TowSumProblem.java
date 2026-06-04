package leetcode;

public class TowSumProblem {

    public static  int[] twoSum(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length  ; j++){
                if (nums[i] + nums[j ] == target){
                    return new int[]{i , j };
                }
            }
        }
        return new int[] {-1};

    }

    public static void main(String[] args) {
        int[] array = {3, 5, 5, 2, 5, 9};
        int[] sol = twoSum(array, 11);
        for (int i: sol){
            System.out.println(i);
        }
    }
}
