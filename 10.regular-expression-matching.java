class Solution {
    public static HashMap<String,Boolean>memory;
    public boolean isMatch(String S,String P){
	memory=new HashMap<>();
	return isMatching(S,P);
    }
    public boolean isMatching(String S, String P) {
	if (S.isEmpty() && P.isEmpty())return true;
	if (P.isEmpty())return false;
	String key = S.length()+"_"+P.length();
	if (memory.containsKey(key))return memory.get(key);

	boolean answer=false;	

	Character s = S.length()>0?S.charAt(0):null;
	Character p = P.charAt(0);
	Character pNext = P.length()>1?P.charAt(1):null;
	
	if (p=='.'){
	    if (pNext!=null && pNext == '*'){
		answer= (s!=null && isMatching(S.substring(1),P.substring(2))) ||
		       (s!=null && isMatching(S.substring(1),P))||
		       isMatching(S,P.substring(2));
	    }	
	    else{
		answer= (s!=null && isMatching(S.substring(1),P.substring(1)));
	    }
	}
	else {
	    if (s==p){
		if (pNext!=null && pNext=='*'){
		    answer = (s!=null && isMatching(S.substring(1),P.substring(2))) ||
                       (s!=null && isMatching(S.substring(1),P))||
                       isMatching(S,P.substring(2));
		}
		else answer = (s!=null && isMatching(S.substring(1),P.substring(1)));
	    }
	    else {
		if (pNext!=null && pNext=='*'){
		   answer = isMatching(S,P.substring(2));
		}
		else answer = false;
	    }
	}
	memory.put(key,answer);
	return answer;
    }
}
