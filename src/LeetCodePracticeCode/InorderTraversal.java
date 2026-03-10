public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
        this.left = left;
         this.right = right;
}
class InorderTraversal{
  public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        solver(ans,root);
        return ans;
    }
    public void solver(List<Integer> ans, TreeNode root){
        if(root==null) return;
        solver(ans,root.left);
        ans.add(root.val);
        solver(ans,root.right);
    }
}
