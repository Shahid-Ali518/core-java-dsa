

public class CutRodProblem {

    public static int rodCut(int[] price, int n){

        if(n == 0)
            return 0;

        int maxProfit = Integer.MIN_VALUE;

        for (int i = 1; i < n ; i++) {
            maxProfit = Math.max(maxProfit, price[i] + rodCut(price, n - i - 1));
        }

        return maxProfit;
    }


    public static void main(String[] args) {

        int[] prices = {1, 5, 8, 9, 10, 17, 17, 20};

        System.out.println(rodCut(prices, 4));

    }
}
