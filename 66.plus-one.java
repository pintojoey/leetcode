class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        LinkedList<Integer>list=new LinkedList<>();
        for(int i=0;i<digits.length;i++){
            int val = digits[digits.length-i-1]+carry;
            if (val>9){val=0;carry=1;}
            else carry=0;
            list.addFirst(val);
        }
        if (carry==1)list.addFirst(1);
        int [] out=new int[list.size()];
        for(int i=0;i<list.size();i++)
             out[i]=list.get(i);
        return out;

    }
}
