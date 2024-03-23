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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next !=null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp2 = reverse(slow.next);
        slow.next = null;
        ListNode temp1 = head;

        while(temp2!=null){
            ListNode first= temp1.next;
            temp1.next = temp2;
            ListNode last= temp2.next;
            temp2.next=first;
            temp1 = first;
            temp2 = last;
        }
    }
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}