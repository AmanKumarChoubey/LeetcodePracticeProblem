package LeetCodePracticeCode.BinarySearch;
// For Rotated Sorted Array we have to eliminated either of left sorted arr or right sorted arr
public class MinimumRotatedSortedArr {
    public int findMin(int[] nums) {
        // code here.
        int low=0,high=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;

            if(nums[low]<=nums[mid]){
                ans=Math.min(ans,nums[low]);
                low=mid+1;
            }
            else{
                ans=Math.min(ans,nums[mid]);
                high=mid-1;
            }
        }
        return ans;
    }
}
