class NextGreaterEle2{
  public int[] nextGreaterElements(int[] nums) {
        // Use the concept to merge the array 2*n, but hypothetically in real use % (modulous)
        // int n=nums.length;
        // int ans[]=new int[n];
        // Arrays.fill(ans,-1);
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<(i+n);j++){
        //         int index=j%n;
        //         if(nums[i]<nums[index]){
        //             ans[i]=nums[index];
        //             break;
        //         }
        //     }
        // }
        // return ans;

        // Optimal but concept revolve to hypothetically double the array.
        // T.C -> o(4n) and S.C -> o(2n)
        Stack<Integer> st=new Stack<>();
        int n=nums.length;
        int ans[]=new int[n];
        for(int i=(2*n-1);i>=0;i--){
           while(!st.isEmpty() && st.peek()<=nums[i%n]){
            st.pop();
           }
           if(i<n){
             ans[i]=st.isEmpty()?-1:st.peek();
           }
           st.push(nums[i%n]);
        }
        return ans;
    }
}
