// Last updated: 7/11/2026, 10:35:28 AM
class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trustscore = new int[n+1];
        for(int [] a1:trust){
            int a = a1[0];
            int b = a1[1];
            trustscore[a]--;
            trustscore[b]++;
        }
        for(int i =1;i<=n;i++){
            if(trustscore[i] == n-1){
                return i;
            }
        }
        return -1;
    }
}