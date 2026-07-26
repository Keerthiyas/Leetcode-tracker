// Last updated: 7/26/2026, 6:54:24 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13        ListNode fast = head, slow = head;
14        for (int i = 0; i < n; i++) fast = fast.next;
15        if (fast == null) return head.next;
16        while (fast.next != null) {
17            fast = fast.next;
18            slow = slow.next;
19        }
20        slow.next = slow.next.next;
21        return head;
22    }
23}