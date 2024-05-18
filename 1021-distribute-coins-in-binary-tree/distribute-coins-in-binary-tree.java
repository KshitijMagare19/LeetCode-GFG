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
    int ans=0;
    public int distributeCoins(TreeNode root) {
        sol(root);
        return ans;
    }
    public int sol(TreeNode root){
        if(root==null) return 0;
        int left=sol(root.left);
        int right=sol(root.right);
        ans+=Math.abs(left)+Math.abs(right);
        return root.val+left+right-1;
    }
}