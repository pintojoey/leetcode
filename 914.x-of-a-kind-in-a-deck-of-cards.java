class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer>map = new HashMap<>();
	for (int card : deck){
	    map.put(card,map.getOrDefault(card,0)+1);
	}
        Integer gcd = null;
	for (Integer card: map.keySet()){
           if (map.get(card)<2)return false;
           if (gcd==null)gcd = map.get(card);
           else gcd=GCD(gcd, map.get(card));
        }
        return gcd>1;
    }
    
    public static int GCD(int A, int B){
        while (A!=B){
            if(A>B)A=A-B;
            else if(B>A)B=B-A;
        }
        return B;
    }
}
