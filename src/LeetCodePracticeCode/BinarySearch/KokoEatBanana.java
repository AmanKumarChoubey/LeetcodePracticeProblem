class KokoEatBanana{
  public int minEatingSpeed(int[] piles, int h) {
        int maxLen=Integer.MIN_VALUE, ans=0;
        // find max koko eat in an hour
        for(int i=0;i<piles.length;i++){
            if(piles[i]>maxLen){
                maxLen=piles[i];
            }
        }
        
        int low=1, high=maxLen;
        while(low<=high){
            int mid=(low+high)/2;
            int hours=solver(piles,mid);
            if(hours<=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int solver(int piles[],int mid){
        int time=0;
        for(int i=0;i<piles.length;i++){
            time+=Math.ceil((double)piles[i]/(double)mid);
        }
        return time;
    }
}
