// Last updated: 7/11/2026, 10:37:42 AM
class Solution {
    public boolean isAnagram(String s, String t) {
        char c1[] = s.toCharArray();
        char c2[] = t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(Arrays.equals(c1,c2))
            return true;
        else
            return false;
        
    }
}