class PreorderTraversalOfBTree{
  public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        solver(root,ans);
        return ans;
    }
    public void solver(TreeNode root,List<Integer> ans){
        if(root==null) return;
        ans.add(root.val);
        solver(root.left,ans);
        solver(root.right,ans);
    }
}
