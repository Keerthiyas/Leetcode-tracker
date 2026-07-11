// Last updated: 7/11/2026, 10:33:55 AM
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode New = head.next;
        ListNode temp = New;

        while (temp != null) {
            int sum = 0;

            while (temp.val != 0) {
                sum += temp.val;
                temp = temp.next;
            }

            New.val = sum;
            temp = temp.next;

            New.next = temp;
            New = temp;
        }

        return head.next;
    }
}