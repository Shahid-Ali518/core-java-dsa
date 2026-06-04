public class Recursion {


    public static void print(int n){
        if(n > 1)
            print(n - 1);

        System.out.print(n + " ");
    }

    public static void printN(int n){

        System.out.print(n + " ");
        if(n > 1) {
            printN(n - 1);
        }
    }

    public static int sumN(int n){
        if(n == 0)
            return 0;
        return sumN(n - 1) + n * n;
    }

    public static int sum(int n){
        if(n < 1)
            return 0;
        return sum(n - 1) + n;
    }

    public static double sum(double a, int n){
        if(n == 0)
            return 1;
        return 1 + a * sum(a, n- 1);
    }

    public static int fib(int n){
        if(n < 2)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static int sumOfNaturalNumber(int n){

        if(n == 1)
            return n;
        return sumOfNaturalNumber(n - 1) + n;
    }


    public static int factorial(int n) {
        if(n == 1 || n == 0)
            return 1;

        return n * factorial(n - 1);
    }

    public static int sumOfSquares(int n){
        if(n == 1){
            return 1;
        }
        return sumOfSquares(n - 1) + n * n;
    }

    public static int xToPowerN(int x, int n){
        if(n == 1)
            return x;
        return xToPowerN(x, n - 1) * x;
    }

    public static void printArray(int[] A, int n){
        if(n > 1)
            printArray(A, n - 1);

        System.out.print(A[n - 1] + " ");
    }

    public static int sumOfArrayElements(int[] A, int n){
        if(n == 1)
            return A[n - 1];
        return sumOfArrayElements(A, n - 1) + A[n - 1];

    }

    public static void main(String[] args) {

        print(5);
        System.out.println();

        int sum = sum(5);
        System.out.println(sum);

        printN(5);
        System.out.println();

        int s = sumN(5);
        System.out.println(s);

        double value = sum(2.5, 5);
        System.out.println(value);

        int fib = fib(5);
        System.out.println(fib);

        System.out.println(sumOfNaturalNumber(6));

        System.out.println(factorial(6));

        System.out.println(sumOfSquares(6));

        System.out.println(xToPowerN(2, 5));

        int[] array = {1, 2, 3, 4, 5, 6};
        printArray(array, array.length);
        System.out.println();

        System.out.println(sumOfArrayElements(array, array.length));
    }


}
