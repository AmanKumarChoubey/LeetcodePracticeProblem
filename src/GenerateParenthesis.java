class GenerateParenthesis{
  public List<String> generateParenthesis(int n) {
    // Recursion Question
      List<String> ans=new ArrayList<>();
      solver(n,n,ans,"");
      return ans;
  }
  public void solver(int openBrack,int closeBrack,List<String> ans,String temp){
    if(openBrack==0 && closeBrack==0){
      ans.add(temp);
      return;
    }
    if(openBrack!=0){
      solver(openBrack-1,closeBrack,ans,temp+'(');
    }
    if(closeBrack>openBrack){
      solver(openBrack,closeBrack-1,ans,temp+')');
    }
  }
}
