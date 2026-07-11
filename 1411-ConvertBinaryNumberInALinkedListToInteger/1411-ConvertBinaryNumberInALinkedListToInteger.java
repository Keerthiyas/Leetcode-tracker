// Last updated: 7/11/2026, 10:34:47 AM
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
        int sum =0;
        ListNode current = head;
        while(current!=null){
            sum =(sum*2) + current.val;
            current = current.next;
        }
        return sum;
    }
}