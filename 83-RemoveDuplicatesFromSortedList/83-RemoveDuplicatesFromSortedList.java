// Last updated: 7/13/2026, 10:30:47 AM
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode temp = head;
        while(temp != null && temp.next!=null){
            if(temp.val==temp.next.val){
                temp.next = temp.next.next;   
            }
            else{
            temp = temp.next;}
        }
        return head;
        
    }
}