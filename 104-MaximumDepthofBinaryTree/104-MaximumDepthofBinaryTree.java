// Last updated: 9/24/2026, 8:45:24 PM
1class Solution {
2        /*
3        #########################################################################
4        #                                                                       #
5        #  =============================================                        #
6        #                  SIDDARDHA CHILUVERU                                  #
7        #  =============================================                        #
8        #                                                                       #
9        #  Author      : Siddardha Chiluveru                                    #
10        #  Description : Solution / Code / Project                              #
11        #  Date        : 2026-20-08                                             #
12        #                                                                       #
13        #########################################################################
14        */
15    public int findKthLargest(int[] nums, int k) {
16    //     PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
17    //     for (int i : nums)
18    //         pq.offer(i);
19    //     while (k-- > 1)
20    //         pq.poll();
21    //     return pq.poll();
22            Arrays.sort(nums);
23            return nums[nums.length - k];
24    }
25}