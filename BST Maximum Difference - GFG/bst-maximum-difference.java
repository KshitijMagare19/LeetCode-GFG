//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class GFG {
    
	public static void main (String[] args) throws Exception{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
	        while(t > 0){
	            int n=Integer.parseInt(br.readLine().trim());
	            String s[] = br.readLine().trim().split(" ");

	            int target=Integer.parseInt(br.readLine().trim());
    	    	Node root = null;
                for(int i=0;i<n;i++){
                    root=insert(root,Integer.parseInt(s[i]));
                }
        	    Solution g = new Solution();
        	    System.out.println(g.maxDifferenceBST(root,target));
                t--;
            
        }
    }

    public static Node insert(Node tree, int val) {
        Node temp = null;
        if (tree == null) return new Node(val);
    
        if (val < tree.data) {
            tree.left = insert(tree.left, val);
        } else if (val > tree.data) {
            tree.right = insert(tree.right, val);
        }
    
        return tree;
    }
  
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static int maxDifferenceBST(Node root,int target)
    {
        //Please code here
        Node targetNode=search(root,target);
        if(targetNode==null){
            return -1;
        }
        int sum1=SumuptoTargetNode(root,target);
        // System.out.println(sum1);
        int sum2=Sum(targetNode);
        // System.out.println(sum2);
        return sum1-sum2;
        
    }
    public static Node search(Node root,int target){
        if(root==null){
            return null;
        }
        if(root.data==target){
            return root;
        }
        if(root.data>target){
            return search(root.left,target);
        }
        else{
            return search(root.right,target);
        }
    }
    public static int Sum(Node root){
        
        if(root.left==null && root.right==null){
            return root.data;
        }
        int min=Integer.MAX_VALUE;
        if(root.left!=null){
            min=Math.min(min,Sum(root.left));
        }
        if(root.right!=null){
            min=Math.min(min,Sum(root.right));
        }
        return min+root.data;
    }
    public static int SumuptoTargetNode(Node root,int target){
        int sum=root.data;
        if(root.data==target){
            return sum;
        }
        if(root.data<target){
            sum+=SumuptoTargetNode(root.right,target);
        }
        if(root.data>target){
            sum+=SumuptoTargetNode(root.left,target);
        }
        return sum;
        
    }
}