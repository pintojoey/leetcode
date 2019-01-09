class Solution {
    public void nextPermutation(int[] nums) {
        boolean found = false;
	int n = nums.length;
	for (int i=n-1;i>0;i--){
	    if(nums[i-1]<nums[i]){
		int target = i-1;
		for(i=n-1;i>=0;i--){
		    
		    if (nums[i]>nums[target]){
			System.out.println(target+" "+i);
			swap(nums,target,i);		
			break;
		    }
		}
		reverse(nums,target+1);
		return;
            }
	
	}
	reverse(nums,0);
    }
    
    public static void swap(int[]nums, int i , int j){
	int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
