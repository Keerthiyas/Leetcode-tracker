// Last updated: 7/13/2026, 10:31:28 AM
class Solution {
    public int lengthOfLastWord(String s) {

    String[] arr = s.split(" ");
    return (arr[arr.length-1].length()); 
    }
}