class GenerateParenthesis{
  public List<String> generateParenthesis(int n) {
    // Recursion Question
       List<String> ans=new ArrayList<>();
       int open=n,close=n;
       helper(ans,open,close,""); 
       return ans;
    }
    public void helper(List<String> ans,int open,int close,String output){
        if(open==0 && close==0){
            ans.add(output);
            return;
        }
        if(open!=0){
            helper(ans,open-1,close,output+'(');
        }
        if(close>open){
            helper(ans,open,close-1,output+')');
        }
    }
}
