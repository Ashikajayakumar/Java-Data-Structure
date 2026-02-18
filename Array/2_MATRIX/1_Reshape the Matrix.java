                                       Reshape the Matrix
Example: 1
Input: mat = [[1,2],[3,4]], r = 1, c = 4
Output: [[1,2,3,4]]

Example: 2
Input: mat = [[1,2],[3,4]], r = 2, c = 4
Output: [[1,2],[3,4]]
  
Question Explain:
  The Given Input shape  is 2/2 matrix  ,then we want to convert into 1/4 matrix ,
  if it  have a same element size (2*2=4,1*4=4)  we can change the size .
  if it doesnot same means didnot want to change.

  Code:

  class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n=mat.length;
        int m=mat[0].length;
        if(m*n == r*c){
        int[][] newarr=new int [r][c];
        int k=0,l=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                newarr[k][l]=mat[i][j];
                l++;
                if(l==c){
                    k++;
                    l=0;
                }
            }
        }
        return newarr;
        }
        else{
            return mat;
        }
    }
}

Explain:
   Example Input
mat =
[
 [1, 2],
 [3, 4]
]
r = 1
c = 4

Step 1: Initial Values
int n = mat.length;      // 2 rows
int m = mat[0].length;   // 2 columns
So:
n = 2
m = 2
Check condition:
if (m * n == r * c)
2 * 2 == 1 * 4
4 == 4 ✅
Reshape possible.
---------------------------------------------------------------------------------------------------------------------------------
Step 2: Create New Matrix
int[][] newarr = new int[r][c];
So new matrix size = 1 × 4

Initial state:
newarr = [ [0, 0, 0, 0] ]
------------------------------------------------------------------------------------------------------------------------------
Step 3: Initialize Position Pointers
int k = 0;   // row index of newarr
int l = 0;   // column index of newarr
------------------------------------------------------------------------------------------------------------------------------
🔄 Iteration Breakdown
Iteration 1
i = 0
j = 0
Code executing:
mat = [[1,2],
       [3,4]]
newarr[k][l] = mat[i][j];
Becomes:
newarr[0][0] = mat[0][0] = 1

Then:
l++; //column wise it increase to '1' index
l = 1

Matrix now:
[ [1, 0, 0, 0] ]
----------------------------------------------------------------------------------------------------------------------------------
Iteration 2
i = 0
j = 1
mat = [[1,2],
       [3,4]]
  
newarr[0][1] = mat[0][1] = 2;
l++;//row-wise again it increse size  to '2' index
l = 2

Matrix:
[ [1, 2, 0, 0] ]
-----------------------------------------------------------------------------------------------------------------------------------
Iteration 3
i = 1
j = 0
mat = [[1,2],
       [3,4]]
  
newarr[0][2] = mat[1][0] = 3;
l++;//row-wise again it increse size  to '3' index
l = 3

Matrix:
[ [1, 2, 3, 0] ]
----------------------------------------------------------------------------------------------------------------------------------------------
Iteration 4
i = 1
j = 1
mat = [[1,2],
       [3,4]]
  
newarr[0][3] = mat[1][1] = 4;
l++;////row-wise again it increse size  to '4' index
l = 4
---------------------------------------------------------------------------------------------------------------------------------------

Now:

if (l == c) // l is start from 0 after added one by one now l=4,given c=4 (l,c--> column)
4 == 4 ✅
Execute:
k++;    // k = 1
l = 0;  // reset column ...it means increase the row and row is started  from '0' onde

✅ Final Reshaped Matrix
[ [1, 2, 3, 4] ]
