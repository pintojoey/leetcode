class Solution {
    private static HashMap<Integer,Integer>fact = new HashMap<>();
    private static HashMap<Integer,Integer>nc2 = new HashMap<>();
    public Integer numberOfBoomerangs(int[][] points) {
        HashMap<Integer,Integer>count = new HashMap<>();
            Integer counts = 0;

        for(int i=0;i<points.length;i++){
            for(int j=0;j<points.length;j++){
                if(i==j)continue;
                Integer distance = distanceSquare(points[i],points[j]);
                count.put(distance,count.getOrDefault(distance,0)+1);
            }
            for (Integer key: count.keySet()){
                int val = count.get(key);
                counts+=(val*(val-1));
            }
	    count.clear();
        }
        return counts;
    }
    public static Integer distanceSquare(int []A, int[]B){
        return (int)(Math.pow(A[1]-B[1],2)+Math.pow(A[0]-B[0],2));
    }
    public static Integer combinationsnc2(Integer n){
        Integer cache = nc2.getOrDefault(n,-1);
        if (cache!=-1)return cache;
        if (n<2) return 0;
        Integer value = factorial(n)/(factorial(n-2)*2);
        nc2.put(n,value);
        return value;
    }
    public static Integer factorial(Integer n){
        Integer cache = fact.getOrDefault(n,-1);
        if (cache!=-1)return cache;

        if (n==0)return 1;
        else if (n==1)return 1;
        else {
            Integer value = n * factorial(n-1);
            fact.put(n, value);
            return value;

        }
    }
}

