/**
 * Feb-10-2014
 * @author Ivoryhe
 * Best Time to Buy and Sell Stock II 
 * 
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * Design an algorithm to find the maximum profit. 
 * You may complete as many transactions as you like 
 * (ie, buy one and sell one share of the stock multiple times). 
 * However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int sum = 0;
        for(int i=1; i<prices.length; i++){
            int a = prices[i-1];
            int b = prices[i];
            if(b-a > 0){
                sum = sum + (b-a);
            }
        }
        return sum;
    }
}