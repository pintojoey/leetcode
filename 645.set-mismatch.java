class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer>set = new HashSet<>();
        int n = nums.length;
        int duplicate = 0;
        long sum =(n*(n+1)/2);
        for (int i=0;i<n;i++){
	   if (set.contains(nums[i]))duplicate=nums[i];
           sum-=nums[i];
           set.add(nums[i]);
        }
       return new int[]{duplicate,duplicate+(int)sum};
    }
}
