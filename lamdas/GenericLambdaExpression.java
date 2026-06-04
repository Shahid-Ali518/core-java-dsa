package lamdas;

interface SomFunc<T>{
    T apply(T t);
}

public class GenericLambdaExpression {

    public static void main(String[] args) {

        // use for calculate factorial
        SomFunc<Integer> factorial = (n) ->{

            int result = 1;

            for (int i = 1; i <= n; i++)
                result *= i;

            return result;
        };

        // use for reverse a string

        SomFunc<String> reverse = (str) ->{
            String result = "";
            for(int i = str.length()- 1; i>= 0; i--)
                result += str.charAt(i);

            return result;
        };

        System.out.println("Factorial: " + factorial.apply(5));
        System.out.println("String Reversed: " + reverse.apply("Shahid"));

    }
}
