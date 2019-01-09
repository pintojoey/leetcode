class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    	List<List<Integer>>list=new ArrayList<>();
	combinations(0,list,nums,new ArrayList<Integer>());    
	return list;
    }
	
    public static void combinations(int position,List<List<Integer>>list, int[]nums,List<Integer>current ){
	if (position==nums.length){
	    list.add(new ArrayList<>(current));
	    return;
	}
	
	combinations(position+1,list,nums,current);
	current.add(nums[position]);
	combinations(position+1,list,nums,current);
	current.remove(current.size()-1);
    }
    
}
