public class SortedArrayTwoSum {

    public static int[] twoSumSorted(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }


    public static void main(String[] args) {
        int [] array = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSumSorted(array, target);
        System.out.println(result[0] + ", " + result[1]);
    }

}
