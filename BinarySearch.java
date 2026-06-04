import java.util.Random;

public class BinarySearch {

    // method to sort the array
    public static int BubbleSort(int[] array){
        int size = array.length;
        int count = 0;
        boolean swapped = false;
        for (int i = 0; i < size - 1; i++) {
//            swapped = false;
            for (int j = 0; j < size - i - 1; j++) {
                if(array[j] > array[j + 1] ){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                    count++;
                }
            }
            if(!swapped)
                return  -1;
        }
        return count;
    }

    // method to find element
    public static int binarySearch(int[] array, int key){
        int size = array.length;
        int high = size - 1;
        int low = 0;
        int mid;

        while(low <= high){

            mid = low + (high - low) / 2;
            if(array[mid] == key)
                return mid;
            if(key > array[mid])
                low = mid + 1;
            else
                high = mid - 1;

        }

        return -1;


    }

    public static void main(String[] args) {

        Random random = new Random();
        int[] array = {35, 33, 32, 40, 34, 31};
//        for (int i = 0; i < 10; i++) {
//            array[i] = random.nextInt(50);
//            System.out.print(array[i] + " ");
//        }
        System.out.println();
         int count = BubbleSort(array);
        for (int i = 0; i < 6; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println(count);

        int found = binarySearch(array, 10);
        if(found > -1)
            System.out.println("Element Found: " + array[found]);
        else
            System.out.println("Element not found");


    }
}
