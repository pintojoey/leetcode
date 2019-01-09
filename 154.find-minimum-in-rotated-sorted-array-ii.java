class Solution {
    public int findMin(int[] nums) {
        int l =0;
	int r = nums.length-1;
	
	while(l<r){
		int mid = l+(r-l)/2;
		System.out.println(l+" "+r+" "+mid);
                
		if (mid-1>=0 && nums[mid-1] > nums[mid] ){
			return nums[mid];
		}
		if (mid+1<nums.length && nums[mid] > nums[mid+1] ){
                        return nums[mid+1];
                }
		if (nums[l]==nums[r]){
			r--;
			continue;
		}
		else if (nums[l]==nums[mid]){
			r=mid-1;continue;
		}
		else if (nums[mid]==nums[])
                if (nums[l]>nums[mid]) {
			r=mid-1;
		}
		else if (nums[r]>nums[mid]){
			l=mid+1;
		}
	}
        return nums[0];
    }
}



