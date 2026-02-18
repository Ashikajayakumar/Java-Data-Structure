                                          Check if Matrix Is X-Matrix

Input : grid = [[2,0,0,1],
                [0,3,1,0],
                [0,5,2,0],
                [4,0,0,2]]
Output: true

  Explain of Question : 

* A matrix is an X-Matrix if:
* All elements on the main diagonal are non-zero.
* All elements on the secondary diagonal are non-zero.
* All other elements are zero.
  
  Code:
    class Solution {
    public boolean checkXMatrix(int[][] grid) {
     for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[i].length;j++){
            if(i==j || i+j==grid.length-1){
                if(grid[i][j]==0){
                    return false;
                }
            }else{
                if(grid[i][j]!=0){
                    return false;
                }
            }
        }
     }
     return true;
    }
}


✅ Example Matrix
grid =
[
 [2, 0, 3],
 [0, 5, 0],
 [7, 0, 9]
]

Here diagonals:
2   5   9   (main)
3   5   7   (secondary)

🔄 Iteration Step-by-Step
Loop:
for(int i = 0; i < grid.length; i++){
    for(int j = 0; j < grid[i].length; j++){
      
Assume n = 3
  --------------------------------------------------------------------------------------------------------------------------------
Iteration 1
i = 0, j = 0
Check:
if(i==j || i+j==grid.length-1){
  
i == j → true(diagonal)
  
So diagonal element must be non-zero.
grid[0][0] = 2 ✔️
Continue.
----------------------------------------------------------------------------------------------------------------------------------
Iteration 2
i = 0, j = 1
Check:

if(i==j || i+j==grid.length-1){
i==j  -> 0==1 ❌ 
i + j==grid.length -> 1+2 ≠ 2❌

  
Not diagonal → must be zero.
grid[0][1] = 0 ✔️
-----------------------------------------------------------------------------------------------------------------------------
Iteration 3
i = 0, j = 2
if(i==j || i+j==grid.length-1){
  
   i+j ==grid.length  0+2 ==2  ✔️
     
i + j = 2 → secondary diagonal 
Must be non-zero.
grid[0][2] = 3 ✔️
----------------------------------------------------------------------------------------------------------------------------------
Iteration 4
i = 1, j = 0
if(i==j || i+j==grid.length-1){
  
   i==j  -> 1≠0 ❌
   i+j== grid.length  1+0 ≠ 2 ❌
     
Not diagonal → must be zero.
grid[1][0] = 0 ✔️
----------------------------------------------------------------------------------------------------------------------------------
Iteration 5
i = 1, j = 1
Main + secondary both:
if(i==j || i+j==grid.length-1){
  
i == j ✔️
i + j == 2 ✔️
  
Must be non-zero.
grid[1][1] = 5 ✔️
---------------------------------------------------------------------------------------------------------------------------------------------
Iteration 6
i = 1, j = 2
if(i==j || i+j==grid.length-1){
  
   i==j  -> 1 ≠ 2      ❌
   i + j== grid.length 1+2 ≠ 2 ❌
     
Not diagonal → must be zero.
grid[1][2] = 0 ✔️
----------------------------------------------------------------------------------------------------------------------------------------------------
Iteration 7
i = 2, j = 0
if(i==j || i+j==grid.length-1){
  
   i+j == grid.length-1
   2+0 == 2 
     
Secondary diagonal.
grid[2][0] = 7 ✔️
---------------------------------------------------------------------------------------------------------------------------------------
Iteration 8
i = 2, j = 1
if(i==j || i+j==grid.length-1){
  
   i ==j   2≠ 1 ❌
   i+j == grid.length  2+1 ≠ 2 ❌
     
Not diagonal → must be zero.
grid[2][1] = 0 ✔️
-------------------------------------------------------------------------------------------------------------------------------------
Iteration 9
i = 2, j = 2
if(i==j || i+j==grid.length-1){
   i==j   2==2
     
Main diagonal.

grid[2][2] = 9 ✔️

✅ Final Result

No violations → return true.
