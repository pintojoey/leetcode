class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        if (S.isEmpty())return new int[2];

        int lines = 1;
        int chars = 0;
        int i=0;
         
        while(i<S.length()){
            int width = widths[(int)(S.charAt(i)-'a')];
            chars+=width;
            if (chars>100){
                lines++;
                chars=width;
            } 
            i++;            
            
        }

        return new int[]{lines, chars};
    }
}
