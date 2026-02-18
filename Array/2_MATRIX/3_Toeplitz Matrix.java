                                          Toeplitz Matrix


Input: matrix = [[1,2,3,4],
                 [5,1,2,3],
                 [9,5,1,2]]
Output: true
  
* You are given a matrix.
* You need to check whether it is a Toeplitz Matrix or not.
* A matrix is Toeplitz if:
* Every diagonal from top-left → bottom-right has the same elements.

In simple words:
matrix[i][j] == matrix[i-1][j-1]
for all valid positions.

✅ Given Input
matrix =
[
 [1, 2, 3, 4],
 [5, 1, 2, 3],
 [9, 5, 1, 2]
]


Output:

true

🔍 Why Output is True?

Let’s check diagonals one by one.
Diagonal 1
Start at (0,0):

1
  1
    1


All values = 1 ✅
--------------------------------------------------------------------------------------------------------------------------
Diagonal 2
Start at (0,1):

2
  2
    2


All values = 2 ✅
-----------------------------------------------------------------------------------------------------------------------
Diagonal 3
Start at (0,2):

3
  3


All values = 3 ✅
-----------------------------------------------------------------------------------------------------------------------
Diagonal 4
Start at (0,3):

4

Single element → always valid ✅
-----------------------------------------------------------------------------------------------------
Diagonal 5
Start at (1,0):

5
  5

All values = 5 ✅
----------------------------------------------------------------------------------------------------------------------------
Diagonal 6
Start at (2,0):

9
Single element → valid ✅
--------------------------------------------------------------------------------------------------------------------------------
Since all diagonals have same elements, matrix is Toeplitz → return true.

❌ When Would It Be False?

Example:

[
 [1,2,3],
 [5,9,2],
 [9,5,1]
]
Here:
2 ≠ 9
Diagonal mismatch → false.

-----------------------------------------------------------------------------------------------------------------------------------
  code:

class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int n=matrix.length,m=matrix[0].length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<m-1;j++){
                if(matrix[i][j]!=matrix[i+1][j+1]){
                    return false;
                }
            }
        }
        return true;
        
    }
}
