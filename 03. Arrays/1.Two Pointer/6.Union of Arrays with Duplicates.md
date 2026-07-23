                                               Union of Arrays with Duplicates

You are given two arrays a[] and b[], return the Union of both the arrays in any order.
The Union of two arrays is a collection of all distinct elements present in either of the arrays. 
If an element appears more than once in one or both arrays, it should be included only once in the result.

Examples:

Input: a[] = [1, 2, 3, 2, 1], b[] = [3, 2, 2, 3, 3, 2]
Output: [1, 2, 3]
Explanation: Union set of both the arrays will be 1, 2 and 3.
  
Input: a[] = [1, 2, 3], b[] = [4, 5, 6] 
Output: [1, 2, 3, 4, 5, 6]
Explanation: Union set of both the arrays will be 1, 2, 3, 4, 5 and 6.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        HashSet<Integer>set=new HashSet<>();
        for(int num:a){
            set.add(num);
        }
        for(int num:b){
            set.add(num);
        }
           ArrayList<Integer> res = new ArrayList<>();
        for (int it : set) res.add(it);

        return res;
    }
}
---------------------------------------------------------------------------------------------------------------------------------------------------
a = [1, 2, 3, 4]
b = [2, 3, 5]

Initial State
set = {}
Loop 1 → Insert elements of array a
a = [1, 2, 3, 4]
  
Iteration 1:-(num = 1)
set.add(1)
set = {1}
------------------------------------------------------------------------------------------------------------------------------------------------
Iteration 2:-(num = 2)
set.add(2)
set = {1,2}
------------------------------------------------------------------------------------------------------------------------------------------------
Iteration 3:-(num = 3)
set.add(3)
set = {1,2,3}
------------------------------------------------------------------------------------------------------------------------------------------------
Iteration 4:-(num = 4)
set.add(4)
set = {1,2,3,4}
------------------------------------------------------------------------------------------------------------------------------------------------

Loop 2 → Insert elements of array b
b = [2, 3, 5]
  
Iteration 1:-(num = 2)
Already present
set = {1,2,3,4}
------------------------------------------------------------------------------------------------------------------------------------------------

Iteration 2:-(num = 3)
Already present
set = {1,2,3,4}
------------------------------------------------------------------------------------------------------------------------------------------------
Iteration 3:-(num = 5)
Added
set = {1,2,3,4,5}
----------------------------------------------------------------------------------------------------------------------------------------------------
Convert Set → ArrayList
  
for(int it : set)
    res.add(it)
res = [1,2,3,4,5]
  
Final Output
[1,2,3,4,5]
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Visualization
Array A → 1 2 3 4
Array B → 2 3 5
-----------------
Union   → 1 2 3 4 5
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Time Complexity
O(n + m)

n → size of array A
m → size of array B

Space Complexity
O(n + m)
Because of HashSet.
  
