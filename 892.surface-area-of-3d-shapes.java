class Solution {
    public int surfaceArea(int[][] grid) {
        int sides[]=new int[6];

        int area=0;
        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                int n = grid[i][j];
                if (n != 0){
                    area+=2;
                    for (int k=1;k<=n;k++){
                       area+=checkNeighbours(grid, i, j, k);
                    }
                }
            }
        }
        return area;

    }
    
    public static int checkNeighbours(int grid[][], int i, int j, int k){
        int open = 0;
        if (i==0 ||(i-1>0 && grid[i-1][j]<k)){
            open++;System.out.println(1);
        }
        if (i==grid.length-1 ||(i+1<grid.length && grid[i+1][j]<k)){
            open++;System.out.println(2);
        }
        if (j==0 ||(j-1>0 && grid[i][j-1]<k)){
            open++;System.out.println(3);
        }
        if (j==grid[0].length-1 ||(j+1<grid[0].length && grid[i][j+1]<k)){
            open++;System.out.println(4);
        }
        //System.out.println("::"+i+" "+j+" "+k+" "+open);
        return open;
    }
}
