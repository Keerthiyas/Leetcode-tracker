// Last updated: 8/9/2026, 9:09:00 PM
1class Solution {
2    public char nextGreatestLetter(char[] letters, char target) {
3        char c=letters[0];
4        int tar=target-'a';
5        for(int i=0;i<letters.length;i++){
6            int t=(int)letters[i]-'a';
7            if(t>tar) {
8                c= letters[i];
9                break;
10            }
11        }
12        return c;
13    }
14}