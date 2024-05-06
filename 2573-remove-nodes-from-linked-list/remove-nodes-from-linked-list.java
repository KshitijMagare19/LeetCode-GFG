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
   public ListNode removeNodes(ListNode head) {
        // Check if the linked list is empty
        if(head == null){
            return null;
        }

        // Reverse the linked list
        head = reverseList(head);
        
        // Initialize two pointers: first and second
        ListNode first = head;
        ListNode second = head.next;
        
        // Traverse the reversed list
        while(second != null){
            // If the value of the node pointed by 'first' is greater than the value of the node pointed by 'second'
            if(first.val > second.val){
                // Remove the node pointed by 'second'
                first.next = second.next;
            }
            else{
                // Move 'first' pointer to the next node
                first = second;
            }
            // Move 'second' pointer to the next node
            second = second.next;
        }

        // Reverse the linked list again to restore the original order
        head = reverseList(head);

        // Return the head of the modified linked list
        return head;
    }

    // Function to reverse a linked list
    private ListNode reverseList(ListNode head){
        ListNode cur = head;
        ListNode prev = null;
        ListNode next = null;

        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }
}