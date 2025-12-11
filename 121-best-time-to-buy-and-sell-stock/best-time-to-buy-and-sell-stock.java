
class Solution {
    public int maxProfit(int[] prices) {
        int i = 0, j = 1, profit = 0;
        if(prices==null || prices.length<2){
            return 0;
        }
        while(j<prices.length){
            if(prices[j]>prices[i]){
            profit = Math.max(profit, prices[j] -prices[i]);
        }
        
        else{
            i=j;
        }
        j++;
        }
        return profit;
    }
}
    