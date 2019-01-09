class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        HashMap<String,Integer>mapA= new HashMap<>();
         
        for (String word: A.split(" ")){
            mapA.put(word, mapA.getOrDefault(word,0)+1);
        }
        for (String word: B.split(" ")){
            mapA.put(word, mapA.getOrDefault(word,0)+1);
        }
        List<String>result = new ArrayList<>();
        for (String word: mapA.keySet()){
            if (mapA.get(word)==1)result.add(word);
        }
        return result.toArray(new String[0]);
    }
}
