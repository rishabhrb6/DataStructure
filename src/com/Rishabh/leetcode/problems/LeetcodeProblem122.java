package src.com.Rishabh.leetcode.problems;

/*
You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time.
However, you can buy it then immediately sell it on the same day
 */
public class LeetcodeProblem122 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0 ;
        if(prices.length < 1){
            return 0;
        }
        int minValue = prices[0];

        for(int i = 1 ; i < prices.length ; i++){
            if(prices[i] < minValue){
                minValue = prices[i];
            }
            else if(prices[i] > minValue){
                maxProfit+= (prices[i] - minValue) ;
                minValue = prices[i];
            }
        }
        return maxProfit ;

    }
}
