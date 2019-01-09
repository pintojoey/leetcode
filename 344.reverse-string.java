class Solution {
    public String reverseString(String s) {
        char []og = s.toCharArray();
        int n = og.length;
        char [] reverse=new char[n];
        for (int i=0;i<n;i++)
	   reverse[i]=og[n-i-1];
	return String.valueOf(reverse);
    }
}
