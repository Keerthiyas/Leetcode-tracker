// Last updated: 8/9/2026, 9:13:16 PM
1class Solution {
2public:
3    int peakIndexInMountainArray(vector<int>& nums) {
4        int n=nums.size();
5        if(n==1) return 0;
6
7        int low=0,high=n-1;
8        while(low<=high){
9            int mid=low+(high-low)/2;
10            if(mid-1>=0 && mid+1<n &&
11                nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
12                return mid;
13            }
14            if( nums[mid]<nums[mid+1]) low=mid+1;
15            else high=mid-1;
16        }
17        return -1;
18    }
19};