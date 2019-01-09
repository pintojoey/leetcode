class Solution {
    public int islandPerimeter(int[][] grid) {
	int bord=0;
        for(int i=0;i<grid.length;i++){
		for(int j=0;j<grid[0].length;j++){
		    if(grid[i][j]==1)
            		    bord+=borders(grid,i,j);
		}
	}
	return bord;
    }
	
    public static int borders(int[][]grid, int i, int j){
	int borders = 0;
	if (i==grid.length-1 || grid[i+1][j]==0)borders++;
	if (i==0 || grid[i-1][j]==0)borders++;
	if (j==grid[0].length-1 || grid[i][j+1]==0)borders++;
	if (j==0 || grid[i][j-1]==0)borders++;
	return borders;
    }
}
