class Solution {
    List<String>result;
    public List<String> letterCasePermutation(String S) {
        result = new ArrayList<>();
        result.add(S);
        permute(S,0,result);
        Collections.sort(result);
        Collections.reverse(result);
        return result;
    }
    
    public void permute(String S, int i, List<String>result){
       if (i==S.length())return;
       String word=null;
       for (int j=i;j<S.length();j++){
           char c = S.charAt(j);
           if (c>='a'&&c<='z'){ 
              word=S.substring(0,j)+(char)('A'+c-'a')+S.substring(j+1);
              break;
           }
           else if (c>='A'&&c<='Z'){
              word=S.substring(0,j)+(char)('a'+c-'A')+S.substring(j+1);
              break;
           }
           
       
       }
       if (word!=null &&!result.contains(word))result.add(word);
       permute(S,i+1,result);
       if (word!=null && i<=S.length()){permute(word,i+1,result);}
    }
}
