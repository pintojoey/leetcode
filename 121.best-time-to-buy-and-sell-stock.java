class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = 0;
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            if (prices[i]<minPrice){
               minPrice=prices[i];
               maxPrice = 0;
            }
   
            if (prices[i]>maxPrice){
                maxPrice=prices[i];
            }
            maxProfit=Math.max(maxProfit, maxPrice-minPrice);
        }
        return maxProfit;
    }
}
