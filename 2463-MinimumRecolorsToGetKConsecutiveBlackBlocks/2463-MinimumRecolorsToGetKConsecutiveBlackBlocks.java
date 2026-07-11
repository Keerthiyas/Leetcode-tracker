// Last updated: 7/11/2026, 10:33:52 AM
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left = 0, right = 0, numWhites = 0;
        while(right < k) {
            if(blocks.charAt(right++) == 'W') numWhites++;
        }

        int numRecolors = numWhites, n = blocks.length();
        while(right < n) {
            if(blocks.charAt(left++) == 'W') numWhites--;
            if(blocks.charAt(right++) == 'W') numWhites++;
            numRecolors = Math.min(numRecolors, numWhites);
        }

        return numRecolors;
    }
}