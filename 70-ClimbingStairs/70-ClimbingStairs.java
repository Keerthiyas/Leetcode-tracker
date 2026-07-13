// Last updated: 7/13/2026, 10:31:09 AM
class Solution {
    public int climbStairs(int n) {
        int arr[] = new int[n+1];
        if(n<=2)
            return n;
        arr[1] = 1;
        arr[2] = 2;
        for(int i = 3;i<=n;i++){
            arr[i] = arr[i-2]+arr[i-1];
        }
        return arr[n];

    }
}