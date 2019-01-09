class Solution {
    public int[] sortArrayByParity(int[] A) {
        List<Integer>even = new ArrayList<>();
        List<Integer>odd = new ArrayList<>();
        for(Integer val: A){
            if (val%2==0)even.add(val);
            else odd.add(val);
        }  
        
        for(int i=0;i<A.length;i++){
           if (i<even.size()){A[i]=even.get(i);}
           else {A[i]=odd.get(i-even.size());}
        }
        return A;
    }
}
