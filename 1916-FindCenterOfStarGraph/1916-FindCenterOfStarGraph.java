// Last updated: 7/11/2026, 10:34:24 AM
class Solution {
    public int findCenter(int[][] edges) {
        int n = edges.length;
        int [] scores = new int[n+2];
        for(int [] res:edges){
            int a = res[0];
            int b = res[1];
            scores[a]++;
            scores[b]++;
        }
        
        // FIX: Start at 1, and go all the way to the end of the array
        for(int i = 1; i < scores.length; i++){
            if(scores[i] == n){
                return i;
            }
        }
         return -1;
        
    }
}