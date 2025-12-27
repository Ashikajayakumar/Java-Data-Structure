                                              Sum of Subarray Minimums

Input: arr = [3,1,2,4]
Output: 17
Explanation: 
Subarrays are [3], [1], [2], [4], [3,1], [1,2], [2,4], [3,1,2], [1,2,4], [3,1,2,4]. 
Minimums are   3,   1,   2,   4,    1,     1,     2,      1,       1,      1.
Sum is 17.


   
  arr=[3, 1, 2, 4]
  left = n.length

        int n = arr.length;
        int MOD = 1_000_000_007;

        int[] left = new int[n];   // distance to Previous Smaller Element
        int[] right = new int[n];  // distance to Next Smaller Element

        Stack<Integer> stack = new Stack<>();
  




  for (int i = 0; i < n; i++) {
    while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
        stack.pop();
    }
    left[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
    stack.push(i);
}


   /* --------------------------------------------------- ------------------------------*/

Iteration : 0
  stack is empty
  left[i]=  stack.isEmpty() ? i + 1 : i - stack.peek();           #left[0]= i+1= 0+1= 1 
  st=[0]

   /* --------------------------------------------------- ------------------------------*/
  
Iteration : 1
  while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {      #arr[0] >= arr[1]   3>=1  ✅
        stack.pop();                                             #st=[]
    } 
   left[i] = stack.isEmpty() ? i + 1 : i - stack.peek();        #left[1]= i+1 = 1+1 = 2
    st=[1]

   /* --------------------------------------------------- ------------------------------*/
     

Iteration : 2
  while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {      #arr[1] >= arr[2] → 1 >= 2  ❌
        stack.pop();                                            
    } 
  left[i] = stack.isEmpty() ? i + 1 : i - stack.peek();          #left[1]= i- st.peek()= 2-1=1
    st=[1,2]

   /* --------------------------------------------------- ------------------------------*/

    
Iteration : 3
   while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {      #arr[2] >= arr[3] → 2 >= 4  ❌
        stack.pop();                                            
    } 
  left[i] = stack.isEmpty() ? i + 1 : i - stack.peek();           #left[1]= i- st.peek()= 3-2=1
    st=[1,2,3]                                                                      

   /* --------------------------------------------------- ------------------------------*/

left = [1, 2, 1, 1]


  

  arr=[3, 1, 2, 4]
  right = n-1 position start


  

   for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n - i : stack.peek() - i;
            stack.push(i);
    }

   /* --------------------------------------------------- ------------------------------*/

Iteration : 3

  right[i] = stack.isEmpty() ? n - i : stack.peek() - i;             #right[3]=  n-i = 4-3 =1
  stack.push(i)                                                      # st=[3]

   /* --------------------------------------------------- ------------------------------*/
  
Iteration : 2

   while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {           #arr[3]>arr[2]  4 > 2 → pop
                stack.pop();                                          # st=[]
            }
    right[i] = stack.isEmpty() ? n - i : stack.peek() - i;             #right[2]= n-i=  4-2 = 2
    stack.push()                                                       #st=[2]

      
   /* --------------------------------------------------- ------------------------------*/

    
Iteration : 1

      while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {           #arr[2]>arr[1]  2 > 1 → pop
                stack.pop();                                             # st=[]
            }
     right[i] = stack.isEmpty() ? n - i : stack.peek() - i;             #right[1]= n-i = 4-1 = 3
     stack.push()                                                        #st=[1]
  
     /* --------------------------------------------------- ------------------------------*/
       
       
Iteration : 0 

      while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {           #arr[1]>arr[0]  1 > 3 ❌ → no pop
                stack.pop();                                             # st=[1]
            }
     right[i] = stack.isEmpty() ? n - i : stack.peek() - i;             #right[1]= stack.peek() - i =1-0=1
     stack.push()                                                       # st=[1,0]

   /* --------------------------------------------------- ------------------------------*/
       

right = [1, 3, 2, 1]



  

long ans = 0;
for (int i = 0; i < n; i++) {
    ans = (ans + (long) arr[i] * left[i] * right[i]) % MOD;
}
return (int) ans;


   /* --------------------------------------------------- ------------------------------*/


arr   = [3, 1, 2, 4]
left  = [1, 2, 1, 1]
right = [1, 3, 2, 1]

Iteration : 0
   ans= arr[i]* left[i] *right[i]                   # ans= 3 * 1 * 1= 3

Iteration : 1
   ans= arr[i]* left[i] *right[i]                   # ans= 1 * 2 * 3= 6

  Iteration : 2
   ans= arr[i]* left[i] *right[i]                   # ans= 2 * 1 * 2= 4

  Iteration : 3
   ans= arr[i]* left[i] *right[i]                   # ans= 4 * 1 * 1= 4

  ans = 3 + 6 + 4 + 4 = 17

 /* --------------------------------------------------- ------------------------------*/

  
Java Implemenattion
  
  class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int MOD = 1_000_000_007;

        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> stack = new Stack<>();

        // LEFT: Previous Smaller
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        stack.clear();

        // RIGHT: Next Smaller
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n - i : stack.peek() - i;
            stack.push(i);
        }

        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans = (ans + (long) arr[i] * left[i] * right[i]) % MOD;
        }

        return (int) ans;
    }
}
