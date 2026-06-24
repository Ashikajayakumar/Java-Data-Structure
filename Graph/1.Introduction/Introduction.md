# Graph in DSA (Java) – Complete Interview Roadmap

Graphs are one of the most important topics in Data Structures and Algorithms. Companies like Amazon, Microsoft, Google, Adobe, Atlassian, Walmart, Goldman Sachs, and many product-based companies frequently ask graph problems.

---

# 1. What is a Graph?

A Graph is a collection of:

* **Vertices (Nodes)** → Entities
* **Edges** → Connections between entities

Example:

```text
A ----- B
|       |
|       |
C ----- D
```

Vertices = A, B, C, D

Edges = (A,B), (A,C), (B,D), (C,D)

---

# 2. Real-Time Applications

### Social Networks

```text
Person A ---- Person B
      |
      |
Person C
```

Facebook, LinkedIn

---

### Google Maps

Cities = Nodes

Roads = Edges

Shortest path → Dijkstra

---

### Computer Networks

Computers = Nodes

Connections = Edges

Routing = Graph Algorithm

---

# 3. Types of Graphs

## A. Undirected Graph

```text
1 ----- 2
|       |
3 ----- 4
```

Edge:

```java
1 -- 2
```

Both directions.

---

## B. Directed Graph (Digraph)

```text
1 → 2 → 3
```

Only one direction.

---

## C. Weighted Graph

```text
A --5-- B
 \      /
  2    1
   \  /
    C
```

Weight = Distance/Cost

---

## D. Unweighted Graph

All edges have equal weight.

---

## E. Cyclic Graph

```text
1 → 2 → 3
↑       ↓
← ← ← ←
```

Contains cycle.

---

## F. Acyclic Graph

```text
1 → 2 → 3 → 4
```

No cycle.

---

## G. DAG

Directed Acyclic Graph

```text
1 → 2
↓   ↓
3 → 4
```

Used in:

* Task Scheduling
* Build Systems
* Course Scheduling

---

# 4. Graph Representation

---

## A. Adjacency Matrix

```text
   0 1 2 3

0  0 1 1 0
1  1 0 1 0
2  1 1 0 1
3  0 0 1 0
```

Java:

```java
int[][] graph = {
    {0,1,1,0},
    {1,0,1,0},
    {1,1,0,1},
    {0,0,1,0}
};
```

### Complexity

| Operation  | Time  |
| ---------- | ----- |
| Check Edge | O(1)  |
| Space      | O(V²) |

---

## B. Adjacency List (Most Important)

```text
0 → 1,2
1 → 0,2
2 → 0,1,3
3 → 2
```

Java:

```java
List<List<Integer>> graph = new ArrayList<>();

for(int i=0;i<4;i++)
    graph.add(new ArrayList<>());

graph.get(0).add(1);
graph.get(0).add(2);

graph.get(1).add(0);
graph.get(1).add(2);

graph.get(2).add(0);
graph.get(2).add(1);
graph.get(2).add(3);

graph.get(3).add(2);
```

### Complexity

| Operation          | Time   |
| ------------------ | ------ |
| Traverse Neighbors | O(V+E) |
| Space              | O(V+E) |

---

# 5. Graph Traversal

---

## BFS (Breadth First Search)

Uses Queue.

```java
public void bfs(int start, List<List<Integer>> graph) {

    boolean[] visited = new boolean[graph.size()];

    Queue<Integer> q = new LinkedList<>();

    q.offer(start);
    visited[start] = true;

    while(!q.isEmpty()) {

        int node = q.poll();

        System.out.print(node + " ");

        for(int nbr : graph.get(node)) {

            if(!visited[nbr]) {
                visited[nbr] = true;
                q.offer(nbr);
            }
        }
    }
}
```

### Complexity

```text
O(V + E)
```

---

## DFS (Depth First Search)

Uses Recursion / Stack.

```java
public void dfs(int node,
                List<List<Integer>> graph,
                boolean[] visited) {

    visited[node] = true;

    System.out.print(node + " ");

    for(int nbr : graph.get(node)) {

        if(!visited[nbr]) {
            dfs(nbr, graph, visited);
        }
    }
}
```

### Complexity

```text
O(V + E)
```

---

# 6. Cycle Detection

---

## Undirected Graph

Using DFS + Parent

```java
boolean dfs(int node,
            int parent,
            boolean[] visited,
            List<List<Integer>> graph){

    visited[node] = true;

    for(int nbr : graph.get(node)){

        if(!visited[nbr]){

            if(dfs(nbr,node,visited,graph))
                return true;

        }else if(nbr != parent){
            return true;
        }
    }

    return false;
}
```

---

## Directed Graph

Using Recursion Stack

```java
boolean dfs(int node){

    visited[node] = true;
    pathVisited[node] = true;

    for(int nbr : graph.get(node)){

        if(!visited[nbr]){
            if(dfs(nbr))
                return true;
        }
        else if(pathVisited[nbr]){
            return true;
        }
    }

    pathVisited[node] = false;

    return false;
}
```

---

# 7. Topological Sort

For DAG only.

---

## DFS Approach

```java
Stack<Integer> st = new Stack<>();
```

Store nodes after processing.

Reverse order gives Topological Sort.

---

## Kahn's Algorithm (BFS)

Uses:

* Queue
* Indegree Array

```java
indegree[nbr]++;
```

Very frequently asked.

Problems:

* Course Schedule
* Course Schedule II

---

# 8. Shortest Path Algorithms

---

## A. BFS

For Unweighted Graph

```text
O(V + E)
```

---

## B. Dijkstra

For Positive Weights

Uses:

```java
PriorityQueue<Pair>
```

Complexity:

```text
O(E logV)
```

Problems:

* Network Delay Time
* Path with Minimum Effort

---

## C. Bellman Ford

Works with Negative Edges.

Detects Negative Cycles.

```text
O(VE)
```

---

## D. Floyd Warshall

All Pair Shortest Path

```text
O(V³)
```

---

# 9. Minimum Spanning Tree (MST)

---

## Prim's Algorithm

Uses:

```java
PriorityQueue
```

Complexity:

```text
O(E logV)
```

---

## Kruskal Algorithm

Uses:

* Sorting
* Union Find (DSU)

Complexity:

```text
O(E logE)
```

---

# 10. Disjoint Set Union (Union Find)

Very Important for Interviews.

Operations:

### Find

```java
find(x)
```

### Union

```java
union(x,y)
```

Path Compression:

```java
parent[x] = find(parent[x]);
```

Union by Rank.

Complexity:

```text
Almost O(1)
```

---

# 11. Advanced Graph Topics

### Bipartite Graph

* BFS Coloring
* DFS Coloring

Problems:

* Is Graph Bipartite?

---

### Strongly Connected Components

Algorithms:

* Kosaraju
* Tarjan

---

### Bridges

Critical Connections

Tarjan Algorithm

---

### Articulation Points

Critical Nodes

Tarjan Algorithm

---

# Graph Interview Roadmap (Order)

### Level 1 (Basics)

✅ Graph Representation
✅ BFS
✅ DFS
✅ Number of Provinces
✅ Flood Fill
✅ Number of Islands

---

### Level 2 (Intermediate)

✅ Cycle Detection Undirected
✅ Cycle Detection Directed
✅ Bipartite Graph
✅ Topological Sort
✅ Course Schedule

---

### Level 3 (Shortest Path)

✅ BFS Shortest Path
✅ Dijkstra
✅ Bellman Ford
✅ Floyd Warshall

---

### Level 4 (Advanced)

✅ Union Find (DSU)
✅ Kruskal MST
✅ Prim MST
✅ SCC (Kosaraju)
✅ Bridges
✅ Articulation Points

---

# Most Important LeetCode Graph Problems

### Easy

* 733 Flood Fill
* 200 Number of Islands
* 547 Number of Provinces
* 841 Keys and Rooms

### Medium

* 207 Course Schedule
* 210 Course Schedule II
* 785 Is Graph Bipartite
* 994 Rotting Oranges
* 1091 Shortest Path in Binary Matrix
* 542 01 Matrix

### Hard

* 684 Redundant Connection
* 685 Redundant Connection II
* 1584 Min Cost to Connect All Points
* 1192 Critical Connections in a Network
* 269 Alien Dictionary

For FAANG/Product-based interviews, the most important graph topics are:

**Graph Representation → BFS → DFS → Cycle Detection → Topological Sort → Shortest Path → Dijkstra → Union Find (DSU) → MST → SCC → Bridges & Articulation Points.**

After completing Trees and BSTs, Graphs are usually the next major DSA topic to master.
