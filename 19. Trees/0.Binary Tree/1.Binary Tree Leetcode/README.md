# Binary Tree LeetCode

This section covers Binary Tree problems organized by common interview patterns. Instead of solving problems randomly, focus on mastering one pattern at a time. Most Binary Tree interview questions are variations of DFS, BFS, recursion, tree comparison, tree modification, path-related problems, Lowest Common Ancestor, serialization, and advanced tree traversals.

## Prerequisites

Before starting these problems, you should be comfortable with:

- Binary Tree Basics
- Tree Node Structure
- Recursion
- DFS Traversals
- BFS Traversals
- Queue and Stack
- Time and Space Complexity Analysis

---

# Learning Roadmap

## 1. Traversal Model

Master the fundamental ways to traverse a tree.

### 1.1 DFS Traversal

| No. | LC No. | Question Name | Difficulty | LeetCode | GitHub |
|:---:|:---:|---|:---:|:---:|:---:|
| 01 | 94 | Binary Tree Inorder Traversal | Easy | [LeetCode](https://leetcode.com/problems/binary-tree-inorder-traversal/) | [GitHub](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/19.%20Trees/0.Binary%20Tree/1.Binary%20Tree%20Leetcode/1.%20Traversal%20Model/1.DFS%20Traversal/01.%20BinaryTree%20Inorder%20Traversal.md) |
| 02 | 144 | Binary Tree Preorder Traversal | Easy | [LeetCode](https://leetcode.com/problems/binary-tree-preorder-traversal/) | [GitHub](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/19.%20Trees/0.Binary%20Tree/1.Binary%20Tree%20Leetcode/1.%20Traversal%20Model/1.DFS%20Traversal/02.Binary%20Tree%20Preorder%20Traversal%20.md) |
| 03 | 145 | Binary Tree Postorder Traversal | Easy | [LeetCode](https://leetcode.com/problems/binary-tree-postorder-traversal/) | [GitHub](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/19.%20Trees/0.Binary%20Tree/1.Binary%20Tree%20Leetcode/1.%20Traversal%20Model/1.DFS%20Traversal/03.Binary%20Tree%20Postorder%20Traversal.md) |

### 1.2 BFS Traversal

| No. | LC No. | Question Name | Difficulty | LeetCode | GitHub |
|:---:|:---:|---|:---:|:---:|:---:|
| 01 | 102 | Binary Tree Level Order Traversal | Medium | [LeetCode](https://leetcode.com/problems/binary-tree-level-order-traversal/) | [GitHub](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/19.%20Trees/0.Binary%20Tree/1.Binary%20Tree%20Leetcode/1.%20Traversal%20Model/2.BFS%20Traversal/01.Binary%20Tree%20Level%20Order%20Traversal.md) |
| 02 | 637 | Average of Levels in Binary Tree | Easy | [LeetCode](https://leetcode.com/problems/average-of-levels-in-binary-tree/) | [GitHub](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/19.%20Trees/0.Binary%20Tree/1.Binary%20Tree%20Leetcode/1.%20Traversal%20Model/2.BFS%20Traversal/02.Average%20of%20Levels%20in%20Binary%20Tree%20.md) |
| 03 | 111 | Minimum Depth of Binary Tree | Easy | [LeetCode](https://leetcode.com/problems/minimum-depth-of-binary-tree/) | [GitHub](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/19.%20Trees/0.Binary%20Tree/1.Binary%20Tree%20Leetcode/1.%20Traversal%20Model/2.BFS%20Traversal/03.Minimum%20Depth%20of%20Binary%20Tree.md) |
| 04 | 107 | Binary Tree Level Order Traversal II | Medium | [LeetCode](https://leetcode.com/problems/binary-tree-level-order-traversal-ii/) | [GitHub](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/19.%20Trees/0.Binary%20Tree/1.Binary%20Tree%20Leetcode/1.%20Traversal%20Model/2.BFS%20Traversal/04.Binary%20Tree%20Level%20Order%20Traversal%20II.md) |

---

## 2. Recursive Pattern Model

Learn how recursive DFS solves height, depth, and structural problems.

| No. | LC No. | Question Name | Difficulty | LeetCode | GitHub |
|:---:|:---:|---|:---:|:---:|:---:|
| 01 | 104 | Maximum Depth of Binary Tree | Easy | [LeetCode](https://leetcode.com/problems/maximum-depth-of-binary-tree/) | [GitHub](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/19.%20Trees/0.Binary%20Tree/1.Binary%20Tree%20Leetcode/2.%20Recursive%20Pattern%20Model/01.Maximum%20Depth%20of%20Binary%20Tree.md) |
| 02 | 110 | Balanced Binary Tree | Easy | [LeetCode](https://leetcode.com/problems/balanced-binary-tree/) | [GitHub](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/19.%20Trees/0.Binary%20Tree/1.Binary%20Tree%20Leetcode/2.%20Recursive%20Pattern%20Model/02.Balanced%20Binary%20Tree.md) |
| 03 | 543 | Diameter of Binary Tree | Easy | [LeetCode](https://leetcode.com/problems/diameter-of-binary-tree/) | [GitHub](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/19.%20Trees/0.Binary%20Tree/1.Binary%20Tree%20Leetcode/2.%20Recursive%20Pattern%20Model/03.Diameter%20of%20Binary%20Tree.md) |
| 04 | 112 | Path Sum | Easy | [LeetCode](https://leetcode.com/problems/path-sum/) | [GitHub](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/19.%20Trees/0.Binary%20Tree/1.Binary%20Tree%20Leetcode/2.%20Recursive%20Pattern%20Model/04.Path%20Sum.md) |
| 05 | 222 | Count Complete Tree Nodes | Easy | [LeetCode](https://leetcode.com/problems/count-complete-tree-nodes/) | [GitHub](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/19.%20Trees/0.Binary%20Tree/1.Binary%20Tree%20Leetcode/2.%20Recursive%20Pattern%20Model/05.%20222.%20Count%20Complete%20Tree%20Nodes.md) |

---

## 3. Tree Comparison Model

Compare two trees or determine structural equivalence.

| No. | LC No. | Question Name | Difficulty | LeetCode | GitHub |
|:---:|:---:|---|:---:|:---:|:---:|
| 01 | 100 | Same Tree | Easy | [LeetCode](https://leetcode.com/problems/same-tree/) | [GitHub](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/19.%20Trees/0.Binary%20Tree/1.Binary%20Tree%20Leetcode/3.%20Tree%20Comparison%20Model/01.Same%20Tree.md) |
| 02 | 101 | Symmetric Tree | Easy | [LeetCode](https://leetcode.com/problems/symmetric-tree/) | [GitHub](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/19.%20Trees/0.Binary%20Tree/1.Binary%20Tree%20Leetcode/3.%20Tree%20Comparison%20Model/02.Symmetric%20Tree.md) |
| 03 | 572 | Subtree of Another Tree | Easy | [LeetCode](https://leetcode.com/problems/subtree-of-another-tree/) | [GitHub](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/19.%20Trees/0.Binary%20Tree/1.Binary%20Tree%20Leetcode/3.%20Tree%20Comparison%20Model/03.Subtree%20of%20Another%20Tree.md) |
| 04 | 951 | Flip Equivalent Binary Trees | Medium | [LeetCode](https://leetcode.com/problems/flip-equivalent-binary-trees/) | [GitHub](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/19.%20Trees/0.Binary%20Tree/1.Binary%20Tree%20Leetcode/3.%20Tree%20Comparison%20Model/04.Flip%20Equivalent%20Binary%20Trees.md) |
| 05 | 652 | Find Duplicate Subtrees | Medium | [LeetCode](https://leetcode.com/problems/find-duplicate-subtrees/) | [GitHub](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/19.%20Trees/0.Binary%20Tree/1.Binary%20Tree%20Leetcode/3.%20Tree%20Comparison%20Model/05.Find%20Duplicate%20Subtrees.md) |

---

## 4. Tree Modification Model

Modify, restructure, prune, or reconstruct tree structures.

| No. | LC No. | Question Name | Difficulty | LeetCode | GitHub |
|:---:|:---:|---|:---:|:---:|:---:|
| 01 | 226 | Invert Binary Tree | Easy | [LeetCode](https://leetcode.com/problems/invert-binary-tree/) | [GitHub](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/19.%20Trees/0.Binary%20Tree/1.Binary%20Tree%20Leetcode/4.%20Tree%20Modification%20Model/01.Invert%20Binary%20Tree.md) |
| 02 | 814 | Binary Tree Pruning | Medium | [LeetCode](https://leetcode.com/problems/binary-tree-pruning/) | [GitHub](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/19.%20Trees/0.Binary%20Tree/1.Binary%20Tree%20Leetcode/4.%20Tree%20Modification%20Model/02.Binary%20Tree%20Pruning.md) |
| 03 | 623 | Add One Row to Tree | Medium | [LeetCode](https://leetcode.com/problems/add-one-row-to-tree/) | [GitHub](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/19.%20Trees/0.Binary%20Tree/1.Binary%20Tree%20Leetcode/4.%20Tree%20Modification%20Model/03.Add%20One%20Row%20to%20Tree.md) |
| 04 | 114 | Flatten Binary Tree to Linked List | Medium | [LeetCode](https://leetcode.com/problems/flatten-binary-tree-to-linked-list/) | [GitHub](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/19.%20Trees/0.Binary%20Tree/1.Binary%20Tree%20Leetcode/4.%20Tree%20Modification%20Model/04.Flatten%20Binary%20Tree%20to%20Linked%20List.md) |
| 05 | 105 | Construct Binary Tree from Preorder and Inorder Traversal | Medium | [LeetCode](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/) | [GitHub](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/19.%20Trees/0.Binary%20Tree/1.Binary%20Tree%20Leetcode/4.%20Tree%20Modification%20Model/05.Construct%20from%20Preorder%20and%20Inorder.md) |

---

## 5. Path Related Problems

Master root-to-leaf, node-to-node, and path-based DFS patterns.

| No. | LC No. | Question Name | Difficulty | LeetCode | GitHub |
|:---:|:---:|---|:---:|:---:|:---:|
| 01 | 257 | Binary Tree Paths | Easy | [LeetCode](https://leetcode.com/problems/binary-tree-paths/) | [GitHub](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/19.%20Trees/0.Binary%20Tree/1.Binary%20Tree%20Leetcode/5.Path%20Related/01.Binary%20Tree%20Paths.md) |
| 02 | 113 | Path Sum II | Medium | [LeetCode](https://leetcode.com/problems/path-sum-ii/) | [GitHub](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/19.%20Trees/0.Binary%20Tree/1.Binary%20Tree%20Leetcode/5.Path%20Related/02.Path%20Sum%20II.md) |
| 03 | 437 | Path Sum III | Medium | [LeetCode](https://leetcode.com/problems/path-sum-iii/) | [GitHub](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/19.%20Trees/0.Binary%20Tree/1.Binary%20Tree%20Leetcode/5.Path%20Related/03.Path%20Sum%20III.md) |
| 04 | 129 | Sum Root to Leaf Numbers | Medium | [LeetCode](https://leetcode.com/problems/sum-root-to-leaf-numbers/) | [GitHub](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/19.%20Trees/0.Binary%20Tree/1.Binary%20Tree%20Leetcode/5.Path%20Related/04.Sum%20Root%20to%20Leaf%20Numbers.md) |
| 05 | 124 | Binary Tree Maximum Path Sum | Hard | [LeetCode](https://leetcode.com/problems/binary-tree-maximum-path-sum/) | [GitHub](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/19.%20Trees/0.Binary%20Tree/1.Binary%20Tree%20Leetcode/5.Path%20Related/05.Binary%20Tree%20Maximum%20Path%20Sum.md) |
| 06 | 1448 | Count Good Nodes in Binary Tree | Medium | [LeetCode](https://leetcode.com/problems/count-good-nodes-in-binary-tree/) | [GitHub](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/19.%20Trees/0.Binary%20Tree/1.Binary%20Tree%20Leetcode/5.Path%20Related/06.Count%20Good%20Nodes.md) |
| 07 | 968 | Binary Tree Cameras | Hard | [LeetCode](https://leetcode.com/problems/binary-tree-cameras/) | [GitHub](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/19.%20Trees/0.Binary%20Tree/1.Binary%20Tree%20Leetcode/5.Path%20Related/07.Binary%20Tree%20Cameras.md) |

---

## 6. Lowest Common Ancestor

Learn how to find common ancestors, deepest leaves, and directions between tree nodes.

| No. | LC No. | Question Name | Difficulty | LeetCode | GitHub |
|:---:|:---:|---|:---:|:---:|:---:|
| 01 | 236 | Lowest Common Ancestor of a Binary Tree | Medium | [LeetCode](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/) | [GitHub](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/19.%20Trees/0.Binary%20Tree/1.Binary%20Tree%20Leetcode/6.Lowest%20Common%20Ancestor/01.Lowest%20Common%20Ancestor%20of%20Binary%20Tree.md) |
| 02 | 1123 | Lowest Common Ancestor of Deepest Leaves | Medium | [LeetCode](https://leetcode.com/problems/lowest-common-ancestor-of-deepest-leaves/) | [GitHub](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/19.%20Trees/0.Binary%20Tree/1.Binary%20Tree%20Leetcode/6.Lowest%20Common%20Ancestor/02.Lowest%20Common%20Ancestor%20of%20Deepest%20Leaves.md) |
| 03 | 2096 | Step-By-Step Directions From a Binary Tree Node to Another | Medium | [LeetCode](https://leetcode.com/problems/step-by-step-directions-from-a-binary-tree-node-to-another/) | [GitHub](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/19.%20Trees/0.Binary%20Tree/1.Binary%20Tree%20Leetcode/6.Lowest%20Common%20Ancestor/03.Step-By-Step%20Directions.md) |

---

## 7. BFS Variations

Master advanced level-order traversal, tree views, and vertical traversal.

| No. | LC No. | Question Name | Difficulty | LeetCode | GitHub |
|:---:|:---:|---|:---:|:---:|:---:|
| 01 | 199 | Binary Tree Right Side View | Medium | [LeetCode](https://leetcode.com/problems/binary-tree-right-side-view/) | [GitHub](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/19.%20Trees/0.Binary%20Tree/1.Binary%20Tree%20Leetcode/7.BFS%20Variations/01.Binary%20Tree%20Right%20Side%20View.md) |
| 02 | 103 | Binary Tree Zigzag Level Order Traversal | Medium | [LeetCode](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/) | [GitHub](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/19.%20Trees/0.Binary%20Tree/1.Binary%20Tree%20Leetcode/7.BFS%20Variations/02.Binary%20Tree%20Zigzag%20Level%20Order%20Traversal.md) |
| 03 | 515 | Find Largest Value in Each Tree Row | Medium | [LeetCode](https://leetcode.com/problems/find-largest-value-in-each-tree-row/) | [GitHub](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/19.%20Trees/0.Binary%20Tree/1.Binary%20Tree%20Leetcode/7.BFS%20Variations/03.Find%20Largest%20Value%20in%20Each%20Tree%20Row.md) |
| 04 | 513 | Find Bottom Left Tree Value | Medium | [LeetCode](https://leetcode.com/problems/find-bottom-left-tree-value/) | [GitHub](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/19.%20Trees/0.Binary%20Tree/1.Binary%20Tree%20Leetcode/7.BFS%20Variations/04.Find%20Bottom%20Left%20Tree%20Value.md) |
| 05 | 987 | Vertical Order Traversal of a Binary Tree | Hard | [LeetCode](https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/) | [GitHub](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/19.%20Trees/0.Binary%20Tree/1.Binary%20Tree%20Leetcode/7.BFS%20Variations/05.Vertical%20Order%20Traversal.md) |

---

## 8. Serialization

Learn how to convert a binary tree into a string and reconstruct it.

| No. | LC No. | Question Name | Difficulty | LeetCode | GitHub |
|:---:|:---:|---|:---:|:---:|:---:|
| 01 | 297 | Serialize and Deserialize Binary Tree | Hard | [LeetCode](https://leetcode.com/problems/serialize-and-deserialize-binary-tree/) | [GitHub](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/19.%20Trees/0.Binary%20Tree/1.Binary%20Tree%20Leetcode/8.Serialize/01.Serialize%20Deserialize%20Binary%20Tree.md) |

---

## 9. Advanced DFS

Solve complex DFS, tree analysis, indexing, and state-tracking problems.

| No. | LC No. | Question Name | Difficulty | LeetCode | GitHub |
|:---:|:---:|---|:---:|:---:|:---:|
| 01 | 662 | Maximum Width of Binary Tree | Medium | [LeetCode](https://leetcode.com/problems/maximum-width-of-binary-tree/) | [GitHub](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/19.%20Trees/0.Binary%20Tree/1.Binary%20Tree%20Leetcode/9.Advanced%20DFS/01.Maximum%20Width%20of%20Binary%20Tree.md) |
| 02 | 958 | Check Completeness of a Binary Tree | Medium | [LeetCode](https://leetcode.com/problems/check-completeness-of-a-binary-tree/) | [GitHub](https://github.com/Ashikajayakumar/Java-Data-Structure/blob/main/19.%20Trees/0.Binary%20Tree/1.Binary%20Tree%20Leetcode/9.Advanced%20DFS/02.Check%20Completeness%20of%20a%20Binary%20Tree.md) |
| 03 | 1161 | Maximum Level Sum of a Binary Tree | Medium | [LeetCode](https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/) | [GitHub](https://github.com/Ashikaj
