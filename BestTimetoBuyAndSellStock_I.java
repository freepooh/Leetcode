/**
	Best Time to Buy and Sell Stock

	Say you have an array for which the ith element is the price of a given stock on day i.
	If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), 
	design an algorithm to find the maximum profit.
*/

public class Solution {
    public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(prices.length<=1)
            return 0;
        
        int max=prices[0], min=prices[0], maxProfit=0;
        int index=1;
        while(index<=prices.length-1){
            if(prices[index]>max){
                maxProfit=(maxProfit>prices[index]-min)?maxProfit:prices[index]-min;
                max=prices[index];
            }else{
                if(prices[index]<min){
                    maxProfit = (maxProfit>max-min)?maxProfit:max-min;
                    min=prices[index];
                    max=min;
                }
            }
            index++;
        }
        return maxProfit;
    }
}