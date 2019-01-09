class Solution {
    public String[] reorderLogFiles(String[] logs) {
        ArrayList<String>words=new ArrayList<>();
        LinkedList<String>digit=new LinkedList<>();
        for (String log:logs){
            String id = log.split(" ")[0];
            String text1 = log.split(" ")[1];
            if (isInteger(text1)){
                digit.add(log);
            }
            else{
                 words.add(log);
            }
        }
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String w1 = new String(o1);
                String k1 = w1.substring(0,w1.indexOf(" "));
                w1 = w1.substring(w1.indexOf(" "));
                               

                String w2 = new String(o2);
                String k2 = w2.substring(0,w2.indexOf(" "));
                w2 = w2.substring(w2.indexOf(" "));
                if (w1.equals(w2)){
                    return k1.compareTo(k2);
                }
                else return w1.compareTo(w2);
                
            }
        });
        ArrayList<String>result = new ArrayList<>();
        result.addAll(words);
        result.addAll(digit);
        String[] array = result.toArray(new String[0]);
        return array;       
        
    }
 

    public static boolean isInteger(String s) {
      if(s.isEmpty()) return false;
    	for(int i = 0; i < s.length(); i++) {
            if(i == 0 && s.charAt(i) == '-') {
            	if(s.length() == 1) return false;
            	else continue;
            }
            if(Character.digit(s.charAt(i),10) < 0) return false;
    	}
        return true;
    }
}
