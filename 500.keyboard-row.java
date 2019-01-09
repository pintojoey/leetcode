class Solution {
    public String[] findWords(String[] words) {
        HashMap<Character,Integer> map=new HashMap<>();
       
        String []rows=new String[]{"qwertyuiop","asdfghjkl","zxcvbnm"};
        int i = 0;
        for(String row:rows){
           for(Character ch:row.toCharArray()){
               map.put(ch,i);
           }
           i++;
        }
        List<String>result = new ArrayList<>();
        for(String word:words){
            boolean valid = true;
            Integer keyrow = null;
            for(Character ch:word.toLowerCase().toCharArray()){ 
                int row = map.get(ch);
                if(keyrow==null)keyrow=row;
                else if (keyrow!=row){valid=false;break;}
            }
            if(valid)result.add(word);
        }
        return result.toArray(new String[0]);
    }
}
