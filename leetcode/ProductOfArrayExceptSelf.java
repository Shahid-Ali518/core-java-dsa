package leetcode;



public class ProductOfArrayExceptSelf {

    public static int[] productOfArray(int[] array){

        int n = array.length;
        int[] res = new int[n];

        for(int i = 0; i < n; i++){
            res[i] = 1;
            for(int j = 0; j < n; j++){
                if(i != j){
                    res[i] *= array[j] * 1;
                }
            }
        }

        return res;

    }

    public static void main(String[] args) {

//        int[] arr = {10, 3, 5, 6, 2};
        int[] arr = {12, 0};
        int[] res = productOfArray(arr);
        for(int num: res)
            System.out.print(num + " ");

        System.out.println();

    }
}
