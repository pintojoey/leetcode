class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer>map=new HashMap<>();
        Character current=t.charAt(0);
        for (int i=0;i<t.length();i++){
           if (i<s.length()){
              char sChar = s.charAt(i);
              int count = map.getOrDefault(sChar,0)+1;
              map.put(sChar, count);
           }
           
           char tChar = t.charAt(i);
           int count = map.getOrDefault(tChar,0)-1;
           map.put(tChar,count);
        }
        for(Character key: map.keySet()){
             if (map.get(key)==-1)return key;
        }
        return current;
    }
}
