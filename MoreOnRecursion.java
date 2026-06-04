public class MoreOnRecursion {

    public static int taskA(int n){
        if(n <= 0)
            return 0;
        System.out.print(n + " ");
        return taskA(n - 1);
    }

    public static int taskB(int n, int a){
        if(n <= 0)
            return a;
        System.out.print((n + a) + " ");
        return taskB(n - 1, a + 1);
    }


    public static int taskC(int n, int a, int b){
        if(n <= 0)
            return a + b;
        System.out.print(a + "," +  b + " ");
        return taskC(n - 1, b, a + b);
    }


    public static int taskD(int n, int a, int b){
        if(n <= 0)
            return a - b;
        System.out.print(n + " " + a + " " +  b + " ");

        int x = taskD(n - 1, a + 1, b + 2);
        int y = taskD(n - 2, a + 2, b + 3);

        return x + y;
    }

    // check if array is sorted or not
    public static boolean checkArraySorted(int[] array, int n){
        boolean inOrder = true;
        if(n == 0)
            return inOrder;
        if (array[n] < array[n - 1])
            return false;
        return checkArraySorted(array, n - 1);
    }

    // method to find largest element
    public static int findLargestElement(int[] array, int n){

        if(n == 0)
            return array[0];
        int max = findLargestElement(array, n - 1);
        if(array[n] > max)
            return array[n];
        else
            return max;
    }

    // method to reverse an array
    public static int F(int a, int b){
        if(a <= 0)
            return b;
        else {
            int temp = F(a - 2, b * 2);
            temp = temp - a;
            System.out.print(temp + " ");
            return temp;
        }

    }

    public static int foo(int n, int a, int b){
        if(n == 1){
            System.out.print(a + " " + b + " ");
            return a;
        }
        else{
            System.out.print(n + a + b + " ");
            int temp = foo(n - 2, a, b);
            temp = temp * b;
            System.out.print(temp  + " ");
            return temp;
        }

    }



    public static void main(String[] args) {
//        taskA(5);
        System.out.println("\nValue of TaskA = " + taskA(5));

//        taskB(3, 2);
        System.out.println("\nValue of TaskB = " + taskB(3, 2));

        System.out.println("\nValue of TaskC = " + taskC(4, 0, 1));

        System.out.println("\nValue of TaskD = " + taskD(3, 1, 2));

        System.out.println("\nValue of TaskD = " + taskD(4, 3, 4));

        int[] array = {2, 4, 6, 8, 10};
        int[] arr = {1, 5, 2, 19, 4, 80};

        System.out.println(checkArraySorted(array, array.length - 1));

        System.out.println(checkArraySorted(arr, array.length - 1));

        System.out.println(findLargestElement(arr, arr.length - 1));



        F(5, 4);
        System.out.println();

        foo(7, 4, 2);

    }
}
