class Solution {
    public int longestPalindrome(String s) {
        char [] characters = s.toCharArray();
        HashMap<Character,Integer>map=new HashMap<>();
        for (Character ch: characters){
          int val = map.getOrDefault(ch,0);
          map.put(ch,val+1);
        }
        int length = 0;
        boolean odd = false;
        for(Character key: map.keySet()){
          int val = map.get(key);
          if (val%2!=0)odd=true;
          length += ((val-val%2));
        }
        return length + (odd?1:0);
        
    }
}
