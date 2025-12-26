                                           Maximum Rectangle

matrix =
[
  ['1','0','1','0','0'],   // Row 0
  ['1','0','1','1','1'],   // Row 1
  ['1','1','1','1','1'],   // Row 2
  ['1','0','0','1','0']    // Row 3
]

  Iteration : 0 
  
  🔹 ROW 0 → Histogram
     [1, 0, 1, 0, 0]


  
     Y (height)
2 |
1 | █     █
0 +----------------
    0  1  2  3  4  → X (columns)
   [1, 0, 1, 0, 0]


  
  
  🔹 ROW 1 → Histogram
     [2, 0, 2, 1, 1]

        Y
3 |
2 | █     █
1 | █     █  █  █
0 +----------------
    0  1  2  3  4  → X  
   [2, 0, 2, 1, 1]
   

  🔹 ROW 2 -> Histogram
     [3, 1, 3, 2, 2]


  Y
4 |
3 | █     █
2 | █     █   █  █   ← height = 2
1 | █  █  █   █  █
0 +----------------------
    0  1  2   3  4      → X
   [3, 1, 3, 2,  2]



  🔥 MAX RECTANGLE (your example)
      █ █ █
      █ █ █


    Columns → 2, 3, 4
    Height → 2
    Width → 3
    Area → 6 ✅

  
  🔹 ROW 3 → Histogram
     [4, 0, 0, 3, 0]

    Y
5 |
4 | █
3 | █       █
2 | █       █
1 | █       █
0 +----------------
    0  1  2  3  4  → X
   [4, 0, 0, 3, 0]
      

  
    MATRIX:
        [
          1 0 1 0 0
          1 0 1 1 1
          1 1 1 1 1
          1 0 0 1 0
        ]

        HISTOGRAM MAX AREA (ROW WISE):

        Row 0 heights = [1,0,1,0,0]
        Max Area = 1

        Row 1 heights = [2,0,2,1,1]
        Max Area = 3

        Row 2 heights = [3,1,3,2,2]
        Max Area = 6  ✅  <-- FINAL ANSWER

        Row 3 heights = [4,0,0,3,0]
        Max Area = 4
    */

  Step : 1
     Stack<Integer> st = new Stack<>();
     st.push(-1);️
     int maxarea = 0;

     for (int i = 0; i < h.length; i++)
    # We process bars from left to right.

Step : 2
  Iteration: 0
  
    i = 0 → height = 3
    st.peek() != -1 && h[i] <= h[st.peek()]
    Stack top = -1
    Condition false → skip while

    st.push(0);
    stack = [-1, 0]


      
  Step : 3
  Iteration : 1
 
    i = 1 → height = 1
    1 <= 3 → TRUE
    int hei = h[st.pop()];                    # st.pop()= 0  -> h=3
    hei = 3                                   stack = [-1]
    int w = i - st.peek() - 1                 # w = 1 - (-1) - 1 = 1
    maxarea=Math.max(maxarea,hei*w)           # maxarea = max(0, 2 * 1) = 3
    st.push(1);                               stack = [-1, 1]


  Step : 4
  Iteration : 2

  
      i = 2 → height = 2
      2 < 3  → Condition FALSE
      2 < 3 → push
     stack = [-1, 1, 2]
      
  
 Step : 5
  Iteration : 3

      
     i = 3 → height = 2
    2 <= 3 → TRUE
    int hei = h[st.pop()];                    # st.pop()= 2  -> h=3
    hei = 3                                   stack = [-1, 1]
    int w = i - st.peek() - 1                 # w = 3 - (1) - 1 = 1
    maxarea=Math.max(maxarea,hei*w)           # maxarea = max(3, 2 * 1) = 3
    st.push(3);                               stack = [-1, 1, 3]

      
 Step : 6
  Iteration : 4



    i = 4 → height = 2
    2 <= 2 → TRUE
    int hei = h[st.pop()];                    # st.pop()= 3  -> h=2
    hei = 2                                   stack = [-1, 1]
    int w = i - st.peek() - 1                 # w = 4 - (1) - 1 = 2
    maxarea=Math.max(maxarea,hei*w)           # maxarea = max(3, 2 * 2) = 4
    st.push(4);                               stack = [-1, 1, 4]
      

Step : 8
  Iteration : 4

    height = h[st.pop()];                    # st.pop() = 4 ->h= 2
    height = 2
    width = h.length - st.peek() - 1;        # width = 5 - -1 -1 = 3
    max = Math.max(max, height * width);     # max= Math.max(4, 2* 3)
    max=6



Step : 8
  Iteration : 1

    height = h[st.pop()];                    # st.pop() = 1 ->h= 1
    height = 1
    width = h.length - st.peek() - 1;        # width = 5 - (-1) -1 = 5
    max = Math.max(max, height * width);     # max= Math.max(4, 1* 5)
    max=6



  
Java Implementation 

  class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0) return 0;
        int cols = matrix[0].length;
        int[] heights = new int[cols];
        int maxArea = 0;

        for (char[] row : matrix) {
            for (int c = 0; c < cols; c++) {
                heights[c] = (row[c] == '1') ? heights[c] + 1 : 0;
            }
            maxArea = Math.max(maxArea, largestRectangleArea(heights));
        }
        return maxArea;
    }

    private int largestRectangleArea(int[] h) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int max = 0;

        for (int i = 0; i < h.length; i++) {
            while (st.peek() != -1 && h[i] <= h[st.peek()]) {
                int height = h[st.pop()];
                int width = i - st.peek() - 1;
                max = Math.max(max, height * width);
            }
            st.push(i);
        }

        while (st.peek() != -1) {
            int height = h[st.pop()];
            int width = h.length - st.peek() - 1;
            max = Math.max(max, height * width);
        }
        return max;
    }
}

