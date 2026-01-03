package LeetCodePracticeCode.BinarySearch;

public class BinarySearch {
    public int search(int[] nums, int target) {
        //write code here.
        int left=0, right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;

            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }
}
