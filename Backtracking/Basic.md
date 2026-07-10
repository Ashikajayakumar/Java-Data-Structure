Backtracking is one of the most important algorithms in DSA. Before solving problems like **N-Queens, Sudoku Solver, Rat in a Maze, Combination Sum, Permutations, Word Search**, you should understand **why backtracking exists**.

---

# Why do we need Backtracking?

Imagine you are trying to unlock a locker.

The password has **4 digits**.

You don't know the password.

One way is:

```
0000
0001
0002
...
9999
```

You try one possibility.

If it is wrong,
go back,
change one digit,
try again.

This process of

* Choose
* Try
* If wrong → Undo
* Try another choice

is called **Backtracking**.

---

# Real-Life Example

Suppose your teacher says

> "Arrange 3 students in a line."

Students are

```
A B C
```

You start

```
A _ _
```

Second position

```
A B _
```

Third position

```
A B C
```

One answer is complete.

Now go back.

Remove C

```
A B _
```

Try another

No student left.

Go back again.

Remove B

```
A _ _
```

Try C

```
A C _
```

Again continue.

This "go back and try another choice" is Backtracking.

---

# Definition

Backtracking is an algorithm that

> **Builds the solution step by step. If the current path cannot produce a valid answer, it undoes the last step and tries another path.**

It is simply

```
Choose
Explore
Undo
Repeat
```

---

# Why do we learn Backtracking in DSA?

Many interview problems ask

* Find all possible answers
* Find every combination
* Find every permutation
* Solve a puzzle
* Search every path

Examples

```
Sudoku Solver

N Queens

Rat in Maze

Word Search

Generate Parentheses

Combination Sum

Permutations

Letter Combinations

Palindrome Partitioning
```

Almost all of them use Backtracking.

---

# Basic Idea

Suppose

```
nums = [1,2]
```

Find every permutation.

Start

```
[]
```

Choose

```
1
```

Now

```
[1]
```

Choose

```
2
```

Now

```
[1,2]
```

Answer found.

Go back.

Remove

```
2
```

Now

```
[1]
```

No choice.

Go back.

Remove

```
1
```

Now

```
[]
```

Choose

```
2
```

Continue.

---

The picture looks like

```
            []
          /    \
         1      2
        /        \
      [1]       [2]
       |          |
       2          1
       |          |
    [1,2]      [2,1]
```

Notice how we **return to previous states** to try different options.

---

# Four Steps of Backtracking

Every backtracking problem follows the same pattern.

### Step 1

Choose

```
Take one option
```

Example

```
Pick number 3
```

---

### Step 2

Explore

Solve remaining problem.

```
Recursive call
```

---

### Step 3

Undo

Remove that choice.

```
Remove 3
```

---

### Step 4

Try next choice

```
Pick 4
```

---

Template

```java
for(each choice){

    choose();

    backtrack();

    undo();
}
```

This simple template solves many problems.

---

# Smallest Example

Print every subset.

Input

```
[1,2]
```

Output

```
[]
[1]
[2]
[1,2]
```

Tree

```
                 []
               /    \
           take1   skip1
            /          \
         [1]            []
        /   \         /    \
 take2 skip2 take2 skip2
```

Every path becomes one answer.

---

# General Backtracking Code

```java
void backtrack() {

    if(answerFound){
        saveAnswer();
        return;
    }

    for(each choice){

        choose();

        backtrack();

        undo();
    }
}
```

Notice the **undo()** step. That is what makes backtracking unique.

---

# Where does DP fail?

Many beginners ask:

> If Dynamic Programming is powerful, why learn Backtracking?

The answer is that they solve **different types of problems**.

### Dynamic Programming

DP is used when

* Problems have **overlapping subproblems**.
* We want the **best answer** (maximum, minimum, count).
* Results can be reused.

Example

```
Fibonacci

Coin Change

House Robber

LIS

Knapsack
```

---

### Backtracking

Backtracking is used when

* We need **all valid solutions**.
* Every choice changes future possibilities.
* We cannot simply reuse previous results because the current path (choices already made) matters.

Example

```
Sudoku

N Queens

Permutations

Combinations

Maze

Word Search
```

---

# Can DP solve Sudoku?

Imagine a Sudoku board.

```
5 3 .
6 . .
. . .
```

If you place

```
7
```

the future possibilities change.

If instead you place

```
9
```

the future changes differently.

The board's state is different each time, so there are too many unique states to reuse effectively. DP doesn't help much here.

Backtracking works naturally:

```
Try 7
↓

Wrong?

↓

Undo

↓

Try 9
```

---

# DP vs Backtracking

| Dynamic Programming                  | Backtracking                                  |
| ------------------------------------ | --------------------------------------------- |
| Finds best answer                    | Finds all valid answers (or searches for one) |
| Reuses previous computations         | Explores choices by trial and error           |
| Uses memoization/tabulation          | Uses recursion + undo                         |
| Avoids recomputation                 | Revisits states after undoing choices         |
| Works with overlapping subproblems   | Works with decision trees                     |
| Examples: LIS, Coin Change, Knapsack | Examples: Sudoku, N-Queens, Permutations      |

---

# Time Complexity

Backtracking is often slower because it explores many possibilities.

Example:

```
n choices

↓

n × (n−1) × (n−2)...

↓

n!
```

Many backtracking problems have exponential (`2^n`) or factorial (`n!`) time complexity.

DP often reduces exponential solutions to polynomial time by storing and reusing results.

