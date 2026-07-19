# Last updated: 7/19/2026, 9:02:10 PM
1MOD = 10**9 + 7
2DIV_2 = (MOD + 1) // 2
3factorial = [1, 1]
4invfactorial = [1, 1]
5
6def nCk(n, k):
7    return factorial[n] * invfactorial[k] % MOD * invfactorial[n-k] % MOD
8
9def mod_inv(base):
10    ans = 1
11    exp = MOD - 2
12    while exp > 0:
13        if exp % 2 == 1:
14            ans = (ans * base) % MOD
15        exp //= 2
16        base = (base * base) % MOD
17    return ans
18
19class Solution:
20    def distanceSum(self, m: int, n: int, k: int) -> int:
21        ans, contribution = 0, nCk(n*m - 2, k - 2)
22        for r in range(n - 1):
23            ans = (ans + contribution * m % MOD * m % MOD * (n - r - 1) % MOD * (n - r) % MOD * DIV_2) % MOD
24        for c in range(m - 1):
25            ans = (ans + contribution * n % MOD * n % MOD * (m - c - 1) % MOD * (m - c) % MOD * DIV_2) % MOD
26        return ans
27
28for i in range(2, 100_000):
29    factorial.append(i * factorial[i - 1] % MOD)
30    invfactorial.append(mod_inv(factorial[i]) % MOD)