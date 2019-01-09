class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String>results=new ArrayList<>();
	generate(results,0,n*2,0,"");
	return results;
    }

    public void generate(List<String>result, int pos, int n, int open,String current){
	if (pos==n){
	   result.add(current);
	   return;
        }
	
	if(open < n/2){
	   generate(result,pos+1,n,open+1,current+"(");
	}
	if (open>0 &&open>pos-open){
	   generate(result,pos+1,n,open,current+")");
	}
    }
}
