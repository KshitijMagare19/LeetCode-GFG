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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next == null) return head;
        ListNode curr = head.next;
        ListNode prev = head;
        while(curr != null){
        int min = Math.min(curr.val, prev.val);
        int max =  Math.max(curr.val, prev.val);
            for(int i = min; i >0; i --){
                if(max % i == 0 && min % i == 0){
                   // System.out.println("min: "+min + " max: " + max+ " i :" + i+ " curr: " + curr+ " prev: " + prev);
                    ListNode NN = new ListNode(i);
                    prev.next  = NN;
                    NN.next = curr;
                    prev = curr;
                    curr = curr.next;
                    break;
                }
            }
        }
        return head;
    }
}