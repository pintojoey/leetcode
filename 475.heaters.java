class Solution {
    public int findRadius(int[] houses, int[] heaters) {
    	int max = 0;
        for(Integer house:houses){
           max=Math.max(max,Math.abs(findClosest(heaters, heaters.length,house)-house));
        } 
        return max;   
    }
    /*
    public static int closestHeater(int house, int[]heaters){
        if (house <= heaters[0]) 
           return Math.abs(heaters[0]-house); 
        if (house >= heaters[heaters.length - 1]) 
            return Math.abs(heaters[heaters.length - 1]-house); 

        int l = 0;
        int r = heaters.length-1;
        int mid=0;
        while(l<=r){
            mid = l + (r-l)/2;
            if (heaters[mid]==house)return 0;
            else if (house<heaters[mid])r=mid-1;
            else l=mid+1;
        }
        int min = 0;
	if (l>-1 && l<heaters.length)
             min = Math.abs(heaters[l]-house);
        if (r>-1 && r<heaters.length)
             min = Math.min(min, Math.abs(heaters[r]-house));
        if (mid>-1 && mid<heaters.length)
             min = Math.min(min, Math.abs(heaters[mid]-house));
        System.out.println(min);
        return min;
    }*/
// Returns element closest to target in arr[] 
int findClosest(int arr[], int n, int target) 
{ 
    // Corner cases 
    if (target <= arr[0]) 
        return arr[0]; 
    if (target >= arr[n - 1]) 
        return arr[n - 1]; 
  
    // Doing binary search 
    int i = 0, j = n, mid = 0; 
    while (i < j) { 
        mid = (i + j) / 2; 
  
        if (arr[mid] == target) 
            return arr[mid]; 
  
        /* If target is less than array element, 
            then search in left */
        if (target < arr[mid]) { 
  
            // If target is greater than previous 
            // to mid, return closest of two 
            if (mid > 0 && target > arr[mid - 1]) 
                return getClosest(arr[mid - 1], 
                                  arr[mid], target); 
  
            /* Repeat for left half */
            j = mid; 
        } 
  
        // If target is greater than mid 
        else { 
            if (mid < n - 1 && target < arr[mid + 1]) 
                return getClosest(arr[mid], 
                                  arr[mid + 1], target); 
            // update i 
            i = mid + 1;  
        } 
    } 
  
    // Only single element left after search 
    return arr[mid]; 
} 
  
// Method to compare which one is the more close. 
// We find the closest by taking the difference 
// between the target and both values. It assumes 
// that val2 is greater than val1 and target lies 
// between these two. 
int getClosest(int val1, int val2, 
               int target) 
{ 
    if (target - val1 >= val2 - target) 
        return val2; 
    else
        return val1; 
}
}
