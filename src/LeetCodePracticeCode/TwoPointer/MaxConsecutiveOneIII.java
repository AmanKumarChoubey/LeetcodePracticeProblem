class MaxConsecutiveOneIII{
  public int longestOnes(int[] nums, int k) {
        // Subarray Problem deals with two pointer and sliding window approaches
        int left=0, right=0, n=nums.length, maxLen=Integer.MIN_VALUE, zeroCnt=0;
        while(right<n){
            if(nums[right]==0){
                zeroCnt++;
            }
            while(zeroCnt>k){
                if(nums[left]==0) zeroCnt--;
                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
            right++;
        }
        return maxLen;
    }
}
