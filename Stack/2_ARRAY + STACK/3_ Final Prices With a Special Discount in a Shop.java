                                        Final Prices With a Special Discount in a Shop

Example 1:

Input: prices = [8,4,6,2,3]
Output: [4,2,4,2,3]

prices = [8,4,6,2,3]
Stack=[]

i=0  prices=8
  stack is empty , so push i, st=[0]

i=1  prices=4
  stack is not empty , 4<=8 
  int pop=st.pop() #pop=0
  prices[pop]=prices[pop]-prices[i]  # prices[0]=prices[0]-prices[1]   prices[0]=8-4=4  
  prices=[4,4,6,2,3]   stack=[1]

i=2   prices=6
  stack is not empty , 6<=4 (X)  ,so push to stack=[1,2]

i=3   prices = 2
  stack is not empty , 2<=6  
  int pop=st.pop() # pop=2
  prices[pop]=prices[pop]-prices[i]  # prices[2]=prices[2]-prices[3]  #prices[2]=6-2=4
  prices=[4,4,4,2,3]   stack=[1]

  int pop=st.pop() # pop=1
  prices[pop]=prices[pop]-prices[i]  # prices[1]=prices[1]-prices[3]  #prices[2]=4-2=2
  prices=[4,2,4,2,3]   stack=[3]


i=4    prices= 2
  stack is not empty 3<=2 (X)
  so i push i
  stack=[3,4]


Java Implementation

  
class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && prices[i]<=prices[st.peek()]){
                int pops=st.pop();
                prices[pops]=prices[pops]-prices[i];
            }
            st.push(i);
        }
        return prices;
    }
}
