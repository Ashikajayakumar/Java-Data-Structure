                                Two Sum-Pairs with Given sum 


Given an array arr[] of integers and another integer target. Determine if there exist two 
distinct indices such that the sum of their elements is equal to the target.

Examples:

Input: arr[] = [0, -1, 2, -3, 1], target = -2
Output: true
Explanation: arr[3] + arr[4] = -3 + 1 = -2
  
Input: arr[] = [1, -2, 1, 0, 5], target = 0
Output: false
Explanation: None of the pair makes a sum of 0
  
Input: arr[] = [11], target = 11
Output: false


 ```java 
  class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int res=target-arr[i];
            if(set.contains(res)){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}

```-------------------------------------------------------------------------------------------------------------------------------------------
Formula used:
                                  required=target−arr[i]
Example
arr = [2, 7, 11, 15]
target = 9

Initial state
set = {}
Iteration 1 (i = 0)  arr[i] = 2

Required value
res = 9 - 2 = 7

Check set  set.contains(7) → false
Add element to set :set = {2}
--------------------------------------------------------------------------------------------------------------------------------------------------------
Iteration 2 (i = 1) arr[i] = 7

Required value
res = 9 - 7 = 2

Check set set.contains(2) → true

Pair found: 2 + 7 = 9

Program returns true
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Loop stops here.

Table Representation
i 	arr[i]	 res = target-arr[i]	 Set Before	      Found?	      Set After
0	   2         	7	                   {}	              No           	{2}
1	   7	        2	                   {2}	            Yes	Return true
  
Final Output
true
Time Complexity
O(n)

HashSet operations are O(1) on average.


