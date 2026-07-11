// Last updated: 7/11/2026, 10:36:07 AM
class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> s1 = new Stack<>();
        for(String ch : ops){
            if(ch.equals("+")){
                int top = s1.pop();
                int newtop = s1.peek() + top;
                s1.push(top);
                s1.push(newtop);

            }
            else if(ch.equals("C")){
                s1.pop();
            }
            else if(ch.equals("D")){
                s1.push(2*(s1.peek()));
            }
            else{
                s1.push(Integer.valueOf(ch));
            }

        }
        int sum = 0;

        for(int stack:s1){
            sum+=stack;

        }
        return sum;
        
    }
}