class SmallestDivisor{
  public int smallestDivisor(int[] nums, int threshold) {
        int maxNum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maxNum) maxNum=nums[i];
        }
        int low=1, high=maxNum, ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            int sumDiv=solver(nums,mid);
            if(sumDiv<=threshold){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public int solver(int nums[],int mid){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=(Math.ceil((double)nums[i]/(double)mid));
        }
        return sum;
    }
}
