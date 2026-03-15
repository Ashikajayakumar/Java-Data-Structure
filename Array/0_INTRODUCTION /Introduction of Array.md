<h1 align="center"><b> ARRAYS IN JAVA  </b></h1>

<h2 align="center"><b> What is an Array ? </b></h2>

* An array in Java is a collection of <b>same type of elements</b> stored in <b>contiguous memory locations</b>.
* Used to store multiple values using a single variable.
* Elements are accessed using <b>index</b>.
* Array size is <b>fixed</b> once created.
---

<h2 align="center"><b> 🔹 Key Features of Arrays </b></h2>

* Fixed size
* Same data type
* Index starts from <b>0</b>
* Stored in contiguous memory
* Fast access using index
* Can store primitive or object types

---

<h2 align="center"><b> 🔹 Array Declaration in Java </b></h2>

<h4 align="center"><b> 📌 Syntax </b></h4>

```
dataType[] arrayName;
```

<h4 align="center"><b> Example </b></h4>

```
int[] A = {10, 20, 30, 40, 50};
```

---

<h2 align="center"><b> 🔹 Memory Representation </b></h2>

<h4 align="center"><b> Address Formula </b></h4>

```
Address of A[i] = Base Address + (i × Size of Element)
```

<h4><b> Assume </b></h4>

* Base Address = 1000
* Size of int = 4 bytes

| Index | Value | Memory Address |
| ----- | ----- | -------------- |
| 0     | 10    | 1000           |
| 1     | 20    | 1004           |
| 2     | 30    | 1008           |
| 3     | 40    | 1012           |
| 4     | 50    | 1016           |

---

<h2 align="center"><b> 🔹 Types of Arrays in Java </b></h2>

<h3 align="center"><b> ✅ 1. One-Dimensional Array </b></h3>

```
int[] arr = {10, 20, 30, 40, 50};
System.out.println(arr[2]);
```

| Index | 0  | 1  | 2  | 3  | 4  |
| ----- | -- | -- | -- | -- | -- |
| Value | 10 | 20 | 30 | 40 | 50 |

---

<h3 align="center"><b> ✅ 2. Two-Dimensional Array </b></h3>

```
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6}
};

System.out.println(matrix[1][2]);
```

| Row\Col | 0 | 1 | 2 |
| ------- | - | - | - |
| 0       | 1 | 2 | 3 |
| 1       | 4 | 5 | 6 |

---

<h3 align="center"><b> ✅ 3. Multi-Dimensional Array </b></h3>

```
int[][][] cube = {
    {{1,2},{3,4},{5,6}},
    {{7,8},{9,10},{11,12}}
};
```

---

<h2 align="center"><b> 🔹 Array Indexing </b></h2>

* Index always starts from <b>0</b>

```
int[] numbers = {10, 20, 30, 40, 50};
int first = numbers[0];
```

---

<h2 align="center"><b> 🔹 Size of an Array </b></h2>

```
int[] arr = new int[10];
```

📌 Size <b>cannot be changed</b> after creation.

---

<h2 align="center"><b> 🔹 Accessing & Modifying Elements </b></h2>

```
numbers[2] = 35;
```

---

<h2 align="center"><b> 🔹 Array Length </b></h2>

```
int length = numbers.length;
```

---

<h2 align="center"><b> 🔹 Passing Arrays to Methods </b></h2>

* Arrays are passed by <b>value of reference</b>.

```
void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
}
```


