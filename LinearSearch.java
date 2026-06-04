import java.util.Random;

public class LinearSearch {

    public static int linearSearch(int[] array, int key){
        int size = array.length;

        for(int i = 0; i < size; i++){
            if(array[i] == key)
                return i;

        }
        return -1;

    }
    public static void main(String[] args) {

        int[] array = new int[10];

        Random random = new Random();
        for(int i = 0; i< 10; i++){
            array[i] = random.nextInt((50 -  10));
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int found = linearSearch(array, 10);
        if(found > -1)
            System.out.println("Element Found: " + array[found]);
        else
            System.out.println("Element not found");
    }



}
