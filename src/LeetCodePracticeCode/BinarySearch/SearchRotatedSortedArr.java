package LeetCodePracticeCode.BinarySearch;

import java.util.HashSet;
import java.util.Set;

public class SearchRotatedSortedArr {
    public long maximumSubarraySum(int[] nums, int k) {
        long ans=0, sum=0;
        int left=0;
        Set<Integer> set=new HashSet<>();
        for(int right=0;right<nums.length;right++){
            if(!set.contains(nums[right])){
                sum+=nums[right];
                set.add(nums[right]);
                if(right-left+1==k){
                    ans=Math.max(ans,sum);
                    sum-=nums[left];
                    set.remove(nums[left]);
                    left++;
                }
            }
            else{
                while(nums[left]!=nums[right]){
                    sum-=nums[left];
                    set.remove(nums[left]);
                    left++;
                }
                left++;
            }
        }
        return ans;
    }
}
