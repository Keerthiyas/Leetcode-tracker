// Last updated: 9/28/2026, 9:37:57 AM
1class Solution {
2    public int rob(int[] nums) {
3        int dp[][] = new int[nums.length][2];
4        for(int i[] : dp){
5            Arrays.fill(i,-1);
6        }
7        return helper(0, 0, nums, dp);
8    }
9
10    public int helper(int i, int first, int arr[], int dp[][]){
11        if(i>=arr.length)return 0;
12
13        if(dp[i][first]!=-1){
14            return dp[i][first];
15        }
16
17        int ans=0;
18        
19        if(i==0){
20            ans = arr[0] + helper(i+2, 1, arr, dp);
21        }
22        else if(i==arr.length-1 && first==1){
23        }
24        else{
25            ans = arr[i]+helper(i+2, first, arr, dp);
26        }
27
28
29        ans = Math.max(ans, helper(i+1, first, arr, dp));
30
31        return dp[i][first]=ans;
32    }
33}