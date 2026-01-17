class MinDaysToMakeBouquet{
   public int minDays(int[] bloomDay, int m, int k) {
        // Edge case
        long val=(long)m*k;
        if(val>bloomDay.length) return -1;
       int maxNum=Integer.MIN_VALUE, minNum=Integer.MAX_VALUE;
       for(int i=0;i<bloomDay.length;i++){
         if(bloomDay[i]>maxNum){
            maxNum=bloomDay[i];
         }
         if(bloomDay[i]<minNum){
            minNum=bloomDay[i];
         }
       } 

       int low=minNum, high=maxNum, ans=0;
       while(low<=high){
          int mid=(low+high)/2;
          
          if(solver(bloomDay,mid,m,k)){
            high=mid-1;
          }
          else{
            low=mid+1;
          }
       }
       return low;
    }
    public boolean solver(int bloomDay[],int mid,int m,int k){
        int adj=0, count=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                count++;
            }
            else{
                adj+=(count/k);
                count=0;
            }
        }
        adj+=(count/k);
        if(adj>=m) return true;
        return false;
    }
}
