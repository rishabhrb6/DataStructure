package src.com.Rishabh.leetcode.problems;

/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the
future to sell that stock.
 */
public class LeetcodeProblem121 {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        if(prices.length < 1 ){
            return 0;
        }
        int minVal = prices[0];
        for(int i= 1 ; i < prices.length ; i++){
            if(prices[i] < minVal){
                minVal = prices[i];
            }
            else if( prices[i] > minVal && ( prices[i] - minVal) > maxProfit){
                maxProfit = prices[i] - minVal ;
            }
        }



        return maxProfit;
    }
}
