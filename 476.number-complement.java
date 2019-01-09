class Solution {
    public int findComplement(int num) {
        int complement = ~num;
	int i = 0;
	while(num>0){
		num=num<<1;
		complement=complement<<1;
		i++;
	}
	complement = complement>>i;
	return complement;
    }
}
