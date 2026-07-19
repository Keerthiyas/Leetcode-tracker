// Last updated: 7/19/2026, 10:52:50 AM
1class Solution {
2
3    private int MOD = (int)1e9 + 7;  // Modulus for calculations
4    private static final int MAX_PAIRS = 510; // Maximum possible pairs value
5    private long[] memoization = new long[MAX_PAIRS];  // Memoization array to store computed values
6
7    private long calculateOrdersCount(long remainingPairs) {
8        // Base case: No remaining pairs, return 1
9        if (remainingPairs == 0)
10            return 1;
11
12        // Check if the value is already computed and return it
13        if (memoization[(int)remainingPairs] != -1)
14            return memoization[(int)remainingPairs];
15
16        // Calculate the number of valid orders for the remaining pairs
17        long currentResult = calculateOrdersCount(remainingPairs - 1) * (2 * remainingPairs - 1) * remainingPairs % MOD;
18
19        // Store the result in the memoization array and return it
20        return memoization[(int)remainingPairs] = currentResult;
21    }
22
23    public int countOrders(int numPairs) {
24        // Initialize the memoization array with -1 values
25        for(int i = 0 ; i < numPairs + 5 ; i ++){
26            memoization[i] = -1 ;
27        }
28
29        // Calculate and return the count of valid orders
30        return (int)calculateOrdersCount(numPairs);
31    }
32}