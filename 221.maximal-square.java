class Solution {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        if (m==0)return 0;
        int n = matrix[0].length;
        if (n==0)return 0;
        int mat[][]=new int[m][n];
        for (int j=0;j<n;j++){
            int count = 0;
            for(int i=0;i<m;i++){
               if (matrix[i][j]=='1')
                   mat[i][j]=(++count);
               else count=0;
               System.out.print(count);
            }
        }
       
        int maxArea = 0;
        for (int i=0;i<m;i++){
            int rowMax = 0;
            ArrayList<Integer>list=new ArrayList<>();
            for (int j=0;j<n;j++){
                    list.add(mat[i][j]);
            }
            int count = getRowMax(list);
            list.clear();
            rowMax = Math.max(rowMax,count*count);
            System.out.println(rowMax);
            maxArea = Math.max(maxArea, rowMax);
        }
        return maxArea;
    }

    public static int getRowMax(List<Integer>list){
        int count;
        int max = 0;
        for (int i=0;i<list.size();i++){
            int val = list.get(i);
            if (val == 0) continue;
            count = 0;
            for (int j=i;j<list.size();j++){
                int var =list.get(j);
                if (var==0)break;
                if (var>=val){
                    count++;
                }
                else{
                    if (count>=val)
                        max = Math.max(val, max);
                    val=var;
                    count++;
                }
            }
            if (count>=val)
                max = Math.max(val, max);

        }
        return max;
    }
}
