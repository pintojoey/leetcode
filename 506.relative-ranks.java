class Solution {
    public String[] findRelativeRanks(int[] nums) {
        List<Integer>results=new ArrayList<>();
	for(Integer num:nums){
		results.add(num);
	}
	Collections.sort(results);
	Collections.reverse(results);
	int count=0;
	String []names=new String[]{"Gold Medal", "Silver Medal", "Bronze Medal"};
	HashMap<Integer,String>map=new HashMap<>();
	for(int i=0;i<3 && i<results.size();i++){
	    map.put(results.get(i),names[i]);
	}
	for(int i=3; i<results.size();i++){
            map.put(results.get(i),String.valueOf(i+1));
        }
	ArrayList<String>output=new ArrayList<>();
	for(Integer num:nums){
		output.add(map.get(num));
	}
	return output.toArray(new String[0]);
    }

}
