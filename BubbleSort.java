
import static java.util.Collections.swap;

public class BubbleSort {

    public static void sort(int[] A, int size )
    {
//        int size = A.length;
        boolean flag ;
        int i, j, temp;
        for (i = 0;  i < size - 1 ; i++) {
            flag = false;
            for(j = 0; j < size  - 1 ; j++){
                if(A[j] > A[j + 1]){
                    temp = A[j];
                    A[j] = A[j + 1];
                    A[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                break;
          }
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

        sort(array, size);

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
