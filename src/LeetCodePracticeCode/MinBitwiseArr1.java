class MinBitwiseArr1{
  public int[] minBitwiseArray(List<Integer> nums) {
    // Best approach for Construct Minimum Bitwise Array
       int n=nums.size(), ind=0;
       int ans[]=new int[n];
       for(int i=0;i<n;i++){
          int num=nums.get(i), in=-1;
          for(int j=0;j<num;j++){
            if((j|(j+1))==num){
                in=j;
                break;
            }
          }
          ans[ind++]=in;
       }
       return ans;
    }
}
