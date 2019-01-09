class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        int n = bits.length;
        if (n<=1) return true;
        while (true){
           if (i>=n-2)return bits[i]==0;
           if (bits[i]==1){
               i+=2;
           }
           else i++;
        }
    }
}
