package LeetCodePracticeCode.BitwiseOperator;

class SingleNum2{
  public int singleNumber(int[] nums) {
        // There are threee ways to solve the problem 
        // 1. by Using HashMap
        // 2. by Using Triplet size element and check to the left
        // 3. by Using the concept of bucket

        // 2. Way is solving below
        // int n=nums.length, ans=-1;
        // Arrays.sort(nums);
        // for(int i=1;i<n;i+=3){
        //     if(nums[i-1]!=nums[i]){
        //       ans=nums[i-1];
        //       break;
        //     } 
        // }
        // System.out.println(ans);
        // return ans==0?nums[n-1]:ans;
    
    // ~ represent Not Operator
        int ones = 0, twos = 0;
        for (int ele : nums) {
            ones = (ones ^ ele) & (~twos);
            twos = (twos ^ ele) & (~ones);
        }
        return ones;
    }
}
