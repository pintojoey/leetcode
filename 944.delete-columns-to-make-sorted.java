class Solution {
    public int minDeletionSize(String[] A) {
        if(A.length==0 || A[0].length()==0)return 0;
        int d = 0;
        for (int i=0;i<A[0].length();i++){
            Character ch=null;
            for (int j=0;j<A.length;j++){
               char current = A[j].charAt(i);
               if (ch==null || ch<=current){
                  ch = current;
               }
               else { 
                d++; break; 
               }
            }
        }
        return d;
    }
}
