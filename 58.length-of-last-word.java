class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int n = s.length();
        int i=n-1;
        boolean blank = true;
	while(i>=0){
	     if (s.charAt(i)==' '&&!blank)break;
             else blank = false;
             i--;
	}
        return n-i-1;
    }
}
