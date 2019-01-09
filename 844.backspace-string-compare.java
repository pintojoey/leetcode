class Solution {
    public boolean backspaceCompare(String S, String T) {
        int s = S.length()-1;
        int t= T.length()-1;
        int n = Math.max(s,t);
 
        int bckS=0;
        int bckT=0;
        char sChar = S.charAt(s);
        char tChar = T.charAt(t);

        while (s>=0 && t>=0){
            sChar = S.charAt(s);
            tChar = T.charAt(t); 
//            System.out.println(sChar+" "+tChar+" "+bckS+" "+bckT);
            if (sChar=='#'){bckS++;s--;}
            else if (bckS>0){s--;bckS--;if(s>=0)sChar = S.charAt(s);}
            
            if (tChar=='#'){bckT++;t--;}
            else if (bckT>0){t--;bckT--;if(t>=0)tChar = T.charAt(t);}
            
            if (tChar!='#'&&sChar!='#' &&bckS==0 &&bckT==0 &&(s>=0 || t>=0)){
		if(tChar!=sChar)
                    return false;
                else {s--;t--;}
            }
        }
  //      System.out.println(sChar+" "+tChar+"->"+s+" "+t +" "+bckS+" "+bckT);
        if (t<s&& s<0)return false;
        if (s==0&&t==-1 ||s>1)return false;
        return true;
    }
}
