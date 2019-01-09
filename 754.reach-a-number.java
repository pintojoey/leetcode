class Solution {
    HashMap<Integer,Integer>memory;
    public int reachNumber(int target) {
	memory=new HashMap<>();
	return stepsTo(target, 0 ,1);
    }
    public int stepsTo(int target,int current,int stepCount){
	if(memory.containsKey(current))return memory.get(current);
	if (current==target)return stepCount;
	else { int val= Math.min(stepsTo(target,current+stepCount,stepCount+1),
		             stepsTo(target,current-stepCount,stepCount+1));
		memory.put(current,val);
		return val;
	     }
    }
}
