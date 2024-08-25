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
    
        private List<Integer> answer = new ArrayList<>();

    private void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        // Visit the root first, then the left subtree, then the right subtree.
        answer.add(node.val);
        dfs(node.left);
        dfs(node.right);
    }
    
    public List<Integer> preorderTraversal(TreeNode root) {
        dfs(root);
        return answer;
    }
    
}