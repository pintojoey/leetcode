class Solution {
    public String convertToBase7(int num) {
        if (num==0)return "0";
        boolean sign = num < 0;
        if (sign){num*=(-1);}
        StringBuilder builder = new StringBuilder();
        while(num>0){
            builder.insert(0, num%7);
            num/=7;
        }
        return (sign?"-":"")+builder.toString();
    }
}
