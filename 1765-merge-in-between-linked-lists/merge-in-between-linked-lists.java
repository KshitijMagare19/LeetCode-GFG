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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode head = list1, anode = null, bnode = null;
        int index = 0;
        while(head!=null){
            if(index == a-1) anode = head;
            else if(index == b+1) bnode= head;
            head = head.next;
            index++;
        }
        anode.next = list2;
        getTail(list2).next=bnode;
        return list1;
    }
    public ListNode getTail(ListNode node){
        while(node.next != null)node = node.next;
        return node;
    }
}