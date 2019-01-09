class Solution {
    public int distributeCandies(int[] candies) {
	Set<Integer>count = new HashSet<>();
 
        for (Integer candy: candies){
            count.add(candy);
        }
        return Math.min(candies.length/2,count.size());
    }
}
