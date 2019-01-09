class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double sum = 0; 
        double maxSum = 0;
        for (int i=0;i<k;i++){
           sum+=nums[i];
        }
        maxSum = sum;
        for (int i=0;i<n-k;i++){
           sum-=nums[i];
           sum+=nums[k+i];
           maxSum=Math.max(maxSum, sum);
        }
        return maxSum/k;
    }
}
