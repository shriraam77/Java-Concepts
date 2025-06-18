package leetcode;

import java.util.HashMap;
import java.util.Map;

public class BestTimeBuySellStocks {

/*
Input: prices = [7,1,5,3,6,4]

Output: 5

Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

*/
	
	public static int maxProfit(int[] prices) 
	{
		// 7 1 5 3 6 4
		int buyPrice = prices[0];
		int sellPrice = 0;
		int profit = 0;
		
		for(int i =1; i<prices.length;i++)
		{
			if(prices[i] < buyPrice)
			{
				buyPrice = prices[i];
			}
			else
			{
				profit = Math.max(profit, prices[i]-buyPrice);
				//profit = prices[i] - buyPrice;
			}
		}
		
		return profit;
	}

//	public static int maxProfit(int[] prices) 
//	{		
//		Map priceMap = new HashMap<>();
//		int leastDay = -1;
//		int maxDay	 = -1;
//		
//		for(int i = 0; i<prices.length; i++)
//		{
//			priceMap.put(i+1, prices[i]);
//			
//			if(i==0)
//				leastDay = prices[i];
//			
//			if(leastDay > prices[i])
//				leastDay = prices[i];
//			
//			if(maxDay < prices[i])
//				maxDay = prices[i];
//		}
//		
//		return 0; 
//	}

	public static void main(String[] args) 
	{
		//int prices[] = {7,1,5,3,6,4};
		int prices[] = {7,6,4,3,1};
		
		System.out.println(maxProfit(prices));
		

	}

}
