class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        if (row == 0) return 0;
        int[][] near = {{-1,0},{0,-1},{1,0},{0,1}};
        int col = grid[0].length;
        int len = row*col;
        int[] root = new int[len];
        int[] size = new int[len];
        Arrays.fill(size, 1);
        int count = 0;
        for (int i = 0; i < len; i++){root[i] = i;}
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                if (grid[i][j] == '1'){
                    count ++;
                    for (int k = 0; k < 3; k++){
                        int newX = i + near[k][0];
                        int newY = j + near[k][1];
                        if (newX < row && newX >= 0 && newY < col && newY >=0 && grid[newX][newY] == '1'){
                            int newR = find(root, newX*col + newY);
                            int r = find(root, i*col + j);
                            if (newR != r){
                                if (size[newR] > size[r]) {
                                    root[r] = root[newR];
                                    size[newR] += size[r];  
                                }else{
                                    root[newR] = root[r];
                                    size[r] += size[newR];
                                }
                                count --;
                            }  
                        }
                    }
                }
            }
        }
        return count;
    }
    
    public static int find(int[] root, int id){
        while (id != root[id]){
            root[id] = root[root[id]];
            id = root[id];
        }
        return id;
    }
    
}