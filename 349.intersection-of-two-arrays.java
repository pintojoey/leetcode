class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>result=new HashSet<>();
	HashSet<Integer>A=new HashSet<>();
	for(Integer num:nums1){
		A.add(num);
	}
	for(Integer num:nums2){
		if (A.contains(num))
			result.add(num);
			
	}
	int [] output=new int[result.size()];
	ArrayList<Integer>list=new ArrayList<>(result);
	for(int i=0;i<output.length;i++)
	    output[i]=list.get(i);
	return (output);
    }
}
