package LeetCodePracticeCode.Array;

class MaxProductSubArr{
  public int maxProduct(int[] nums) {
        int n=nums.length, i=0,j=n-1, prod1=1, prod2=1;
        int ans=Integer.MIN_VALUE;
        for(int k=0;k<n;k++){
            if(prod1==0) prod1=1;
            if(prod2==0) prod2=1;
            prod1*=nums[i];
            prod2*=nums[j];
            
            ans=Math.max(ans,prod1);
            ans=Math.max(ans,prod2);
            i++;
            j--;
        }
        return ans;
    }
}
