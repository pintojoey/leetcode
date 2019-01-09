class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        if (A.length==0||A[0].length==0)return A;
        int cols = A[0].length;
        int result[][]=new int[A.length][cols];

        for(int i=0;i<A.length;i++){
            for (int j=0;j<cols;j++){
                result[i][j]=1-A[i][cols-j-1];
            }
        }
        return result;
    }
}
