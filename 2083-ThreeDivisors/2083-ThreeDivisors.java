// Last updated: 7/11/2026, 10:34:17 AM
class Solution 
{
    public boolean isThree(int n) 
    {
        int count = 0;
        for(int i = 2; i <= n/2;i++)
        {
            if(n % i == 0) count++;
            if(count > 1) return false;
        }

        return count == 1;
    }
}