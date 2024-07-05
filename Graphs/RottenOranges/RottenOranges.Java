class Solution {
    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        if (row == 0) return 0;
        int col = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int result = 0;
        int totalOranges = 0;
        for (int i = 0; i< row; i++){
            for (int j = 0; j < col; j++){
                if (grid[i][j] == 2)
                    q.add(new int[]{i,j});
                if(grid[i][j] == 1) totalOranges++;
            }
        }
        int[][] dirs = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        int moves = 0;
        while(!q.isEmpty()){
            moves++;
            int size = q.size();
            while (size-- > 0){
                int[] curr = q.poll();
                for(int i = 0; i < 4; i++){
                    int rNow = curr[0] + dirs[i][0];
                    int cNow = curr[1] + dirs[i][1];
                    if(rNow >= 0 && rNow < row && cNow >= 0 && cNow < col && grid[rNow][cNow] == 1){
                        q.add(new int[]{rNow,cNow});
                        grid[rNow][cNow] = 2;
                        totalOranges--;
                        result = Math.max(result, moves);
                        System.out.println(rNow + " " + cNow);
                    }
                }
            }
            System.out.println(result);
        }
        return totalOranges > 0 ? -1 : result;
    }
}
