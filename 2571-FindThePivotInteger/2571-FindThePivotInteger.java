// Last updated: 7/11/2026, 10:33:45 AM
class Solution {
    public int pivotInteger(int n) {
        int sum= n*(n+1)/2;
        double a= Math.sqrt(sum);

        if( a- Math.ceil(a)==0) return (int)a;
        else return -1;
    }
}