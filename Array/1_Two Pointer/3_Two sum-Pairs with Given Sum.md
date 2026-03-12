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

```


