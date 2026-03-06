class GenerateParenthesis{
  public List<String> generateParenthesis(int n) {
    // Recursion Appr
    // Some Tips to solve this Problem
    // Base Case when openBracket and closeBracket is Zero then its time to add String store variable in List
    // And if openBracket is not Zero then recursively append openBracket and decrease its cntFrequency
    // And if closeBracket is as soon as greater than openBracket then add closeBracket
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
