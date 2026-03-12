                                Triplet Sum in array



Given an array arr[] and an integer target, determine if there exists a triplet in the array whose 
sum equals the given target.

Return true if such a triplet exists, otherwise, return false.

Examples: 

Input: arr[] = [1, 4, 45, 6, 10, 8], target = 13
Output: true 
Explanation: The triplet {1, 4, 8} sums up to 13.
  
Input: arr[] = [1, 2, 4, 3, 6, 7], target = 10
Output: true 
Explanation: The triplets {1, 3, 6} and {1, 2, 7} both sum to 10. 
  
Input: arr[] = [40, 20, 10, 3, 6, 7], target = 24
Output: false 
Explanation: No triplet in the array sums to 24.


class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        // code Here
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++){
            int l=i+1,r=n-1;
            int res=target-arr[i];
            while(l<r){
                if(arr[l]+arr[r]==res)return true;
                else if(arr[l]+arr[r]<res){
                    l++;
                }else{
                    r--;
                }
            }
        }
        return false;
    } 
}

-----------------------------------------------------------------------------------------------------------------------------------------------------------

Example
arr = [1, 4, 45, 6, 10, 8]
target = 22
Step 1: Sort the array
[1, 4, 6, 8, 10, 45]
-------------------------------------------------------------------------------------------------------------------------------------------------
Iteration 1 (i = 0)  arr[i] = 1
[1, 4, 6, 8, 10, 45]
 I  L            R
  
res = target - arr[i]
res = 22 - 1 = 21
Set pointers

l= i+1                                          l = 1
r=nums.length-1                                 r = 5
Pointer Check 1
arr[l] = 4
arr[r] = 10
 while(l<r){                                     1<4         ✔
        if(arr[l]+arr[r]==res)return true;       4+45 == 22 ❌
        else if(arr[l]+arr[r]<res){              4+45 < 22  ❌
                  l++;
        }else{
                   r--;                           r--(r=4)
                }
            }
                      
-----------------------------------------------------------------------------------------------------------------------------------------------
Move right pointer
[1, 4, 6, 8, 10, 45]
I   L         R
  

Pointer Check 2
Pointer Check 1
arr[l] = 4
arr[r] = 10
 while(l<r){                                     1<4         ✔
        if(arr[l]+arr[r]==res)return true;       4+10 == 22 ❌
        else if(arr[l]+arr[r]<res){              4+10 < 22  ✔
                  l++;                           l++;(l=2)
        }else{
                   r--;                          
                }
            }
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Move left pointer
[1, 4, 6, 8, 10, 45]
 I     L      R
  
arr[l] = 6
arr[r] = 10
 while(l<r){                                     2<4        ✔
        if(arr[l]+arr[r]==res)return true;       6+10 == 22 ❌
        else if(arr[l]+arr[r]<res){              6+10 < 22  ✔
                  l++;                           l++;(l=3)
        }else{
                   r--;                           
                }
            }
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Move left pointer

[1, 4, 6, 8, 10, 45]
 I        L   R
  
arr[l] = 8
arr[r] = 10
 while(l<r){                                     3<4        ✔
        if(arr[l]+arr[r]==res)return true;       8+10 == 22 ❌
        else if(arr[l]+arr[r]<res){              8+10 < 22  ✔
                  l++;                           l++;(l=4)
        }else{
                   r--;                           
                }
            }
------------------------------------------------------------------------------------------------------------------------------------------------------------------
Move left pointer

[1, 4, 6, 8, 10, 45]
 I        LR
  
arr[l] = 8
arr[r] = 10
 while(l<r){                                     4<4❌
        if(arr[l]+arr[r]==res)return true;       
        else if(arr[l]+arr[r]<res){             
                  l++;                          
        }else{
                   r--;                           
                }
            }

Loop ends.
----------------------------------------------------------------------------------------------------------------------------------------------------------------
Iteration 2 (i = 1)
arr[i] = 4
res = 22 - 4 = 18

Pointers
[1, 4, 6, 8, 10, 45]
 I     L          R
arr[l] = 6
arr[r] = 45
  
Pointer Check 1
while(l<r){                                          2<5 ✔
        if(arr[l]+arr[r]==res)return true;           6+45 == 18 ❌  
        else if(arr[l]+arr[r]<res){                  6+45 < 18  ❌
                  l++;                          
        }else{
                   r--;                              r--;(r=4)
                }
            }
-------------------------------------------------------------------------------------------------------------------------------------------------
Pointer Check 2
Pointers
[1, 4, 6, 8, 10, 45]
 I     L      R
arr[l] = 6
arr[r] = 10
  
Pointer Check 1
while(l<r){                                          2<4 ✔
        if(arr[l]+arr[r]==res)return true;           6+10 == 18 ❌  
        else if(arr[l]+arr[r]<res){                  6+10 < 18   ✔
                  l++;                               l++;(l==3)
        }else{
                   r--;                              
                }
            }
---------------------------------------------------------------------------------------------------------------------------------------------------------
Pointer Check 3
Pointers
[1, 4, 6, 8, 10, 45]
 I         L  R
arr[l] = 8
arr[r] = 10
  
Pointer Check 1
while(l<r){                                          3<4 ✔
        if(arr[l]+arr[r]==res)return true;           8+10 == 18 ✔ 
        else if(arr[l]+arr[r]<res){                  
                  l++;                          
        }else{
                   r--;                             
                }
            }
------------------------------------------------------------------------------------------------------------------------------------------------
Triplet found:

4 + 8 + 10 = 22

Program 
  True
