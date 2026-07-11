// Last updated: 7/11/2026, 10:34:38 AM
class Solution {
    public String makeGood(String s) {
        Stack <Character> s1 = new Stack<>();
        for(char ch : s.toCharArray()){
            if (!s1.isEmpty() && Math.abs(s1.peek() - ch) == 32){
                s1.pop();
            }
            else{
                s1.push(ch);
            }
        }
        StringBuilder sb =new StringBuilder();
        for(char ch :s1){
            sb.append(ch);
        }
        return sb.toString();
    }
}