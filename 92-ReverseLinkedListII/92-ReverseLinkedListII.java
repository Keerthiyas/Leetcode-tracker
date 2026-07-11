// Last updated: 7/11/2026, 4:17:05 PM
1class Solution {
2    public ListNode reverseBetween(ListNode head, int left, int right) {
3        ListNode dummy = new ListNode(0); // created dummy node
4        dummy.next = head;
5        ListNode prev = dummy; // intialising prev pointer on dummy node
6        
7        for(int i = 0; i < left - 1; i++)
8            prev = prev.next; // adjusting the prev pointer on it's actual index
9        
10        ListNode curr = prev.next; // curr pointer will be just after prev
11        // reversing
12        for(int i = 0; i < right - left; i++){
13            ListNode forw = curr.next; // forw pointer will be after curr
14            curr.next = forw.next;
15            forw.next = prev.next;
16            prev.next = forw;
17        }
18        return dummy.next;
19    }
20}