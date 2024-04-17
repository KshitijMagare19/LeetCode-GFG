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
    String smallString = "";

    public void solve(TreeNode root, String currString ){
        if(root == null) return;
        currString = (char)(root.val + 'a') + currString;

        if(root.left == null &&  root.right == null){
            if(smallString.isEmpty() || smallString.compareTo(currString) > 0){
                smallString = currString;
            }
        } 
        solve(root.left,currString);
        solve(root.right,currString);
    }
    public String smallestFromLeaf(TreeNode root) {
        solve(root,"");
        return smallString;
    }
}