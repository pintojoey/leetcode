class Solution {
    public int countBinarySubstrings(String s) {
       int i=0;
       int n = s.length();
       Boolean high = null;
       int count = 0;
       ArrayList<Integer>groups=new ArrayList<>();
       while(i<n){
          boolean current = (s.charAt(i)=='1');
	  if(high==null)high=current;
          if(high==current)count++;
	  else{
              groups.add(count);
              count=1;
          }
          high=current;
          i++;
       }
       if(count>0)groups.add(count);

//       System.out.println(groups);
       int sum=0;
       for(int j=0;j<groups.size()-1;j++){
           int a = groups.get(j);
           int b = groups.get(j+1);
  //         System.out.println(a+" "+b );
           sum+=Math.min(a,b);
       }
       return sum;
      
    }
}
