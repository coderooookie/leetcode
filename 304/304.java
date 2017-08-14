public class NumMatrix {
    int[][] matrix;
    public NumMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = row > 0 ? matrix[0].length : 0;
        for (int i = 0; i < row; i++){
            for (int j = 1; j < col; j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }
        this.matrix = matrix;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int ans = 0;
        while (row1 <= row2){
            ans += matrix[row1][col2] -(col1 > 0 ? matrix[row1][col1-1] : 0);
            row1++;
        }
        return ans;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */