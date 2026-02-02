class SearchIn2DMatII{
  public boolean searchMatrix(int[][] matrix, int target) {
        // Optimised Approach
        //  Time Complexity :- O(n+m) bez we traverse while eliminate the row & col
        //  Space Complexity :- O(1)

        int n=matrix.length, m=matrix[0].length;
        int row=0, col=m-1;
        while(row<n && col>=0){
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]>target){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }
}
