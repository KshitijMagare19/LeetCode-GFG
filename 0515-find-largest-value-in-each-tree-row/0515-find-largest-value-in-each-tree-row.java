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
    int[] arr=new int[10000];  
    int maxLevel;

    public List<Integer> largestValues(TreeNode root) {
        if(root==null) return new ArrayList<>();
        
        Arrays.fill(arr, Integer.MIN_VALUE);

        dfs(root, 0);

        List<Integer> list=new ArrayList<>();
        for(int i=0; i<maxLevel+1; i++){
            list.add(arr[i]);
        }

        return list;
    }


    void dfs(TreeNode root, int level){
        if(root==null) return;

        dfs(root.left, level+1);
        dfs(root.right, level+1);
        //System.out.println("    level="+level+"; "+root.val);

        if(arr[level]<root.val){         
            arr[level] = root.val;
        }
        
        maxLevel=Math.max(maxLevel, level);
    }

}