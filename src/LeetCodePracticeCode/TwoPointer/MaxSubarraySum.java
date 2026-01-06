package LeetCodePracticeCode.TwoPointer;

public class MaxSubarraySum {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n=arr.length, left=0, right=0, sum=0, ans=0;
        for(int i=0;i<n;i++){
            sum+=arr[right];
            if(right-left+1==k){
                ans=Math.max(ans,sum);
                sum-=arr[left];
                left++;
                right++;
            }
            else if(right-left+1<k){
                right++;
            }
        }
        return ans;
    }
}
