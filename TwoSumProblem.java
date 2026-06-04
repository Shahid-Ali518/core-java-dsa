public class TwoSumProblem {


    public static int[] findIndices(int[] A, int target){
        int size = A.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i; j < size - 1; j++) {
                if(A[i] + A[j + 1] == target){
                    return new int[]{i, j + 1};
                }
            }


        }

        return new int[]{-1};
    }

    public static void main(String[] args) {
        int[] array = {3,2, 3, 5, 7};
        int target = 9;
        int[] sol = findIndices(array, target);
        for (int i = 0; i < sol.length; i++){
            System.out.print(sol[i] + " ");
        }
    }
}
