class Search2DMatrix{
  public boolean searchMatrix(int[][] matrix, int target) {
        //Brtue Force Approach
        // int n=matrix.length;
        // for(int i=0;i<n;i++){
        //     int m=matrix[i].length;
        //     if(matrix[i][m-1]>=target){
        //         for(int j=0;j<m;j++){
        //             if(matrix[i][j]==target){
        //                 return true;
        //             }
        //         }
        //     }
        // }
        // return false;

        //Optimised Approach

        int row=matrix.length , col=matrix[0].length;
        int low=0 , high=(row*col-1);
        while(low<=high){
            int mid=(low+high)/2;

            if(matrix[mid/col][mid%col]==target){
                return true;
            }

            else if(matrix[mid/col][mid%col]<target){
                 low=mid+1;
            }

            else{
                high=mid-1;
            }
        }
        return false;
    }
}
