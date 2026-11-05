# Bit Manipulation in Java – Complete Basics

Bit Manipulation is a technique used to solve problems by directly working with the binary representation (0s and 1s) of numbers.

1. Binary number basics
2. Bitwise operators
3. Shift operators
4. Important bit manipulation formulas
5. How to identify which operator to use
6. Basic Java programs

# 1. Binary Number Basics

Computers represent numbers using binary digits:

- `0` – OFF
- `1` – ON

Each binary position represents a power of 2.

Example: Decimal number `13`

| Binary position | 3 | 2 | 1 | 0 |
| --------------- | - | - | - | - |
| Power of 2      | 8 | 4 | 2 | 1 |
| Bit             | 1 | 1 | 0 | 1 |
| Value           | 8 | 4 | 0 | 1 |

Therefore:

``[ 13 = 8+4+0+1 ]``

Binary representation:

```
Decimal: 13
Binary : 1101
```

Other examples:

| Decimal | Binary |
| ------- | ------ |
| 1       | 0001   |
| 2       | 0010   |
| 3       | 0011   |
| 4       | 0100   |
| 5       | 0101   |
| 6       | 0110   |
| 7       | 0111   |
| 8       | 1000   |
| 10      | 1010   |
| 15      | 1111   |

Java conversion:

```
int n = 13;

System.out.println(Integer.toBinaryString(n));
```

Output:

```
1101
```

# 2. Bitwise Operators in Java

Java has six important bitwise and shift operators.

\| Operator | Name | Purpose |\
\|---|---|---|\
\| `&` | AND | Both bits must be 1 |\
\| `|` | OR | At least one bit must be 1 |\
\| `^` | XOR | Bits must be different |\
\| `~` | NOT | Flips all bits |\
\| `<<` | Left Shift | Shifts bits left |\
\| `>>` | Signed Right Shift | Shifts bits right, preserving sign |\
\| `>>>` | Unsigned Right Shift | Shifts bits right, filling with 0 |

Let's understand each one.

## 2.1 AND (`&`)

Rule: Both bits must be 1 to get 1.

| A | B | A & B |
| - | - | ----- |
| 0 | 0 | 0     |
| 0 | 1 | 0     |
| 1 | 0 | 0     |
| 1 | 1 | 1     |

Example:

```
    5 = 0101
    3 = 0011
        ----
  5 & 3 = 0001
```

Output: `1`

Java:

```
int a = 5;
int b = 3;

System.out.println(a & b);
```

When to use AND?

- Check whether a bit is set.
- Count the number of set bits.
- Check whether a number is even or odd.
- Remove the last set bit.

Important:

```
n & 1
```

- Result `1` → Odd number.
- Result `0` → Even number.

## 2.2 OR (`|`)

Rule: If at least one bit is 1, the result is 1.

| A | B | A \| B |
| - | - | ------ |
| 0 | 0 | 0      |
| 0 | 1 | 1      |
| 1 | 0 | 1      |
| 1 | 1 | 1      |

Example:

```
    5 = 0101
    3 = 0011
        ----
  5 | 3 = 0111
```

Output: `7`

Java:

``` 
System.out.println(5 | 3);
```

When to use OR?

- Set a particular bit to 1.
- Combine bit patterns.
- Build a result bit by bit.

## 2.3 XOR (`^`)

Rule: If both bits are different, result is 1. If they are the same, result is 0.

| A | B | A ^ B |
| - | - | ----- |
| 0 | 0 | 0     |
| 0 | 1 | 1     |
| 1 | 0 | 1     |
| 1 | 1 | 0     |

Example:

```
    5 = 0101
    3 = 0011
        ----
  5 ^ 3 = 0110
```

Output: `6`

Java:

```
System.out.println(5 ^ 3);
```

Most important XOR properties:

| Formula         | Result               |
| --------------- | -------------------- |
| `a ^ a`         | `0`                  |
| `a ^ 0`         | `a`                  |
| `a ^ b ^ a`     | `b`                  |
| `a ^ b = b ^ a` | Order doesn't matter |

Example:

```
2 ^ 3 ^ 2

= 010 ^ 011 ^ 010
= 011
= 3
```

The repeated `2` cancels out.

When to use XOR?

- Find the missing number.
- Find the single number.
- Find two numbers that appear only once.
- Calculate Hamming distance.
- Swap values using XOR (mainly a concept, not recommended in normal Java code).

## 2.4 NOT (`~`)

Rule: Flip every bit.

```
0 becomes 1
1 becomes 0
```

Example using 8-bit representation:

```
 5 = 00000101
~5 = 11111010
```

Java:

```
System.out.println(~5);
```

Output:

```
-6
```

Why -6?

Java `int` uses 32-bit signed two's-complement representation.

Important formula:

\\[ \sim n = -(n+1) \\]

Example:

```
~5 = -(5 + 1)
   = -6
```

## 2.5 Summary of Bitwise Operators

| Operator | Example   | Output |
| -------- | --------- | ------ |
| AND      | `5 & 3`   | 1      |
| OR       | `5 \\| 3` | 7      |
| XOR      | `5 ^ 3`   | 6      |
| NOT      | `~5`      | -6     |

# 3. Shift Operators in Java

Shift operators move bits to the left or right.

This is especially important for bit manipulation interview questions.

## 3.1 Left Shift (`<<`)

Moves bits towards the left.

Example:

```
int n = 5;

System.out.println(n << 1);
```

Visualization:

```
5 = 00000101

5 << 1

   00000101
      ↓
   00001010

Result = 10
```

Each left shift by one position multiplies the number by 2, provided the result does not overflow.

| Expression | Result |
| ---------- | ------ |
| `5 << 1`   | 10     |
| `5 << 2`   | 20     |
| `5 << 3`   | 40     |
| `3 << 1`   | 6      |
| `3 << 2`   | 12     |

Formula:

\\[ n << k = n \times 2^k \\]

## 3.2 Signed Right Shift (`>>`)

Moves bits towards the right and preserves the sign bit.

Example:

```
int n = 20;

System.out.println(n >> 1);
```

Visualization:

```
20 = 00010100

20 >> 1

     00010100
        ↓
     00001010

Result = 10
```

Each right shift by one position is equivalent to floor division by 2 for non-negative integers.

| Expression | Result |
| ---------- | ------ |
| `20 >> 1`  | 10     |
| `20 >> 2`  | 5      |
| `20 >> 3`  | 2      |
| `16 >> 1`  | 8      |
| `16 >> 2`  | 4      |

Formula for non-negative values:

\\[ n >> k = \lfloor n / 2^k \rfloor \\]

## 3.3 Unsigned Right Shift (`>>>`)

Moves bits right and fills the empty left positions with `0`.

Example:

```
int n = -8;

System.out.println(n >> 1);
System.out.println(n >>> 1);
```

Output:

```
-4
2147483644
```

Difference:

| Operator | What happens?                    |
| -------- | -------------------------------- |
| `>>`     | Preserves the sign bit           |
| `>>>`    | Fills left-side positions with 0 |

Interview tip: For reversing bits in a Java `int`, `>>>` is important because it shifts in zeros even when the number is negative.

# 4. Important Bit Manipulation Formulas

These are the formulas you should memorize before solving LeetCode and Infosys coding questions.

| Purpose                               | Formula                       |
| ------------------------------------- | ----------------------------- |
| Check odd                             | `(n & 1) == 1`                |
| Check even                            | `(n & 1) == 0`                |
| Check whether bit `i` is set          | `(n & (1 << i)) != 0`         |
| Set bit `i`                           | `n \\| (1 << i)`              |
| Clear bit `i`                         | `n & ~(1 << i)`               |
| Toggle bit `i`                        | `n ^ (1 << i)`                |
| Remove rightmost set bit              | `n & (n - 1)`                 |
| Get rightmost set bit                 | `n & -n`                      |
| Check power of 2                      | `n > 0 && (n & (n - 1)) == 0` |
| Multiply by \\(2^k\\)                 | `n << k`                      |
| Divide by \\(2^k\\), non-negative `n` | `n >> k`                      |

## Understand bit position operations

Suppose:

```
n = 10

Binary = 1010
```

Bit positions are counted from right to left, starting at zero.

```
Position:  3  2  1  0
Binary:    1  0  1  0
```

A. Check whether bit 1 is set

```
(n & (1 << 1)) != 0
```

```
n       = 1010
1 << 1  = 0010
          ----
AND     = 0010
```

Result: `true`

B. Set bit 0

```
n = n | (1 << 0);
```

```
1010
0001
----
1011
```

Result: `11`

C. Clear bit 1

```
n = n & ~(1 << 1);
```

```
n           = 1010
1 << 1      = 0010
~(1 << 1)   = ...1101
```

The bit at position 1 becomes zero.

Result: `1000` = `8`

D. Toggle bit 0

```
n = n ^ (1 << 0);
```

```
1010
0001
----
1011
```

Result: `11`

# 5. Most Important Trick – Remove the Rightmost Set Bit

Formula:

```
n = n & (n - 1);
```

A set bit means a bit with value `1`.

Example:

```
n     = 12 = 1100
n - 1 = 11 = 1011

1100
1011
----
1000
```

The rightmost `1` is removed.

| Iteration        | Binary | Decimal |
| ---------------- | ------ | ------- |
| Initial          | 1100   | 12      |
| First operation  | 1000   | 8       |
| Second operation | 0000   | 0       |

This is the foundation of Brian Kernighan's algorithm, which counts the number of set bits.

Java:

```
int n = 12;
int count = 0;

while (n != 0) {
    n = n & (n - 1);
    count++;
}

System.out.println(count);
```

Output:

```
2
```

# 6. Java Bit Manipulation Basics – Practice Programs

Try these programs before moving to LeetCode.

Program 1 – Convert decimal to binary

```
public class Main {
    public static void main(String[] args) {
        int n = 13;

        System.out.println(Integer.toBinaryString(n));
    }
}
```

Program 2 – Check even or odd using AND

```
public class Main {
    public static void main(String[] args) {
        int n = 7;

        if ((n & 1) == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }
}
```

Program 3 – Count set bits

```
public class Main {
    public static void main(String[] args) {
        int n = 13;
        int count = 0;

        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }

            n = n >> 1;
        }

        System.out.println(count);
    }
}
```

Output: `3`

Program 4 – Check power of 2

```
public class Main {
    public static void main(String[] args) {
        int n = 16;

        if (n > 0 && (n & (n - 1)) == 0) {
            System.out.println("Power of 2");
        } else {
            System.out.println("Not a power of 2");
        }
    }
}
```

Output: `Power of 2`

# 7. How to Identify the Operator in Coding Questions

| If the question asks...      | Think about...        |
| ---------------------------- | --------------------- |
| Find a number appearing once | XOR `^`               |
| Find missing number          | XOR `^`               |
| Count 1s in binary           | AND `&`, `n & (n-1)`  |
| Check even or odd            | AND `&`               |
| Check power of 2             | AND `&`               |
| Reverse binary bits          | `<<`, `>>>`, OR `\\|` |
| Find differing bits          | XOR `^`               |
| Set a particular bit         | OR `\\|`              |
| Clear a particular bit       | AND `&`, NOT `~`      |
| Toggle a particular bit      | XOR `^`               |
| Multiply by powers of 2      | `<<`                  |
| Divide by powers of 2        | `>>`                  |



