// Last updated: 7/11/2026, 10:34:36 AM
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
        int index = 0;
        ListNode temp = list1;
        ListNode a1 = null;
        ListNode a2 = null;
        while(temp !=null){
            if(index == (a-1)){
                a1 = temp;
            }
            if(index == (b+1)){
                a2 = temp;
            }
            temp = temp.next;
            index++;
        }
        ListNode tail = list2;
        while(tail.next !=null){
            tail = tail.next;

        }
        a1.next = list2;
        tail.next = a2;
        return list1;


        
    }
}