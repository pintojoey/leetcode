class Solution {
    public boolean judgeSquareSum(int c) {
        int n = (int)Math.ceil(Math.pow(c,0.5)+1);
  
        for (int i=0;i<=n;i++){
            for (int j=n;j>=i;j-- ){
                int val = (int)(Math.pow(i,2)+Math.pow(j,2));
                if (val==c)return true;
            }
        }
        return false;
    }
}
