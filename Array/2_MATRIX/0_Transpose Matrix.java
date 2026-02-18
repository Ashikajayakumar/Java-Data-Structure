                                           Transpose Matrix

Input: matrix = [[1,2,3],
                 [4,5,6],
                 [7,8,9]]
Output: [[1,4,7],
         [2,5,8],
         [3,6,9]]


class Solution {
    public int[][] transpose(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
        int[][]res=new int[n][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[j][i]=matrix[i][j];
            }
        }
        return res;
    }
}


Question:
  2D array is a question ,answer should be Tranpose of given input.

Declare:
   newly array created size should be size in the input size

Explain:
   for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[j][i]=matrix[i][j];
            }
        }
        return res;

Iteration: 0
     ✅ Example Matrix

matrix =
[
  [1, 2, 3],
  [4, 5, 6]
]


So:
m = 2 (rows)
n = 3 (columns)

Result matrix size:
res = new int[n][m] = 3 × 2
Initial res:
[
 [0, 0],
 [0, 0],
 [0, 0]
]

  
🔄 Iteration 1
i = 0
j = 0
  
matrix =
[
  [1, 2, 3],
  [4, 5, 6]
]

Assignment:
res[j][i] = matrix[i][j]
res[0][0] = matrix[0][0] = 1

res becomes:
[
 [1, 0],
 [0, 0],
 [0, 0]
]

🔄 Iteration 2
i = 0
j = 1
matrix =
[
  [1, 2, 3],
  [4, 5, 6]
]
res[1][0] = matrix[0][1] = 2
res:
[
 [1, 0],
 [2, 0],
 [0, 0]
]

🔄 Iteration 3
i = 0
j = 2
matrix =
[
  [1, 2, 3],
  [4, 5, 6]
]
res[2][0] = matrix[0][2] = 3
res:
[
 [1, 0],
 [2, 0],
 [3, 0]
]

🔄 Iteration 4
i = 1
j = 0
matrix =
[
  [1, 2, 3],
  [4, 5, 6]
]
res[0][1] = matrix[1][0] = 4
res:
[
 [1, 4],
 [2, 0],
 [3, 0]
]

🔄 Iteration 5
i = 1
j = 1
matrix =
[
  [1, 2, 3],
  [4, 5, 6]
]
res[1][1] = matrix[1][1] = 5
res:
[
 [1, 4],
 [2, 5],
 [3, 0]
]

🔄 Iteration 6
i = 1
j = 2
matrix =
[
  [1, 2, 3],
  [4, 5, 6]
]
res[2][1] = matrix[1][2] = 6
res:

[
 [1, 4],
 [2, 5],
 [3, 6]
]

✅ Final Transpose Matrix
[
 [1, 4],
 [2, 5],
 [3, 6]
]
