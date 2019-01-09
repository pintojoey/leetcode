class Solution {
    public String longestWord(String[] words) {
        HashSet<String>wordset=new HashSet<>();
        List<String>wordlist=new ArrayList<>();
        for(String word:words){
            wordlist.add(word);
        }
        Collections.sort(wordlist);
        Collections.reverse(wordlist);
        wordset.addAll(wordlist);
        String best="";
        for(String word:wordlist){
            //System.out.println("word->"+word);
            if(wordset.contains(word)){
                int n = word.length();
                boolean valid = true;
            	for(int i=0;i<n-1;i++){
                    //System.out.println(i+" "+n+"subs->"+word.substring(0,n-i-1));
                    if(!wordset.contains(word.substring(0,n-i-1))){
                        valid = false;
                        break;
                    }
                }
                if(valid){
                       //System.out.println("HERE");
                       if(best.length()<n)best=word;
                       else if (best.length()==n){  
                           if(word.compareTo(best)<=0)
                           best=word;
                       }
                }
            }
        }
        return best;
    }
}
