class ConvertArrToBst{
  public TreeNode sortedArrayToBST(int[] nums) {
        int n=nums.length;
        if(n==0) return null;
        return solver(nums,0,n-1);
    }
    public TreeNode solver(int nums[],int low,int high){
        if(low>high) return null;
        int mid=(low+high)/2;
        TreeNode ans=new TreeNode(nums[mid]);
        ans.left=solver(nums,low,mid-1);
        ans.right=solver(nums,mid+1,high);
        return ans;
    }
}
