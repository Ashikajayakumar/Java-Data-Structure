# 🟢 Greedy Algorithm – LeetCode Problems

This section contains **39 Greedy Algorithm problems** solved using Java, organized into 6 categories based on common greedy patterns and problem-solving techniques.

## 📚 Problem Categories

| No. | Category | Questions |
|:---:|---|:---:|
| 01 | [Basic Greedy – Sorting & Selection](#1-basic-greedy--sorting--selection) | 6 |
| 02 | [Greedy – Array & Local Decisions](#2-greedy--array--local-decisions) | 8 |
| 03 | [Greedy – Interval Scheduling & Merging](#3-greedy--interval-scheduling--merging) | 8 |
| 04 | [Greedy – Jump & Reachability](#4-greedy--jump--reachability) | 4 |
| 05 | [Greedy – Resource & Frequency Management](#5-greedy--resource--frequency-management) | 7 |
| 06 | [Greedy – Advanced Patterns](#6-greedy--advanced-patterns) | 6 |
| | **Total** | **39** |

---

## 1. Basic Greedy – Sorting & Selection

**Focus:** Sorting, pairing, selection, and maximizing or minimizing values using local optimal choices.

| No. | LC No. | Question Name (GitHub) | Difficulty | LeetCode |
|:---:|:---:|---|:---:|:---:|
| 01 | 455 | [Assign Cookies](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/18.Greedy/01.%20Basic%20Greedy%20%E2%80%93%20Sorting%20%26%20Selection/01.Assign%20Cookies.md) | Easy | [Link](https://leetcode.com/problems/assign-cookies/) |
| 02 | 561 | [Array Partition](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/18.Greedy/01.%20Basic%20Greedy%20%E2%80%93%20Sorting%20%26%20Selection/02.Array%20Partition.md) | Easy | [Link](https://leetcode.com/problems/array-partition/) |
| 03 | 976 | [Largest Perimeter Triangle](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/18.Greedy/01.%20Basic%20Greedy%20%E2%80%93%20Sorting%20%26%20Selection/03.Largest%20Perimeter%20Triangle.md) | Easy | [Link](https://leetcode.com/problems/largest-perimeter-triangle/) |
| 04 | 1710 | [Maximum Units on a Truck](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/18.Greedy/01.%20Basic%20Greedy%20%E2%80%93%20Sorting%20%26%20Selection/04.Maximum%20Units%20on%20a%20Truck.md) | Easy | [Link](https://leetcode.com/problems/maximum-units-on-a-truck/) |
| 05 | 1029 | [Two City Scheduling](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/18.Greedy/01.%20Basic%20Greedy%20%E2%80%93%20Sorting%20%26%20Selection/05.Two%20City%20Scheduling.md) | Medium | [Link](https://leetcode.com/problems/two-city-scheduling/) |
| 06 | 1217 | [Minimum Cost to Move Chips to The Same Position](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/18.Greedy/01.%20Basic%20Greedy%20%E2%80%93%20Sorting%20%26%20Selection/06.%20Minimum%20Cost%20to%20Move%20Chips%20to%20The%20Same%20Position.md) | Easy | [Link](https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/) |

## 2. Greedy – Array & Local Decisions

**Focus:** Array traversal, local optimization, Kadane's algorithm, and digit manipulation.

| No. | LC No. | Question Name (GitHub) | Difficulty | LeetCode |
|:---:|:---:|---|:---:|:---:|
| 01 | 122 | [Best Time to Buy and Sell Stock II](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/18.Greedy/02.%20Greedy%20%E2%80%93%20Array%20%26%20Local%20Decisions/01.Best%20Time%20to%20Buy%20and%20Sell%20Stock%20II.md) | Medium | [Link](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/) |
| 02 | 1005 | [Maximize Sum of Array After K Negations](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/18.Greedy/02.%20Greedy%20%E2%80%93%20Array%20%26%20Local%20Decisions/02.Maximize%20Sum%20of%20Array%20After%20K%20Negations.md) | Easy | [Link](https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/) |
| 03 | 605 | [Can Place Flowers](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/18.Greedy/02.%20Greedy%20%E2%80%93%20Array%20%26%20Local%20Decisions/03.Can%20Place%20Flowers.md) | Easy | [Link](https://leetcode.com/problems/can-place-flowers/) |
| 04 | 1221 | [Split a String in Balanced Strings](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/18.Greedy/02.%20Greedy%20%E2%80%93%20Array%20%26%20Local%20Decisions/04.Split%20a%20String%20in%20Balanced%20Strings.md) | Easy | [Link](https://leetcode.com/problems/split-a-string-in-balanced-strings/) |
| 05 | 53 | [Maximum Subarray](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/18.Greedy/02.%20Greedy%20%E2%80%93%20Array%20%26%20Local%20Decisions/05.Maximum%20Subarray.md) | Medium | [Link](https://leetcode.com/problems/maximum-subarray/) |
| 06 | 376 | [Wiggle Subsequence](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/18.Greedy/02.%20Greedy%20%E2%80%93%20Array%20%26%20Local%20Decisions/06.Wiggle%20Subsequence.md) | Medium | [Link](https://leetcode.com/problems/wiggle-subsequence/) |
| 07 | 670 | [Maximum Swap](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/18.Greedy/02.%20Greedy%20%E2%80%93%20Array%20%26%20Local%20Decisions/07.Maximum%20Swap.md) | Medium | [Link](https://leetcode.com/problems/maximum-swap/) |
| 08 | 738 | [Monotone Increasing Digits](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/18.Greedy/02.%20Greedy%20%E2%80%93%20Array%20%26%20Local%20Decisions/08.Monotone%20Increasing%20Digits.md) | Medium | [Link](https://leetcode.com/problems/monotone-increasing-digits/) |
| 09 | 2375 | [DI String](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/18.Greedy/02.%20Greedy%20%E2%80%93%20Array%20%26%20Local%20Decisions/09.DI%20String.md) | Medium | [LeetCode](https://leetcode.com/problems/construct-smallest-number-from-di-string/) |

## 3. Greedy – Interval Scheduling & Merging

**Focus:** Interval sorting, merging, overlap detection, and greedy range coverage.

| No. | LC No. | Question Name (GitHub) | Difficulty | LeetCode |
|:---:|:---:|---|:---:|:---:|
| 01 | 435 | [Non-overlapping Intervals](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/18.Greedy/03.%20Greedy%20%E2%80%93%20Interval%20Scheduling%20%26%20Merging/01.Non-overlapping%20Intervals.md) | Medium | [Link](https://leetcode.com/problems/non-overlapping-intervals/) |
| 02 | 452 | [Minimum Number of Arrows to Burst Balloons](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/18.Greedy/03.%20Greedy%20%E2%80%93%20Interval%20Scheduling%20%26%20Merging/02.Minimum%20Number%20of%20Arrows%20to%20Burst%20Balloons.md) | Medium | [Link](https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/) |
| 03 | 56 | [Merge Intervals](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/18.Greedy/03.%20Greedy%20%E2%80%93%20Interval%20Scheduling%20%26%20Merging/03.Merge%20Intervals.md) | Medium | [Link](https://leetcode.com/problems/merge-intervals/) |
| 04 | 57 | [Insert Interval](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/18.Greedy/03.%20Greedy%20%E2%80%93%20Interval%20Scheduling%20%26%20Merging/04.Insert%20Interval.md) | Medium | [Link](https://leetcode.com/problems/insert-interval/) |
| 05 | 763 | [Partition Labels](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/18.Greedy/03.%20Greedy%20%E2%80%93%20Interval%20Scheduling%20%26%20Merging/05.Partition%20Labels.md) | Medium | [Link](https://leetcode.com/problems/partition-labels/) |
| 06 | 1024 | [Video Stitching](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/18.Greedy/03.%20Greedy%20%E2%80%93%20Interval%20Scheduling%20%26%20Merging/06.Video%20Stitching.md) | Medium | [Link](https://leetcode.com/problems/video-stitching/) |
| 07 | 1326 | [Minimum Number of Taps to Open to Water a Garden](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/18.Greedy/03.%20Greedy%20%E2%80%93%20Interval%20Scheduling%20%26%20Merging/07.Minimum%20Number%20of%20Taps%20to%20Open%20to%20Water%20a%20Garden.md) | Hard | [Link](https://leetcode.com/problems/minimum-number-of-taps-to-open-to-water-a-garden/) |
| 08 | 1520 | [Maximum Number of Non-Overlapping Substrings](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/18.Greedy/03.%20Greedy%20%E2%80%93%20Interval%20Scheduling%20%26%20Merging/08.Maximum%20Number%20of%20Non-Overlapping%20Substrings.md) | Hard | [Link](https://leetcode.com/problems/maximum-number-of-non-overlapping-substrings/) |

## 4. Greedy – Jump & Reachability

**Focus:** Reachability, minimum jumps, backward greedy, and resource optimization.

| No. | LC No. | Question Name (GitHub) | Difficulty | LeetCode |
|:---:|:---:|---|:---:|:---:|
| 01 | 55 | [Jump Game](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/18.Greedy/04.%20Greedy%20%E2%80%93%20Jump%20%26%20Reachability/01.Jump%20Game.md) | Medium | [Link](https://leetcode.com/problems/jump-game/) |
| 02 | 45 | [Jump Game II](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/18.Greedy/04.%20Greedy%20%E2%80%93%20Jump%20%26%20Reachability/02.Jump%20Game%20II.md) | Medium | [Link](https://leetcode.com/problems/jump-game-ii/) |
| 03 | 991 | [Broken Calculator](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/18.Greedy/04.%20Greedy%20%E2%80%93%20Jump%20%26%20Reachability/03.Broken%20Calculator.md) | Medium | [Link](https://leetcode.com/problems/broken-calculator/) |
| 04 | 1642 | [Furthest Building You Can Reach](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/18.Greedy/04.%20Greedy%20%E2%80%93%20Jump%20%26%20Reachability/04.Furthest%20Building%20You%20Can%20Reach.md) | Medium | [Link](https://leetcode.com/problems/furthest-building-you-can-reach/) |

## 5. Greedy – Resource & Frequency Management

**Focus:** Resource allocation, frequency counting, priority queues, and optimal scheduling.

| No. | LC No. | Question Name (GitHub) | Difficulty | LeetCode |
|:---:|:---:|---|:---:|:---:|
| 01 | 860 | [Lemonade Change](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/18.Greedy/05.%20Greedy%20%E2%80%93%20Resource%20%26%20Frequency%20Management/01.Lemonade%20Change.md) | Easy | [Link](https://leetcode.com/problems/lemonade-change/) |
| 02 | 134 | [Gas Station](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/18.Greedy/05.%20Greedy%20%E2%80%93%20Resource%20%26%20Frequency%20Management/02.Gas%20Station.md) | Medium | [Link](https://leetcode.com/problems/gas-station/) |
| 03 | 621 | [Task Scheduler](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/18.Greedy/05.%20Greedy%20%E2%80%93%20Resource%20%26%20Frequency%20Management/03.Task%20Scheduler.md) | Medium | [Link](https://leetcode.com/problems/task-scheduler/) |
| 04 | 135 | [Candy](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/18.Greedy/05.%20Greedy%20%E2%80%93%20Resource%20%26%20Frequency%20Management/04.Candy.md) | Hard | [Link](https://leetcode.com/problems/candy/) |
| 05 | 1665 | [Minimum Initial Energy to Finish Tasks](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/18.Greedy/05.%20Greedy%20%E2%80%93%20Resource%20%26%20Frequency%20Management/05.Minimum%20Initial%20Energy%20to%20Finish%20Tasks.md) | Hard | [Link](https://leetcode.com/problems/minimum-initial-energy-to-finish-tasks/) |
| 06 | 2136 | [Earliest Possible Day of Full Bloom](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/18.Greedy/05.%20Greedy%20%E2%80%93%20Resource%20%26%20Frequency%20Management/06.Earliest%20Possible%20Day%20of%20Full%20Bloom.md) | Hard | [Link](https://leetcode.com/problems/earliest-possible-day-of-full-bloom/) |
| 07 | 1353 | [Maximum Number of Events That Can Be Attended](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/18.Greedy/05.%20Greedy%20%E2%80%93%20Resource%20%26%20Frequency%20Management/07.Maximum%20Number%20of%20Events%20That%20Can%20Be%20Attended.md) | Hard | [Link](https://leetcode.com/problems/maximum-number-of-events-that-can-be-attended/) |

## 6. Greedy – Advanced Patterns

**Focus:** Advanced sorting, custom ordering, monotonic stacks, subsequence construction, and reverse simulation.

| No. | LC No. | Question Name (GitHub) | Difficulty | LeetCode |
|:---:|:---:|---|:---:|:---:|
| 01 | 406 | [Queue Reconstruction by Height](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/18.Greedy/06.%20Greedy%20%E2%80%93%20Advanced%20Patterns/01.Queue%20Reconstruction%20by%20Height.md) | Medium | [Link](https://leetcode.com/problems/queue-reconstruction-by-height/) |
| 02 | 1094 | [Car Pooling](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/18.Greedy/06.%20Greedy%20%E2%80%93%20Advanced%20Patterns/02.Car%20Pooling.md) | Medium | [Link](https://leetcode.com/problems/car-pooling/) |
| 03 | 330 | [Patching Array](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/18.Greedy/06.%20Greedy%20%E2%80%93%20Advanced%20Patterns/03.Patching%20Array.md) | Hard | [Link](https://leetcode.com/problems/patching-array/) |
| 04 | 321 | [Create Maximum Number](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/18.Greedy/06.%20Greedy%20%E2%80%93%20Advanced%20Patterns/04.Create%20Maximum%20Number.md) | Hard | [Link](https://leetcode.com/problems/create-maximum-number/) |
| 05 | 659 | [Split Array into Consecutive Subsequences](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/18.Greedy/06.%20Greedy%20%E2%80%93%20Advanced%20Patterns/05.Split%20Array%20into%20Consecutive%20Subsequences.md) | Medium | [Link](https://leetcode.com/problems/split-array-into-consecutive-subsequences/) |
| 06 | 936 | [Stamping the Sequence](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/18.Greedy/06.%20Greedy%20%E2%80%93%20Advanced%20Patterns/06.Stamping%20the%20Sequence.md) | Hard | [Link](https://leetcode.com/problems/stamping-the-sequence/) |

---

## 🧠 Important Greedy Patterns

| Pattern | Key Idea |
|---|---|
| Sorting + Greedy Selection | Sort elements to make the best local choice |
| Two Pointers | Process two sorted sequences efficiently |
| Local Optimization | Choose the best immediate decision |
| Kadane's Algorithm | Track the best contiguous subarray sum |
| Interval Scheduling | Sort by end time and select compatible intervals |
| Interval Merging | Combine overlapping ranges |
| Greedy Range Expansion | Extend the farthest reachable boundary |
| Resource Allocation | Use limited resources where they provide maximum benefit |
| Frequency + Priority Queue | Select tasks or values based on frequency |
| Difference Array | Track changes over a range efficiently |
| Monotonic Stack | Maintain an optimal subsequence |
| Reverse Greedy | Work backward from the target state |

## 📊 Overall Progress

| Metric | Count |
|---|:---:|
| Total Categories | 6 |
| Total LeetCode Questions | 39 |
| Programming Language | Java |
| Main Technique | Greedy Algorithm |

---

**Repository:** Java-Data-Structure

**Topic:** Greedy Algorithm

**Language:** Java
