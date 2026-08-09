// Last updated: 8/9/2026, 9:00:49 PM
1
2class Solution {
3public:
4    int equalSubstring(string s, string t, int maxCost) {
5        int left=0;
6        int sum=0, ans=0;
7
8        for(int right=0; right<s.length(); right++){
9            sum += abs(s[right]-t[right]);
10            while(sum>maxCost){
11                sum -= abs(s[left]-t[left]);
12                left++;
13            }
14            ans=max(ans,right-left+1);
15        }
16        return ans;
17    }
18};