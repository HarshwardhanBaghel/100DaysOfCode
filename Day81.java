class Solution {
    public void setZeroes(int[][] matrix) {
        
        int row = matrix.length; 
        int col = matrix[0].length; 

        int[] row0 = new int[row];
        int[] col0 = new int[col];

        for(int i = 0;i < row ; i++)
        {
            for(int j = 0;j < col;j++)
            {
                if(matrix[i][j] == 0)
                {
                    row0[i]=1;
                    col0[j]=1;
                }
            }
        }

        for(int i=0;i<row;i++)
        {
            for(int j = 0;j < col;j++)
            {
                if(row0[i] == 1 || col0[j] == 1)
                {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}