                                 Rotate Image

Input: matrix = [[1,2,3],
                 [4,5,6],
                 [7,8,9]]
  
Output: [[7,4,1],
         [8,5,2],
         [9,6,3]]

matrix = [[1,2,3],
          [4,5,6],
          [7,8,9]]
  
transpose the given array
matrix = [[1,4,7],
          [2,5,8],
          [3,6,9]]
Reverse the each array
        [[7,4,1],
         [8,5,2],
         [9,6,3]]

code:
  class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int temp;
        for (int i=0;i<n;i++) {
            for (int j=i;j<n;j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i=0;i<n;i++) {
            for (int j=0,k=n-1;j<k;j++,k--) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
            }
        }
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------
  ✅ Your Logic (Correct Approach)
You are doing it in 2 steps:

1️⃣ Transpose
2️⃣ Reverse each row

🔹 Step 1: Transpose the Matrix
Code:
for (int i=0;i<n;i++) {
    for (int j=i;j<n;j++) {
        temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
}


matrix[i][j]  ↔  matrix[j][i]
Example:

Before transpose:

1 2 3
4 5 6
7 8 9

After transpose:

1 4 7
2 5 8
3 6 9

-------------------------------------------------------------------------------------------------------------------------------------------------------
🔹 Step 2: Reverse Each Row
Code:
for (int i=0;i<n;i++) {
    for (int j=0,k=n-1;j<k;j++,k--) {
        temp = matrix[i][j];
        matrix[i][j] = matrix[i][k];
        matrix[i][k] = temp;
    }
}


This reverses every row.
After reversing rows:
1 4 7      →      7 4 1
2 5 8      →      8 5 2
3 6 9      →      9 6 3

Final Answer:
7 4 1
8 5 2
9 6 3
  
