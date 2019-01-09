class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for (int i =0;i<nums1.length;i++){
            boolean found = false;
            boolean indexed = false;
            for(int j=0;j<nums2.length;j++){
                if (!indexed&& nums1[i]==nums2[j]){
                   indexed = true;
                   continue;
                }
               
                if (indexed && nums2[j]>nums1[i]){
                    nums1[i]=nums2[j];
                    found = true;
                    break;
                }
            }
            if(!found)nums1[i]=-1;
        }
        return nums1;
    }
}
