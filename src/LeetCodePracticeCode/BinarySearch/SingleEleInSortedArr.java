package LeetCodePracticeCode.BinarySearch;

public class SingleEleInSortedArr {
    public int singleNonDuplicate(int[] nums) {
        // By Linear search
        // int n=nums.length;
        // if(n==1) return nums[0];

        // for(int i=1;i<n-1;i++){
        //      if(i==1){
        //         if(nums[i]!=nums[i-1]) return nums[i-1];
        //      }
        //      if(i==n-2){
        //         if(nums[n-1]!=nums[i]) return nums[n-1];
        //      }
        //      if(nums[i]!=nums[i-1] && nums[i]!=nums[i+1]) return nums[i];
        // }
        // return 0;

        // By Binary Search
        int n=nums.length, low=1, high=n-2;
        if(n<=1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[n-2]!=nums[n-1]) return nums[n-1];

        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) return nums[mid];

                // When Even,Odd then eliminated left half and go to right half
            else if((mid%2==1 && nums[mid-1]==nums[mid]) || (mid%2==0 && nums[mid]==nums[mid+1])){
                low=mid+1;
            }
            // then Odd, Even then eliminate right half and move to left half
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}
