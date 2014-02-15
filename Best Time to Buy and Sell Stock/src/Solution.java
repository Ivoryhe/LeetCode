/**
 * Feb-14-2014
 * @author Ivoryhe
 * Best Time to Buy and Sell Stock
 * 
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * If you were only permitted to complete at most one transaction 
 * (ie, buy one and sell one share of the stock), 
 * design an algorithm to find the maximum profit.
 */
public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1){return 0;}
        int min = prices[0];
        int max = 0;
        for(int i=1; i<prices.length; i++){
            if(max < prices[i]-min){
                max = prices[i]-min;
            }
            if(min > prices[i]){
                min = prices[i];
            }
        }
        return max;
    }
}