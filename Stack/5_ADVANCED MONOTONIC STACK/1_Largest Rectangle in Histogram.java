                                                Largest Rectangle in Histogram


h=[2,1,5,6,2,3]
Output: 10


  🟨 STEP-BY-STEP EXPLANATION WITH EXAMPLE
  
STEP : 1
Stack<Integer> st = new Stack<>();
st.push(-1);️
int maxarea = 0;

for (int i = 0; i < h.length; i++)


# We process bars from left to right.

Step : 2
  Iteration: 0
  
    i = 0 → height = 2
    st.peek() != -1 && h[i] <= h[st.peek()]
    Stack top = -1
    Condition false → skip while

    st.push(0);
    stack = [-1, 0]

Step : 3
  Iteration : 1
 
    i = 1 → height = 1
    1 <= 2 → TRUE
    int hei = h[st.pop()];                    # st.pop()= 0  -> h=2
    hei = 2                                   stack = [-1]
    int w = i - st.peek() - 1                 # w = 1 - (-1) - 1 = 1
    maxarea=Math.max(maxarea,hei*w)           # maxarea = max(0, 2 * 1) = 2
    st.push(1);                               stack = [-1, 1]

Step : 4
  Iteration : 2

  
      i = 2 → height = 5
      5 > 1  → Condition FALSE
      5 > 1 → push
     stack = [-1, 1, 2]

  Step : 5
  Iteration : 3

  
      i = 3 → height = 6
      6 > 1  → Condition FALSE
      6 > 1 → push
     stack = [-1, 1, 2, 3]

  Step : 6
  Iteration : 4


        i = 4 → height = 2
        Now pop until stack top is smaller.
        Pop index 3 (height 6)
        int hei = h[st.pop()];                    # st.pop()= 3  -> h=6
        hei = 6                                   stack = [-1,1,2]
        int w = i - st.peek() - 1                 # w = 4 - 2 - 1 = 1
        maxarea=Math.max(maxarea,hei*w)           # maxarea = max(2, 6 * 1) = 6
                                               



        Pop index 2 (height 5)
        int hei = h[st.pop()];                    # st.pop()= 2 -> h= 5
        hei =  5                                   stack = [-1,1]
        int w = i - st.peek() - 1                 # w = 4 - 1 - 1 = 2
        maxarea=Math.max(maxarea,hei*w)           # maxarea = max(6, 5 * 2) = 10 ✅
        st.push(4);                                stack=[-1,1,4]

  
Step : 7
  Iteration : 5

      i = 5  → height = 2
      3 < 2  → Condition FALSE
      3 < 2 → push
     stack = [-1, 1, 4, 5]



Step : 8  Final Cleanup (End of array)
    Bars left in stack extend till the end.
  
        while(st.peek()!=-1){
            int hei=h[st.pop()];
            int w=h.length-st.peek()-1;
            maxarea=Math.max(maxarea,hei*w);
        }

Step : 9
  Iteration : 5

  
     (st.peek() !=-1) ✅                              stack=[ -1, 1, 4, 5]
     int hei=h[st.pop()];                             # hei= h[5]   => hei= 3
     int w=h.length-st.peek()-1;                      # w= h.length-st.peek()-1;              h.length=6
                                                           6- 4 -1 =1
    maxarea=Math.max(maxarea,hei*w);                  # maxarea= (10,6*1) = 10
     

  Step : 10
  Iteration : 4

  
     (st.peek() !=-1) ✅                              stack=[ -1, 1, 4]
     int hei=h[st.pop()];                             # hei= h[4]   => hei= 2
     int w=h.length-st.peek()-1;                      # w= h.length-st.peek()-1;              h.length=6
                                                           6- 1 -1 = 4
    maxarea=Math.max(maxarea,hei*w);                  # maxarea= (10, 4* 2) = 10
     


Step : 11
  Iteration : 1

  
     (st.peek() !=-1) ✅                              stack=[ -1, 1]
     int hei=h[st.pop()];                             # hei= h[1]   => hei= 1
     int w=h.length-st.peek()-1;                      # w= h.length-st.peek()-1;              h.length=6
                                                           6- (-1) -1 = 6
    maxarea=Math.max(maxarea,hei*w);                  # maxarea= (10,6*1) = 10

maxarea remains 10

Step : ️12
                        
  return maxarea;




class Solution {
    public int largestRectangleArea(int[] h) {
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        int maxarea=0;
        for(int i=0;i<h.length;i++){
            while(st.peek()!=-1 && h[i]<=h[st.peek()]){
                int hei=h[st.pop()];
                int w=i-st.peek()-1;
                maxarea=Math.max(maxarea,hei*w);
            }
            st.push(i);
        }
        while(st.peek()!=-1){
            int hei=h[st.pop()];
            int w=h.length-st.peek()-1;
            maxarea=Math.max(maxarea,hei*w);
        }
        return maxarea;
    }
}
