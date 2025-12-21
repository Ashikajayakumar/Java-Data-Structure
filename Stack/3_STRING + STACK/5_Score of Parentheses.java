                                  Score of Parentheses

  Example:"(()(()))"   ( -> 0
                       ) -> 1

  It : 0   '('
      [0]
                                    
  It : 1    '('
      [0,0]
                                    
  It : 2     ')'
      [0,1]
                                    
  It : 3     '('
       [0,1,0]
                                    
   It : 4     '('
       [0,1,0,0]  
                                    
   It: 5     ')'
       [0,1,1]

   It: 6    ')'
       v= st.pop()                   # v= 1
       score=(v==0) ? 1:2*v          # score =2*1=2
       st.push(score+st.pop());      # st.push(2+1)=3
        [0,3]                           

   It : 7   ')'
        v= st.pop()                   # v= 3
       score=(v==0) ? 1:2*v          # score =2*3=6
       st.push(score+st.pop());      # st.push(6+0)=6
        [6]                             

Java Implementation
                                    
class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(0);
            }else{
                int v=st.pop();
                int score=(v==0)?1:2*v;
                st.push(score+st.pop());
            }
        }
        return st.pop();
    }
}



                                    
