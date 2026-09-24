// Last updated: 9/24/2026, 8:43:46 PM
1class Solution {
2public:
3    int lastStoneWeight(vector<int>& stones) {
4        priority_queue<int> pq(stones.begin(),stones.end());
5        while(pq.size()>1){
6            int a=pq.top();
7            pq.pop();
8            int b=pq.top();
9            pq.pop();
10            if(a==b) continue;
11            pq.push(a-b);
12        }
13        if(pq.size()==0) return 0;
14        return pq.top();
15    }
16};