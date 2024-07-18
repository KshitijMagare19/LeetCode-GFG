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
    int count=0;
    public int countPairs(TreeNode root, int distance) {
        Distance(root,distance);
            return count;
    }
    public List<Integer> Distance(TreeNode root,int distance){
        if(root==null)
            return new ArrayList<Integer>();
        if(root.left==null&&root.right==null){
            List<Integer> sublist=new ArrayList<Integer>();
            sublist.add(1);
            return sublist;
        }
        List<Integer> l1=Distance(root.left,distance);
        List<Integer> l2=Distance(root.right,distance);
        //System.out.println("left "+l1);
        //System.out.println("right "+l2);
        for(int d1:l1){
            for(int d2:l2){
                if(d1+d2<=distance)
                    count++;
            }
        }
        List<Integer> list=new ArrayList<Integer>();
        for(int val:l1)
            list.add(val+1);
        for(int val:l2)
            list.add(val+1);
        return list;
    }
}