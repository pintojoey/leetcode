class Solution {
    public static int maxProfit=0;
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }
   
   public static void checkMax(int [] prices, int current,int cost, int profit, boolean buy){
        for(int i=current;i<prices.length;i++){
             if(buy){
                  //System.out.println("BUY at"+prices[i]);
                  checkMax(prices,current+1,prices[i],profit,false);
             }
             else{
                
                  int curProfit = prices[i]-cost;
                  if (curProfit+profit>7)
                  maxProfit = Math.max(profit+curProfit,maxProfit);
                  checkMax(prices,current+1,0,profit+curProfit,true);
             }
        }
   }
}
