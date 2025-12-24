
                                    Basic Calculator

 s consists of digits, '+', '-', '(', ')', and ' '.
 s represents a valid expression.
 '+' is not used as a unary operation (i.e., "+1" and "+(2 + 3)" is invalid).
 '-' could be used as a unary operation (i.e., "-1" and "-(2 + 3)" is valid).


  Initial:
  
        int result = 0;
        int number = 0;
        int sign = 1;



Example : 1+2-(3-78)


  
  
Iteration : 1  "1"
    number =1

  
Iteration : 2   "+"
     result = result+(sign*number)     # result= 0+(1*1)=1
     number = 0                         # number =0
     sign = 1                           # sign=1

  
Iteration : 3   "2"
  number=2

  
Iteration : 4   "-"
     result = result+(sign*number)     # result= 1+(1*2)=3
     number = 0                        # number =0
     sign = -1                         # sign= -1

  
Iteration : 5  "("
    stack.push(result);              # st=[3]
    stack.push(sign);                # st=[3,-1]
    result = 0;
    sign = 1;


Iteration : 6     "3" 
   number=3

  
Iteration : 7     "-"
    result = result+(sign*number)     # result= 0+(1*3)=3
    number = 0                        # number =0
    sign = -1                         # sign= -1

  
Iteration : 8    "78"
    number = 78

  
Iteration : 9    ")"

        result += sign * number;       #result= 3+(-1*78) = 3-78  =-75
        number = 0;                    #number= 0
        result *= stack.pop();         # result= -75 * -1 =75
        result += stack.pop();         # result= 75 +3 =78

  
Last Iteration:
  return result + sign * number;       # 75 + -1 * 0 = 75+0 =75



  
Implementation of Java Code
  
class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int number = 0;
        int sign = 1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                number = number * 10 + (c - '0');
            } 
            else if (c == '+') {
                result += sign * number;
                number = 0;
                sign = 1;
            } 
            else if (c == '-') {
                result += sign * number;
                number = 0;
                sign = -1;
            } 
            else if (c == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } 
            else if (c == ')') {
                result += sign * number;
                number = 0;
                result *= stack.pop();
                result += stack.pop();
            }
        }

        return result + sign * number;
    }
}
