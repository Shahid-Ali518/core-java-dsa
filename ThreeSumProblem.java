import java.util.ArrayList;
import java.util.List;

public class ThreeSumProblem {

    public static List<List<Integer>> threeSum(int[] nums){

        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i <  nums.length; i++){
            for(int j = i; j < nums.length; j++){
                for(int k = j; k < nums.length; k++){
                    if (i != j  && j != k && nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> li = new ArrayList<>();
                        li.add(nums[i]);
                        li.add(nums[j]);
                        li.add(nums[k]);
                        list.add(li);
                    }

                }
            }
        }


        return list;

    }

    public static void main(String[] args) {

        int[] numbers = {-1,0,1,2,-1,-4};

        System.out.println(threeSum(numbers));



    }
}
