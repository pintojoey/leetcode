class Solution {
    public String reverseVowels(String s) {
        char []ch = s.toCharArray();
        LinkedHashMap<Integer, Character> map = new LinkedHashMap<>();
        for (int i=0; i<ch.length; i++){
            char c = ch[i];
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
               c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            map.put(i,c);
        }
        ArrayList<Character>vowels = new ArrayList(map.values());
        ArrayList<Integer>locs = new ArrayList(map.keySet());
        int n = locs.size();
        for (int i=0;i<n;i++){
            ch[locs.get(i)]=vowels.get(n-i-1);
        }
        return String.valueOf(ch);
    }
}
