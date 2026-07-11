// Last updated: 7/11/2026, 4:21:14 PM
1class Solution {
2    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
3        
4        int areaOf1stRectangle = (ax2 - ax1) * (ay2 - ay1);
5        int areaOf2ndRectangle = (bx2 - bx1) * (by2 - by1);
6
7        int xOverlap = Math.min(ax2, bx2) - Math.max(ax1, bx1);
8        int yOverlap = Math.min(ay2, by2) - Math.max(ay1, by1);
9        int areaOverlap = (xOverlap > 0 && yOverlap > 0) ? xOverlap * yOverlap : 0;
10
11        return (areaOf1stRectangle + areaOf2ndRectangle - areaOverlap); 
12    }
13}