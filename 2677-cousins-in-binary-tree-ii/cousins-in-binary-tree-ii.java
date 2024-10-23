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
    public TreeNode replaceValueInTree(TreeNode root) {
    Queue<TreeNode> q = new LinkedList<>();
    int prev = root.val;
    q.add(root);
    while(!q.isEmpty())
    {
      int size = q.size();
      int curr = 0; 
      while(size>0)
      {
        TreeNode temp = q.poll();
        int leftRight = (temp.left!=null ? temp.left.val : 0)  + (temp.right!=null? temp.right.val : 0) ;
        if(temp.left!=null)
        {
          temp.left.val = leftRight;
          q.add(temp.left);  
        }

        if(temp.right!=null)
        {
          temp.right.val = leftRight;
          q.add(temp.right);  
        }
         curr += leftRight; 
         temp.val = prev - temp.val;
         size--;
      }  
      prev = curr;  
    }
      return root;
    }
}