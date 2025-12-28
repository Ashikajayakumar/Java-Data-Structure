                              Asteroid Collision

  asteroids = [5, 10, -5]

Iteration : 0           a = 5

  if(a > 0){
    st.push(a);                                                                          #st=[5] 
}

  --------------------------------------------------------------------------------------


Iteration : 1           a = 10

  if(a > 0){
    st.push(a);                                                                      #st=[5,10]
}


  --------------------------------------------------------------------------------------

   
Iteration : 2         a = -5

  if(a > 0)  {                                                                        # a>=-5 ❌
  }
  else{
    while(!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -a) {               # 10 >0 && 10 <= -(-5) ❌
    stack.pop();
   } 
    if(st.isEmpty() || st.peek() < 0){
      st.push(a)                                                                    #  stack.peek() = 10 > 0 ❌
    }
    if(st.peek () == -a){                                                           # 10 == -(-5)   ❌
      st.pop()
    }
}
  --------------------------------------------------------------------------------------


Convert stack to Array
  res=new int[st.size()]
  i=st.size()-1;                                                                      #st=[5,10]

  while(!st.isEmpty()){
    res[i--]=st.pop();                 
  }

  return res;                                                                        [5,10]


  --------------------------------------------------------------------------------------
Java Implementation

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>st=new Stack<>();
        for(int a:asteroids){
            if(a>0){
                st.push(a);
            }else{
                while(!st.isEmpty() && st.peek()>0 && st.peek() < -a){
                    st.pop();
                }
                if(st.isEmpty()|| st.peek() < 0){
                    st.push(a);
                }
                if(st.peek()==-a){
                    st.pop();
                }
            }
        }
            int[] res=new int[st.size()];
            int i=st.size()-1;
            while(!st.isEmpty()){
                res[i--]=st.pop();
            }
        return res;
    }
}
