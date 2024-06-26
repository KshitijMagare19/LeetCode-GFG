/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<TreeNode> list = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        helper(root);
        if(list.size() == 0)
            return null;
        return formTree(0, list.size() - 1);
    }
    
    private void helper(TreeNode root){
        if(root == null)
            return;
        helper(root.left);
        list.add(root);  // don't store value
        helper(root.right);
        root.left = null;
        root.right = null;
    }
    
	//recursive form BST
    private TreeNode formTree(int start, int end){
        if(start > end)
            return null;
        int middle = start + (end - start) / 2;
        TreeNode root = list.get(middle);
        root.left = formTree(start, middle - 1);
        root.right = formTree(middle + 1, end);
        return root;
    }
}