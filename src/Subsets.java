class Subsets{
        int n=nums.length;
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> output=new ArrayList<>();
        solver(ans,output,n,nums,0);
        return ans;
}
public void solver(List<List<Integer>> ans,List<Integer> output , int n,int nums[],int index){
        if(index==n){
            ans.add(new ArrayList<>(output));
            return;
        }
        //taking
        output.add(nums[index]);
        solver(ans,output,n,nums,index+1);
        //not taking
        output.remove(output.size()-1);
        solver(ans,output,n,nums,index+1);
    }
