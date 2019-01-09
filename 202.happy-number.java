class Solution {
    public boolean isHappy(int n) {
        int val = sum(n);
	HashSet<Integer>set=new HashSet<>();
	set.add(val);
        while(val!=1){
            val=sum(val);
	    if(set.contains(val))return false;
	    else set.add(val);
            System.out.println(val);
        }
	return true;
    }
    public static int sum(int x){
         int sum = 0;
 	 
         while(x>0){
            sum+=(Math.pow(x%10,2));
	    x=x/10;
         }
	
         return sum;
    }
}
