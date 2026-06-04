public class InsertionSort {

    public static void insertionSort(int[] A)
    {
      int size = A.length;
      int key, j;
      for(int  i = 1; i < size - 1; i++){
          key = A[i];
           j = i - 1;

          while(j >= 0 && A[j] > key){
              A[j + 1] = A[j ];
              j = j- 1;
          }
          A[j + 1] = key;
      }
    }
    public static void main(String[] args) {

        int array[] = {22, 44, 1, 4, 5, 9};
        int size = array.length;
        System.out.println(size);

        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();

        insertionSort(array);

        for (int j : array) {
            System.out.print(j + " ");
        }
    }

}
