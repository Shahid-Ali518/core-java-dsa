package leetcode;


public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices){
        int profit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int price : prices){
            if (price < minPrice)
                minPrice = price;
            else if(price - minPrice > profit)
                profit = price - minPrice;
        }

        return profit;

//        for (int i = 0; i <= prices.length -1; i++){
//            for(int j = i + 1; j <= prices.length - 1; j++){
//                if (prices[i] < prices[j]){
//                    if(prices[j] - prices[i] > profit)
//                        profit = prices[j] - prices[i];
//                }
//
//            }
//        }




    }

    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};

        System.out.println(maxProfit(prices));

        int[] price = {2,4,1};

        System.out.println(maxProfit(price));

    }
}
