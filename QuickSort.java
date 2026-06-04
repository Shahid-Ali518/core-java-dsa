public class QuickSort {

    public static void quickSort(int[] array, int left , int right){

        if(left < right){

            int pivot = partition(array, left, right);
            quickSort(array, left, pivot - 1);
            quickSort(array, pivot + 1, right);
        }

    }

    public static int partition(int[] array, int left, int right) {
        int l = left, r = right;
        int pivot = left;

        while(l < r){

            while (array[l] <= array[pivot] && l < r)
                l++;

            while (array[r] > array[pivot])
                r--;

            if(l < r){
                int temp = array[l];
                array[l] = array[r];
                array[r] = temp;
            }


        }
        int temp = array[r];
        array[r] = array[pivot];
        array[pivot] = temp;;
        return r;
    }


    public static void main(String[] args) {

        int[] array = {4, 5, 1, 3, 2};
        quickSort(array, 0, array.length - 1);
        for (int i : array) System.out.print(i + " ");
        System.out.println();

    }
}
