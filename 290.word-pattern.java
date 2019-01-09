class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character,Integer>charMap = new HashMap<>();
        HashMap<String,Integer>wordMap = new HashMap<>();
        StringBuilder charBuilder = new StringBuilder();
        int index = 0;
        for(Character ch: pattern.toCharArray()){
             if(!charMap.containsKey(ch)){
                 charMap.put(ch,index++);
             }
             charBuilder.append(charMap.get(ch));
        }
        StringBuilder wordBuilder = new StringBuilder();
        index=0;
        for(String word: str.split(" ")){
             if(!wordMap.containsKey(word)){
                 wordMap.put(word,index++);
             }
             wordBuilder.append(wordMap.get(word));
        }
        return charBuilder.toString().equals(wordBuilder.toString());
    }
}
