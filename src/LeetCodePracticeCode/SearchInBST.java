class SearchInBST{
  public TreeNode searchBST(TreeNode root, int val) {
        // Code here
        while(root!=null && root.val!=val){
            root = root.val>val?root.left:root.right;
        }
        return root;
    }
}
