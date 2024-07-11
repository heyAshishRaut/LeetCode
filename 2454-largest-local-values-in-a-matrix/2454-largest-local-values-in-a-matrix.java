class Solution {
    public int findMax(int [][]grid, int x, int y){
        int max = -1;
        for(int i = x; i < x + 3; i++){
            for(int j = y; j < y + 3; j++){
                if(max < grid[i][j]){
                    max = grid[i][j];
                }
            }
        }
        return max;
    }

    public int[][] largestLocal(int[][] grid) {
        int [][]ans = new int[grid.length - 2][grid.length - 2];
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans.length; j++){
                ans[i][j] = findMax(grid, i, j);
            }
        }
        return ans;
    }
}