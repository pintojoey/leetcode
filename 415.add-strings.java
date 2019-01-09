class Solution {
    public String addStrings(String num1, String num2) {
        char A[]=num1.toCharArray();
        char B[]=num2.toCharArray();
   
        int n = Math.max(A.length,B.length);
        char C[]=new char[n+1];
        int carry = 0;
        StringBuilder builder=new StringBuilder();
        boolean zero = true;
        for(int i=0;i<=n;i++){
           int sum = carry;
           if (A.length>i){
              sum+=(A[A.length-i-1]-'0');
           }
           if (B.length>i){ 
              sum+=(B[B.length-i-1]-'0');
           }
           carry = sum>9?1:0;
           sum = sum%10;
           if (zero&&sum>0)zero=false;
           builder.insert(0,(char)('0'+sum));
        }
        String result = builder.toString();
        if (zero)return "0";
        return result.replaceFirst("^[0]*", "");
        
    }
}
