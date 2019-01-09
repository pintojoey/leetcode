class Solution {
    HashMap<Integer,String>map=new HashMap<>();
    public List<String> letterCombinations(String digits) {
	map.put(1,"");
	map.put(2,"abc");
	map.put(3,"def");
	map.put(4,"ghi");
	map.put(5,"jkl");
	map.put(6,"mno");
	map.put(7,"pqrs");
	map.put(8,"tuv");
	map.put(9,"wxyz");
	List<String>result=new ArrayList<>();
	if (digits.length()>0)
	generate(result,0,digits,"");
	return result;
	
    }

   public void generate(List<String>result,int position,String digits,String current){
	if (position==digits.length()){
	    result.add(current);
	    return;
        }
	
	String chars = map.get(Integer.parseInt(digits.substring(position,position+1)));
	for(int i=0;i<chars.length();i++){
	    generate(result,position+1,digits,current+chars.substring(i,i+1));
	}
	
   }
}
