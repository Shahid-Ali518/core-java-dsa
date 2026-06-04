public class SelectionSort {

    public static void selectionSort(int[] A)
    {
      int size = A.length;
      int minIndex;
      for(int  i = 0; i < size - 1; i++){
          minIndex = i;
          for (int k = i + 1; k < size ; k++) {
            if(A[minIndex] > A[k])
                minIndex = k;
          }

          int temp = A[minIndex];
          A[minIndex] = A[i];
          A[i] = temp;
      }
    }
    public static void main(String[] args) {

        int array[] = {22, 44, 1, 4, 5, 9};
        int size = array.length;
        System.out.println(size);

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        selectionSort(array);

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
