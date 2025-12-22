                                           Evaluate Reverse Polish Notation

The valid operators are '+', '-', '*', and '/'.
Each operand may be an integer or another expression.
The division between two integers always truncates toward zero.
There will not be any division by zero.
The input represents a valid arithmetic expression in a reverse polish notation.
The answer and all the intermediate calculations can be represented in a 32-bit integer.    


  Java Implementation
  class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String ch:tokens){
            if(ch.equals("+")){
                st.push(st.pop()+st.pop());
            }else if(ch.equals("-")){
                int second=st.pop();
                int first=st.pop();
                st.push(first-second);
            }else if(ch.equals("*")){
                st.push(st.pop()*st.pop());
            }else if(ch.equals("/")){
                int second=st.pop();
                 int first=st.pop();
                st.push(first/second);
            }else{
                st.push(Integer.parseInt(ch));
            }
        }
        return st.peek();
    }
}
