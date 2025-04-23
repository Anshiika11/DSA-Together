Problem : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/1615309026/
TC = O(n)
SC = O(1)
Solution :
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int bestBuy=prices[0];
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]>bestBuy){
                maxProfit=Math.max(maxProfit,prices[i]-bestBuy);
            }
            bestBuy=Math.min(bestBuy,prices[i]);
        }
        return maxProfit;
    }
}
