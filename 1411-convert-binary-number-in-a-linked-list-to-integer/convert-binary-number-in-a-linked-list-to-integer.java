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
    public int getDecimalValue(ListNode head) {
        String binary = "";
        ListNode t = head;
        while(t != null){
            binary += String.valueOf(t.val);
            t = t.next;
        }
        return Integer.parseInt(binary,2);  
    }
}