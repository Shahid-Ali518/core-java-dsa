package lamdas;

interface NumFac{
    int calFac(int n);
}

public class BlockLambdaExpression {

    public static void main(String[] args) {

        NumFac numFac = (n) -> {
            if(n == 1 || n == 0)
                return 1;
            int result = 1;
            for(int i = 1; i <= n; i++){
                result = i * result;

            }
            return result;
        };

        System.out.println(numFac.calFac(3));
        System.out.println(numFac.calFac(5));
    }
}
