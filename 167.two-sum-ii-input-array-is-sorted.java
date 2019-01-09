class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        for(Integer num:numbers){
            int find = binarySearch(numbers, target-num);
            if (find!=-1 && i!=find)return i<find?new int[]{i+1,find+1}:new int[]{find+1,i+1};
            i++;
        }
        return new int[2];
    }
 
    public static int binarySearch(int[]numbers, int target){
         int l = 0;
         int r = numbers.length-1;
         
         while(l<=r){
             int mid = l+(r-l)/2;
             if (numbers[mid]==target)return mid;
             else if (numbers[mid]>target){ r = mid-1;}
             else l=mid+1;
         }
         return -1;
 
    }
   
}
