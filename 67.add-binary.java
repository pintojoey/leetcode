class Solution {
    public String addBinary(String a, String b) {
        char []A = a.toCharArray();
        int aLen = A.length;
        char []B = b.toCharArray();
        int bLen = B.length;

        char result[] = new char[Math.max(aLen, bLen)+1];
        int n = result.length;
        int val = 0;
        for (int i=0;i<n;i++){
            if (i<aLen){
                val += (A[aLen-i-1]=='1'?1:0); 
            }
            if (i<bLen){ 
                val += (B[bLen-i-1]=='1'?1:0);
            }
            if(val<2){
                 result[n-i-1] = (val==1?'1':'0');
                 val=0; 

            }
            else { 
                 result[n-i-1] = (val==2?'0':'1');
                 val=1;
            }
        }
        String output = new String(result);
        for(int i=0;i<n-1;i++){
           if (result[i]!='0')return output.substring(i);
        }
        return output.substring(n-1);
    }
}
