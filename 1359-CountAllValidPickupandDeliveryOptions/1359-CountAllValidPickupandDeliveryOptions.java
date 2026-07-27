// Last updated: 7/27/2026, 9:10:55 AM
1class Solution {
2
3    private int MOD = (int)1e9 + 7; 
4    private static final int MAX_PAIRS = 510; 
5    private long[] memoization = new long[MAX_PAIRS];  
6
7    private long calculateOrdersCount(long remainingPairs) {
8        
9        if (remainingPairs == 0)
10            return 1;
11
12        if (memoization[(int)remainingPairs] != -1)
13            return memoization[(int)remainingPairs];
14
15        long currentResult = calculateOrdersCount(remainingPairs - 1) * (2 * remainingPairs - 1) * remainingPairs % MOD;
16
17        return memoization[(int)remainingPairs] = currentResult;
18    }
19
20    public int countOrders(int numPairs) {
21        for(int i = 0 ; i < numPairs + 5 ; i ++){
22            memoization[i] = -1 ;
23        }
24
25        return (int)calculateOrdersCount(numPairs);
26    }
27}