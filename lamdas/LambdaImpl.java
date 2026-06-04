package lamdas;

interface Number{
    double getValue();
}

interface CheckEven {
    boolean check(int n);
}



public class LambdaImpl {

    public static void main(String[] args) {

        Number number = () -> 123.45;

        System.out.println("Number: " + number.getValue());

        CheckEven isEven = (n) -> (n % 2) == 0;

        if(isEven.check(10)) System.out.println("Even number");
        if(!isEven.check(11)) System.out.println("Even number");

        isEven = (n ) ->(n >= 0);
        if(isEven.check(10)) System.out.println("Number is positive");
        if(!isEven.check(-10)) System.out.println("Number is negative");


    }
}
