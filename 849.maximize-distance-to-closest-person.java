class Solution {
    public int maxDistToClosest(int[] seats) {
        int left = -1;
        int right = 0;
        int maxDist=0;
         
        while(right<seats.length){
            if(seats[right]==1){
                if (left==-1) maxDist=Math.max(maxDist,(right));
                else maxDist=Math.max(maxDist,(right-left)/2);
                left=right;
            }
            right++;

        }
        maxDist=Math.max(maxDist,(right-left)-1);
        return maxDist;
    }
}
