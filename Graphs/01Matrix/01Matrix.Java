class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int row = mat.length;
        if(row == 0) return new int[0][0];
        int col = mat[0].length;
        int[][] res = new int[row][col];
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(mat[i][j] == 0) q.add(new int[]{i, j});
                res[i][j] = 0;
            }
        }
        
        int[][] dirs = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        int result = -1;
        while(!q.isEmpty()){
            int[] curr = q.poll();
            for(int i = 0; i < 4; i++){
                int x = curr[0] + dirs[i][0];
                int y = curr[1] + dirs[i][1];
                if(x >= 0 && x < row && y >= 0 && y < col && mat[x][y] != 0){
                    q.add(new int[]{x,y});
                    mat[x][y] = 0;
                    res[x][y] = res[curr[0]][curr[1]] + 1;
                }
            }
        }
        return res;
    }
}
