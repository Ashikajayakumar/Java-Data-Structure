                                           Sum  of Sumarray Ranges

// Related Problem: Sum of Subarray Ranges
// https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/Stack/5_ADVANCED%20MONOTONIC%20STACK/5_Sum%20%20of%20Sumarray%20Ranges.java


                                             
                                            
/*
========================================================
2104. Sum of Subarray Ranges
========================================================

PROBLEM:
---------
Given an integer array nums, the range of a subarray is defined as:
    range = max(subarray) - min(subarray)

Return the sum of ranges of all subarrays.

--------------------------------------------------------
BRUTE FORCE IDEA (NOT USED):
--------------------------------------------------------
Generate all subarrays → find min & max → sum ranges
Time Complexity: O(n^2) ❌ (Too slow)

--------------------------------------------------------
OPTIMIZED IDEA (KEY INSIGHT):
--------------------------------------------------------
Sum of Subarray Ranges
= (Sum of all subarray maximums)
- (Sum of all subarray minimums)

So we solve two problems:
1) Sum of Subarray Maximums
2) Sum of Subarray Minimums

Both can be solved using MONOTONIC STACKS in O(n).

--------------------------------------------------------
EXAMPLE WALKTHROUGH:
--------------------------------------------------------
nums = [1, 2, 3]

All Subarrays:
--------------------------------------------------------
Subarray      Min   Max   Range
[1]           1     1      0
[2]           2     2      0
[3]           3     3      0
[1,2]         1     2      1
[2,3]         2     3      1
[1,2,3]       1     3      2
--------------------------------------------------------
Total Range Sum = 0 + 0 + 0 + 1 + 1 + 2 = 4

--------------------------------------------------------
USING FORMULA:
--------------------------------------------------------
Sum of subarray maximums = 14
Sum of subarray minimums = 10

Answer = 14 - 10 = 4 ✅

--------------------------------------------------------
HOW MONOTONIC STACK HELPS:
--------------------------------------------------------
Each element nums[i] contributes as:
- minimum in (leftMin[i] * rightMin[i]) subarrays
- maximum in (leftMax[i] * rightMax[i]) subarrays

Contribution formulas:
Minimum contribution = nums[i] * leftMin[i] * rightMin[i]
Maximum contribution = nums[i] * leftMax[i] * rightMax[i]

--------------------------------------------------------
STACK CONDITIONS:
--------------------------------------------------------
For MINIMUM:
Left  → >=
Right → >

For MAXIMUM:
Left  → <=
Right → <

These conditions prevent DOUBLE COUNTING.

--------------------------------------------------------
TIME & SPACE COMPLEXITY:
--------------------------------------------------------
Time  : O(n)
Space : O(n)

========================================================
*/

class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;

        // Sum of maximums - Sum of minimums
        long sumMax = getSum(nums, false);
        long sumMin = getSum(nums, true);

        return sumMax - sumMin;
    }

    // Helper method to calculate sum of subarray minimums or maximums
    private long getSum(int[] arr, boolean isMin) {
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        java.util.Stack<Integer> stack = new java.util.Stack<>();

        // LEFT PASS
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() &&
                  (isMin ? arr[stack.peek()] >= arr[i]
                         : arr[stack.peek()] <= arr[i])) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        stack.clear();

        // RIGHT PASS
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() &&
                  (isMin ? arr[stack.peek()] > arr[i]
                         : arr[stack.peek()] < arr[i])) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n - i : stack.peek() - i;
            stack.push(i);
        }

        // CALCULATE TOTAL SUM
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (long) arr[i] * left[i] * right[i];
        }

        return sum;
    }
}
