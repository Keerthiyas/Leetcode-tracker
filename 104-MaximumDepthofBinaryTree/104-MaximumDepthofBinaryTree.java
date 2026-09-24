// Last updated: 9/24/2026, 8:42:54 PM
1class KthLargest {
2    private int k;
3    private PriorityQueue<Integer> pq;
4    public KthLargest(int k, int[] nums) {
5        this.k = k;
6        pq = new PriorityQueue<>(k);
7        for (int num : nums) {
8            pq.offer(num);
9            if (pq.size() > k) pq.poll(); 
10        }
11    }
12    
13    public int add(int val) {
14        pq.offer(val); 
15        if (pq.size() > k) pq.poll();
16        return pq.peek();
17    }
18}