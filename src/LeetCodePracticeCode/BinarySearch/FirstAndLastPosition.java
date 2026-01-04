package LeetCodePracticeCode.BinarySearch;

public class FirstAndLastPosition {
    public int[] searchRange(int[] nums, int target) {
        // code here
        int lower=firstSolver(nums,target);
        int upper=secondSolver(nums,target);
        return new int[]{lower,upper};
    }
    public int firstSolver(int nums[],int target){
        // keep search by lower bound
        int low=0, high=nums.length-1, ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                ans=mid;
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    public int secondSolver(int nums[],int target){
        // keep search by upper bound
        int low=0, high=nums.length-1, ans1=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                ans1=mid;
                low=mid+1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans1;
    }
}
