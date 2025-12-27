                               3.Trapping Rain Water


🔷 Problem: Trapping Rain Water
📘 Problem Statement (Simple Words)

You are given an array of non-negative integers.
Each number represents the height of a bar
Each bar has width = 1
Bars are placed next to each other
After rainfall, water can be trapped between the bars.

height = [0,1,0,2,1,0,1,3,2,1,2,1]
index    0 1 2 3 4 5 6 7 8 9 10 11


3 |              █
2 |        █     █ █   █
1 |    █   █ █ █ █ █ █ █
0 |█   █ █ █ █ █ █ █ █ █ █
   --------------------------------
    0 1 2 3 4 5 6 7 8 9 10 11

2️⃣ LEFT MAX & RIGHT MAX VISUAL
 A.LEFT MAX

Highest bar seen from left → right

Index:   0 1 2 3 4 5 6 7 8 9 10 11
LeftMax: 0 1 1 2 2 2 2 3 3 3  3  3


B.RIGHT MAX
Highest bar seen from right → left

Index:    0 1 2 3 4 5 6 7 8 9 10 11
RightMax: 3 3 3 3 3 3 3 3 2 2  2  1

3️⃣ WATER LEVEL AT EACH INDEX

Water height = min(leftMax, rightMax)

Index:      0  1  2  3  4  5  6  7  8  9  10 11

LeftMax:    0  1  1  2  2  2  2  3  3  3   3   3
RightMax:   3  3  3  3  3  3  3  3  2  2   2   1
WaterLevel: 0  1  1  2  2  2  2  3  2  2   2   1

4️⃣ water height- height(i)

index        0  1  2  3  4  5  6  7  8  9  10  11
Water level  0  1  1  2  2  2  2  3  2  2   2   1
height =     0  1  0  2  1  0  1  3  2  1   2   1

result =     0  0  1  0  1  2  1  0  0  1   0   0
         = 1+1+2+1+1= 6


class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] left=new int[n];
        int[] right=new int[n];
        left[0]=height[0];
        for(int i=1;i<height.length;i++){
            left[i]=Math.max(left[i-1],height[i]);
        }
        right[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],height[i]);
        }
        int result=0;
        for(int i=0;i<n;i++){
            result+=Math.min(left[i],right[i])-height[i];
        }
        return result;
    }
}
