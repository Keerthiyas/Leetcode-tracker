# Last updated: 7/21/2026, 9:55:44 AM
MOD = 10**9 + 7
DIV_2 = (MOD + 1) // 2
factorial = [1, 1]
invfactorial = [1, 1]

def nCk(n, k):
    return factorial[n] * invfactorial[k] % MOD * invfactorial[n-k] % MOD

def mod_inv(base):
    ans = 1
    exp = MOD - 2
    while exp > 0:
        if exp % 2 == 1:
            ans = (ans * base) % MOD
        exp //= 2
        base = (base * base) % MOD
    return ans

class Solution:
    def distanceSum(self, m: int, n: int, k: int) -> int:
        ans, contribution = 0, nCk(n*m - 2, k - 2)
        for r in range(n - 1):
            ans = (ans + contribution * m % MOD * m % MOD * (n - r - 1) % MOD * (n - r) % MOD * DIV_2) % MOD
        for c in range(m - 1):
            ans = (ans + contribution * n % MOD * n % MOD * (m - c - 1) % MOD * (m - c) % MOD * DIV_2) % MOD
        return ans

for i in range(2, 100_000):
    factorial.append(i * factorial[i - 1] % MOD)
    invfactorial.append(mod_inv(factorial[i]) % MOD)