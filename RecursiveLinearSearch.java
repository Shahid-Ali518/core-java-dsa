

public class RecursiveLinearSearch {

    public static int LinearSearch(int[] array, int size, int key){

        // check if size becomes 0, means no element match with key
        if(size == 0)
            return -1;

        //
        else if(array[size - 1] == key)
            return size - 1;

        return LinearSearch(array, size - 1, key);
    }

    // actual function
    public static int binarySearch(int[] array, int low , int high, int key){

        if(low > high)
            return -1;
        int mid = low + (high - low) / 2;
        if(array[mid] == key)
            return mid;
        else if(key < array[mid])
            return binarySearch(array, low, mid - 1, key);

        else return binarySearch(array, mid + 1, high, key);
    }

    public static int BinarySearch(int[] array, int size, int key){

        int high = size - 1;
        int low = 0;
        return binarySearch(array, low, high, key);

    }


    public static void main(String[] args) {

        // linear search
        int[] array = {1, 3, 5, 6, 7};
        int isFound = LinearSearch(array, array.length, 5);
        if(isFound > -1)
            System.out.println(array[isFound] + " is Present at index " + isFound);
        else
            System.out.println("Element is not present in given array");


        // binary search
        int isMatch = BinarySearch(array, array.length, 7);
        if(isMatch > -1)
            System.out.println(array[isMatch] + " is Present at index " + isMatch);
        else
            System.out.println("Element is not present in given array");
    }
}
