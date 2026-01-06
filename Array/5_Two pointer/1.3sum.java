                                                              3Sum

Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 

Example 1:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.


  import java.util.*;

class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        // Count frequency of each number
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums)
            count.put(num, count.getOrDefault(num, 0) + 1);

        List<Integer> negatives = new ArrayList<>();
        List<Integer> positives = new ArrayList<>();
        int zeros = count.getOrDefault(0, 0);

        // Separate negatives and positives
        for (int num : count.keySet()) {
            if (num < 0) negatives.add(num);
            else if (num > 0) positives.add(num);
        }

        Set<List<Integer>> res = new HashSet<>();

        // Case 1: (0, n, -n)
        if (zeros > 0) {
            for (int n : negatives) {
                if (count.containsKey(-n)) {
                    res.add(Arrays.asList(n, 0, -n));
                }
            }
        }

        // Case 2: (0, 0, 0)
        if (zeros >= 3) {
            res.add(Arrays.asList(0, 0, 0));
        }

        // Case 3: (neg, neg, pos)
        for (int i = 0; i < negatives.size(); i++) {
            for (int j = i; j < negatives.size(); j++) {
                int a = negatives.get(i);
                int b = negatives.get(j);
                int c = -(a + b);

                if (c > 0 && count.containsKey(c)) {
                    if (a != b || count.get(a) > 1) {
                        res.add(Arrays.asList(a, b, c));
                    }
                }
            }
        }

        // Case 4: (pos, pos, neg)
        for (int i = 0; i < positives.size(); i++) {
            for (int j = i; j < positives.size(); j++) {
                int a = positives.get(i);
                int b = positives.get(j);
                int c = -(a + b);

                if (c < 0 && count.containsKey(c)) {
                    if (a != b || count.get(a) > 1) {
                        res.add(Arrays.asList(c, a, b));
                    }
                }
            }
        }

        return new ArrayList<>(res);
    }
}
