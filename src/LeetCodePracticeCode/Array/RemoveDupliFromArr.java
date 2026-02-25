class RemoveDupliFromArr{
  public int removeDuplicates(int[] nums) {
        //write code here.
        // Brute Force approach by using HashSet.
        // Set<Integer> set=new HashSet<>();
        // for(int n:nums){
        //     set.add(n);
        // }
        
        // int i=0;
        // for(int n1:set){
        //     nums[i++]=n1;
        // }
        // return set.size();

        // Optimal Appraoch
        int j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                nums[j++]=nums[i];
            }
        }
        return j;
    }
}
