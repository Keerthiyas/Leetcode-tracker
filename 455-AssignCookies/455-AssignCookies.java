// Last updated: 9/28/2026, 9:39:39 AM
1class Solution {
2    public int coinChange(int[] coins, int amount) {
3        int[] minCoins = new int[amount + 1];
4        Arrays.fill(minCoins, amount + 1);
5        minCoins[0] = 0;
6
7        for (int i = 1; i <= amount; i++) {
8            for (int j = 0; j < coins.length; j++) {
9                if (i - coins[j] >= 0) {
10                    minCoins[i] = Math.min(minCoins[i], 1 + minCoins[i - coins[j]]);
11                }
12            }
13        }
14
15        return minCoins[amount] != amount + 1 ? minCoins[amount] : -1;        
16    }
17}