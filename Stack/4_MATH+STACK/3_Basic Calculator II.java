                                  Basic Calculator II

s consists of integers and operators ('+', '-', '*', '/') separated by some number of spaces.
s represents a valid expression.
All the integers in the expression are non-negative integers in the range [0, 231 - 1].
The answer is guaranteed to fit in a 32-bit integer.

  "3+2*2"
  
stack = []
num = 0
sign = '+'

    
Iteration : 1    '3'
    num=3
    sign='+'
    st=[]
    
Iteration : 2    '+'
    st.push(num);             
    stack = [3]
    sign = '+'
    num = 0

    

  Iteration : 3    '2'
     st=[3]
     num=2
     sign= '+'             

    
 Iteration : 4     '*'
    st.push(st.pop()*num]    
    stack = [3, 2]
    sign = '*'
    num = 0

Iteration : 5      '2'
    st.push(st.pop()*num);
    stack=[3,4]
    sign = '*'
    num = 0
  
Final :
   res=0;
   res=res+st.pop() 
      =0+3 =3
      =3+4 =7
  

class Solution {
    public int calculate(String s) {
        Stack<Integer> st=new Stack<>();
            int num=0;
            int sign='+';
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }
             if ((!Character.isDigit(ch)&&ch!=' ')|| i == s.length()-1) {

            if(sign=='+'){
                st.push(num);
            }else if(sign=='-'){
                st.push(-num);
            }else if(sign=='*'){
                st.push(st.pop()*num);
            }else if(sign=='/'){
                st.push(st.pop()/num);
            }
            sign=ch;
            num=0;
        }
        }
        int res=0;
        while(!st.isEmpty()){
            res+=st.pop();
        }
        return res;
    }
}
  
