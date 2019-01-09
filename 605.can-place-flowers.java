class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;
        int count = 0;
        int size=1;
        while(i<flowerbed.length){
            if (flowerbed[i]==0) {
               size++;
            }
            if (flowerbed[i]==1||i==flowerbed.length-1){
                 if(flowerbed[i]==0)size++;
                 count+=((size-1)/2);
                 size=0;
            }
            i++;
        }
        return count>=n;
    }
}
