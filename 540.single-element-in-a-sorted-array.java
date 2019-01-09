class Solution{
public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int mid;
        while(low<high){

            mid = (high-low)/2 + low;

            if (mid%2 == 0){
                if (high-low==1){
                    return nums[low];
                }
                if(nums[mid]!=nums[mid+1]){
                    high = mid-1;
                }
                else low = mid+1;
            }
            else {
                if (high-low==1){
                    return nums[high];
                }
                if(nums[mid]!=nums[mid-1]){
                    high = mid-1;
                }
                else low = mid+1;
            }

        }
        return nums[high];
    }
}
