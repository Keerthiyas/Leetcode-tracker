// Last updated: 7/11/2026, 10:35:26 AM
class Solution {
    public String removeDuplicates(String s) {

        StringBuilder stack = new StringBuilder();

        for(char c : s.toCharArray()) {

            int length = stack.length();

            if(length != 0 && stack.charAt(length - 1) == c) {

                // Pop operation
                stack.setLength(length - 1);

            } else {

                // Push operation
                stack.append(c);
            }
        }

        return stack.toString();
    }
}