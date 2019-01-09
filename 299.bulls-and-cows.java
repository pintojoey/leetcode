class Solution {
    public String getHint(String secret, String guess) {
        int bulls=0;
	int cows=0;
	HashMap<String,Integer>map1=new HashMap<>();
	HashMap<String,Integer>map2=new HashMap<>();
	for(int i=0;i<secret.length();i++){
	    if (secret.charAt(i)==guess.charAt(i)){
		bulls++;
		secret=secret.substring(0,i)+" "+secret.substring(i+1);
	    }
	    else {
		map1.put(secret.substring(i,i+1),map1.getOrDefault(secret.substring(i,i+1),0)+1);
		map2.put(guess.substring(i,i+1),map2.getOrDefault(guess.substring(i,i+1),0)+1);
            }
	}
	for(String key:map2.keySet()){
		if (map1.containsKey(key))cows+=Math.min(map1.get(key),map2.get(key));
	}
	return bulls+"A"+cows+"B";
    }
}
