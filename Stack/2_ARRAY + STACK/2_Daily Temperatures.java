                                          Daily Temperatures

Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.

 

Example 1:

Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]
Example 2:

Input: temperatures = [30,40,50,60]
Output: [1,1,1,0]
Example 3:

Input: temperatures = [30,60,90]
Output: [1,1,0]

  
temperatures = [73,74,75,71,69,72,76,73]
Day : 0   tem= 73
  First warm= 74(day 1)
  day=1-0=1

Day : 1    tem=74
  First warm= 75(day 2)
  day=2-1=1

Day : 2     tem=75
  First warm=76(day 6)
  day=6-2=4

Day : 3     tem=71
  First warm=72(day 5)
  day=5-3=2

Day : 4     tem=69
  First warm=72(day 5)
  day=5-4=1

Day : 5    tem=72
  First warm=76(day 6)
  day= 6-5=1

Day : 6    tem=76
  No warm 
  day = 0

Day : 7   tem=73
  No warm 
  day = 0


  Java Implementation

  class Solution {
    public int[] dailyTemperatures(int[] tem) {
        int n=tem.length;
        int[] res=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
         while(!st.isEmpty() && tem[i] >tem[st.peek()]){
                int previous=st.pop();
                res[previous]=i-previous;
            }
            st.push(i);
        }
        return res;
    }
}
