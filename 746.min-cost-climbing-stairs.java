class Solution {
    public static int[]cost;
    public static HashMap<Integer,Integer>memory;
    public int minCostClimbingStairs(int[] costs) {
         cost=costs;
         memory=new HashMap<>();
         return minCost(costs.length);
    }
     
    public int minCost( int destination){
             if(memory.containsKey(destination))return memory.get(destination);
             int min = destination<cost.length?cost[destination]:0;
             if (destination<=1)min= cost[destination];
             else min= Math.min(minCost(destination-1)+min,
                             minCost(destination-2)+min);
             memory.put(destination,min);
             return min;
    }
}
