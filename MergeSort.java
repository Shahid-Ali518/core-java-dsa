public class MergeSort {

    public static void mergeSort(int[] A, int left, int right){

        if(left < right){
            int mid = left + (right - left) / 2;

            mergeSort(A, left, mid);
            mergeSort(A, mid + 1, right);

            merge(A, left, mid, right);
        }
    }

    public static void merge(int[] A, int left, int mid, int right){
        int leftArraySize = mid - left + 1;
        int rightArraySize = right - mid;

        int[] leftArray = new int[leftArraySize];
        int[] rightArray = new int[rightArraySize];

        for (int i = 0; i < leftArraySize; i++) {
            leftArray[i] = A[left + i];
        }

        for (int i = 0; i < rightArraySize; i++) {
            rightArray[i] = A[mid  + i + 1];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while(i < leftArraySize && j < rightArraySize){
            if(leftArray[i] <= rightArray[j]){
                A[k] = leftArray[i];
                i++;
            }
            else{
                A[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while(i < leftArraySize){
            A[k] = leftArray[i];
            i++;
            k++;
        }

        while(j < rightArraySize){
            A[k] = rightArray[j];
            j++;
            k++;
        }
    }


    public static void main(String[] args) {

        int[] array = {12, 32, 10, 11, 4, 6, 8, 7, 5, 3};
        mergeSort(array, 0, array.length - 1);

        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
