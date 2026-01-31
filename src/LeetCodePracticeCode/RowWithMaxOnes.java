class RowWithMaxOnes{
  public int[] rowAndMaximumOnes(int[][] mat) {
        int ans[]=new int[2];
        int n=mat.length, m=mat[0].length, prevCnt=0, index=0;
        for(int i=0;i<n;i++){
            int oneCnt=0;
            for(int j=0;j<m;j++){
               if(mat[i][j]==1){
                oneCnt++;
               }
            }
            if(oneCnt>prevCnt){
                index=i;
                prevCnt=oneCnt;
            }
        }
        return new int[]{index,prevCnt};
    }
}
