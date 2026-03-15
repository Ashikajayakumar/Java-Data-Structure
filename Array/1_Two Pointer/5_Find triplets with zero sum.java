                                   Find triplets with zero sum

Given an array arr[] of integers, determine whether it contains a triplet whose sum equals zero. 
Return true if such a triplet exists, otherwise, return false.

Examples:

Input: arr[] = [0, -1, 2, -3, 1]
Output: true
Explanation: The triplet [0, -1, 1] has a sum equal to zero.

Input: arr[] = [1, 2, 3]
Output: false
Explanation: No triplet with a sum of zero exists.
---------------------------------------------------------------------------------------------------------------------------------------------------------
 class Solution {
    public boolean findTriplets(int[] arr) {
        // code here.
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++){
            int sum=arr[i];
            int l=i+1,r=n-1;
            while(l<r){
                if(sum+arr[l]+arr[r]==0) return true;
                else if(sum+arr[l]+arr[r]<0){
                    l++;
                }else{
                    r--;
                }
            }
        }
        return false;
    }
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------55

Example
arr = [-1, 0, 1, 2, -1, -4]
Step 1: Sort the array
[-4, -1, -1, 0, 1, 2]


Iteration 0 (i = 0)
arr[i] = -4
sum = -4
  
[-4, -1, -1, 0, 1, 2]
 I    L            R
l = i+1 = 1
r = n-1 = 5


 while(l<r){                                                      1<5 ✔
  if(sum+arr[l]+arr[r]==0) return true;                          -4-1+2 == 0 ❌
  else if(sum+arr[l]+arr[r]<0){                                  -4-1+2 < 0      -3 < 0 ✔
     l++;                                                         l++;(l== 2)
  }else{
     r--;
      }
   }
----------------------------------------------------------------------------------------------------------------------------------------------------------
Iteration:1 
arr[i] = -4
sum = -4
  
[-4, -1, -1, 0, 1, 2]
 I        L        R
l = 2
r = n-1 = 5


 while(l<r){                                                      2<5 ✔
  if(sum+arr[l]+arr[r]==0) return true;                          -4-1+2 == 0 ❌
  else if(sum+arr[l]+arr[r]<0){                                  -4-1+2 < 0      -3 < 0 ✔
     l++;                                                         l++;(l== 3)
  }else{
     r--;
      }
   }
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Iteration :2 
arr[i] = -4
sum = -4
  
[-4, -1, -1, 0, 1, 2]
 I           L     R
l = 3
r = n-1 = 5


 while(l<r){                                                      3<5 ✔
  if(sum+arr[l]+arr[r]==0) return true;                          -4+0+2 == 0 ❌
  else if(sum+arr[l]+arr[r]<0){                                  -4+0+2 < 0      -2 < 0 ✔
     l++;                                                         l++;(l== 4)
  }else{
     r--;
      }
   }
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Iteration : 3
arr[i] = -4
sum = -4
  
[-4, -1, -1, 0, 1, 2]
 I              L  R
l = 4
r = n-1 = 5


 while(l<r){                                                      4<5 ✔
  if(sum+arr[l]+arr[r]==0) return true;                          -4+1+2 == 0 ❌
  else if(sum+arr[l]+arr[r]<0){                                  -4+1+2 < 0      -1 < 0 ✔
     l++;                                                         l++;(l== 5)
  }else{
     r--;
      }
   }
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Move left pointer

l++
l = 5

Now
while(l < r)   5 < 5 ❌

Loop ends.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Iteration 4 
arr[i] = -1
sum = -1
  
[-4, -1, -1, 0, 1, 2]
      I   L        R
l = i+1 = 2
r = n-1 = 5


 while(l<r){                                                      2<5 ✔
  if(sum+arr[l]+arr[r]==0) return true;                           -1-1+2 == 0  ✔  true
  else if(sum+arr[l]+arr[r]<0){                                  
     l++;                                                         
  }else{
     r--;
      }
   }
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Triplet Found
-1 + (-1) + 2 = 0

Program returns
true
