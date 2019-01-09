class Solution {
    public boolean isPerfectSquare(int num) {
        for(int i=num/2+1;i>0;i--){
            if(i*i==num)return true;
        }
        return false;
    }
}
