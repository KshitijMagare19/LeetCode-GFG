/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = new int[2];
        ans[0] = Integer.MAX_VALUE;

        ListNode prev = head;
        ListNode curr = head.next;
        int first = Integer.MAX_VALUE, last = Integer.MIN_VALUE, index = 1, node = 0; 
        while(curr.next != null){
            if(curr.val < prev.val && curr.val < curr.next.val ){
                first = Math.min(first,index);
                int temp = Math.max(last,index);
                ans[0] = Math.min(ans[0],Math.abs(temp-last));
                
                // System.out.println(first + ":1st , "+" nth: "+ last+" i: "+ ans[0]+" t:"+temp);
                last = Math.max(last,index);
                node++;
            }
            else if(curr.val > prev.val && curr.val > curr.next.val ){
                first = Math.min(first,index);
                 int temp = Math.max(last,index);
                ans[0] = Math.min(ans[0],Math.abs(temp-last));
                
                // System.out.println(first + ":1st , "+" nth: "+ last+" i: "+ ans[0]+" t:"+temp);
                last = Math.max(last,index);
                node++;
            }
            index++;
            prev = curr;
            curr = curr.next;
        }
        if(node < 2) return new int[] {-1,-1};
        if(node == 2) ans[0] = last - first;
        if(last == 0) Arrays.fill(ans,-1);
        else ans[1] = last - first;

        return ans;

         
        
    }
}