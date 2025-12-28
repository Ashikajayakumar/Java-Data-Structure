                                              132 Pattern


Input: nums = [3, 1, 4, 2]

for(int i=nums.length-1; i > 0; i--)

Iteration : 3                         nums[i]= ' 2 '

    if (nums[i] < third) → false
    while stack empty → skip                                                           #st= [2]
    st.push(2)
--------------------------------------------------------------------------------------

  Iteration : 2                       nums[i]= ' 4 '

     if (4 < third) → false
     while (stack.peek() < 4)                                                          #st.peek()=2    st.peek()< 4   2<4
        third = 2 (pop)                                                                # third = 4
  --------------------------------------------------------------------------------------

  Iteration : 1                       nums[i]= ' 1 '

     if(nums[i] < third) → true                                                        # nums[i] <third    1 < 4 
        retrun true;
--------------------------------------------------------------------------------------


      nums[i] = 1
      nums[k] = 2 (third)
      nums[j] = 4



        Java Implementation


        class Solution {
        public boolean find132pattern(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int third = Integer.MIN_VALUE;

        for (int i = nums.length - 1; i >= 0; i--) {

            if (nums[i] < third) {
                return true;
            }

            while (!st.isEmpty() && st.peek() < nums[i]) {
                third = st.pop();
            }

            st.push(nums[i]);
        }
        return false;
    }
}


   
  
