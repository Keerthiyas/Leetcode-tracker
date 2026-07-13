// Last updated: 7/13/2026, 10:33:09 AM
class Solution {
    public boolean isValid(String s) {
        Stack<Character> s1 = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch =='('|| ch=='{'||ch=='['){
                s1.push(ch);
            }
            else{
            if(s1.isEmpty()){
                return false;
            }
            char top = s1.pop();
            if(ch==')'&& top!='('){
                return false;
            }
            if(ch==']'&& top!='['){
                return false;
            }
            if(ch=='}'&& top!='{'){
                return false;
            }
        }
        }
        return s1.isEmpty();

        
        
    }
}