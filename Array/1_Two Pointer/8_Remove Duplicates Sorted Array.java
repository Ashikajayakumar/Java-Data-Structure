                                         Remove Duplicates Sorted Array 
You are given a sorted array arr[] containing positive integers. 
Your task is to remove all duplicate elements from this array such that each element appears only once. 
Return an array containing these distinct elements in the same order as they appeared.
  
Examples :

Input: arr[] = [2, 2, 2, 2, 2]
Output: [2]
Explanation: After removing all the duplicates only one instance of 2 will remain i.e. [2] so modified array will contains 2 at first position and you should return array containing [2] after modifying the array.

Input: arr[] = [1, 2, 4]
Output: [1, 2, 4]
Explation:  As the array does not contain any duplicates so you should return [1, 2, 4].
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        
        ArrayList<Integer> list=new ArrayList<>();
        list.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                list.add(arr[i]);
            }
        }
        return list;
    }
}
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Example
arr = [1, 1, 2, 2, 3, 4, 4]
Initial State
list = []
First element is always unique.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
list.add(arr[0])
list = [1]
Loop Starts
for(i = 1 → arr.length-1)
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Iteration 1(i = 1)
arr[i] = 1
arr[i-1] = 1

Check condition
arr[i] != arr[i-1]
1 != 1  ❌

Duplicate → Do not add
list = [1]
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Iteration 2(i = 2)
arr[i] = 2
arr[i-1] = 1

Check condition
2 != 1  ✔

Add to list
list.add(2)
list = [1,2]
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Iteration 3(i = 3)
arr[i] = 2
arr[i-1] = 2

Check condition
2 != 2 ❌

Duplicate → Skip
list = [1,2]
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Iteration 4(i = 4)
arr[i] = 3
arr[i-1] = 2

Check condition
3 != 2 ✔

Add
list.add(3)
list = [1,2,3]
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Iteration 5(i = 5)
arr[i] = 4
arr[i-1] = 3

Check
4 != 3 ✔

Add
list = [1,2,3,4]
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Iteration 6(i = 6)
arr[i] = 4
arr[i-1] = 4

Check
4 != 4 ❌

Duplicate → Skip
list = [1,2,3,4]
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Final Output
[1,2,3,4]
  
Visualization
Original Array
1 1 2 2 3 4 4
Remove Duplicates
1 2 3 4
Time Complexity
O(n)

We traverse array once.

Space Complexity
O(n)

Because we use ArrayList.





  
