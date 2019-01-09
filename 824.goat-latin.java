class Solution {
    public String toGoatLatin(String S) {
        String words[] = S.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i=0;i<words.length;i++){

            if(i!=0)result.append(" ");
 
            String word = words[i];
            char start = word.toLowerCase().charAt(0);
            if (start=='a'||start=='e'||start=='i'||start=='o'||start=='u'){
                result.append(word);
            }
            else{
                result.append(word.substring(1));
                result.append(word.charAt(0));
            }
            result.append("ma");

            for (int j=0;j<=i;j++){
                result.append("a");
            }
        }
        return result.toString();

    }
}
