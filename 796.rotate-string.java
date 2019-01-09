class Solution {
    public boolean rotateString(String A, String B) {
        if (A.length()!=B.length())return false;
        if (A.length()==0)return true;
        for(int i=0;i<A.length();i++){
            if(B.startsWith(A.substring(i))&&B.endsWith(A.substring(0,i)))return true;
        }
        return false;
    }
}
