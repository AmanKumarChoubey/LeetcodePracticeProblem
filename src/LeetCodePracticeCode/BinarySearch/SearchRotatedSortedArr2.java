package LeetCodePracticeCode.BinarySearch;

import java.util.HashSet;
import java.util.Set;

public class SearchRotatedSortedArr2 {
    public int search(int[] nums, int target) {
        int low=0, high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
//            as [1,0,1,1,1] nums[low] == nums[mid] == nums[high]
            if (nums[low]<=nums[mid] && nums[mid]==nums[high]){
                low++;
                high--;
                continue;
            }
            // check left half is sorted
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<=nums[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            // Check right half is sorted
            else{
                if(nums[mid]<=target && target<=nums[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}
