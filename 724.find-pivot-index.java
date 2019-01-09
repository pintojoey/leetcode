class Solution {
    public int pivotIndex(int[] nums) {
        int l[]=new int[nums.length];
        int r[]=new int[nums.length];
        int lsum=0,rsum=0,n=nums.length;
        for(int i=0;i<nums.length;i++){
	    lsum+=nums[i];
            l[i]=lsum;
            rsum+=nums[n-i-1];
            r[n-i-1]=rsum;
            
        }
        for(int i=0;i<n;i++){
           if(i==0 && r[1]==0) return i;
           else if (i==n-1 && l[n-2]==0) return i;
           else if(i!=0 && i!=n-1 && l[i-1]==r[i+1])return i;
        }
        return -1;

    }
}
