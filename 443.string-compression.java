class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int j = 0;
        int count =0;
        Character c =null;
        int n = chars.length;
        while(i<=n){
           Character ch;
           if (i==n) ch=null;
           else  ch = chars[i];

           if(c==null){c=ch;count++;}
           else if (c==ch)count++;
           if (c!=ch) {
                chars[j++]=c;
                if (count!=1){
                     String countWord = String.valueOf(count);
                     for(int x = 0;x<countWord.length();x++){
                         chars[j++]=countWord.charAt(x);
                     }
                }
                if (i<n){
                  c = chars[i];
                 count=1;
                }
           } 
	           i++;

        }
        return j;
    }
}
