class CountingBits{
  public int[] countBits(int n) {
       // Optimised approach 
        int[] ans=new int[n+1];
        if(n<=0) return ans;
        ans[0]=0;

        for(int i=1;i<ans.length;i++){
            int count=0, num=i;
            while(num>0){
                count+=(num&1);
                num>>=1;
            }
            ans[i]=count;
        }
        return ans;
    }
}
