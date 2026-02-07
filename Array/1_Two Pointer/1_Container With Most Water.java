                                                               Container With Most Water

                                                                 

Formula

Area = width × height
width  = right - left
height = min(height[left], height[right])


We use two pointers:

left → start (0)
right → end (n-1)

Move the pointer with smaller height.

Input
height = [1,8,6,2,5,4,8,3,7]
index  =  0 1 2 3 4 5 6 7 8

  ---------------------------------------------------------------------------------------------------------------------------------------------------------
Step-by-Step Iteration (0 → end)
  
Iteration 1:
height = [1,8,6,2,5,4,8,3,7]
index  =  0 1 2 3 4 5 6 7 8
          L               R
  
left = 0 (1)
right = 8 (7)

Area = width × height                                  = 8 × 1 = 8
width  = right - left                                  =  8 - 0 = 8
height = min(height[left], height[right])              =  min(1,7) = 1

maxArea =max(maxArea,Area)                             =max(0,8) =8
→ move left (smaller height)
------------------------------------------------------------------------------------------------------------------
Iteration 2:

height = [1,8,6,2,5,4,8,3,7]
index  =  0 1 2 3 4 5 6 7 8
            L             R
  
left = 1 (8)
right = 8 (7)

Area = width × height                       = 7 × 7 = 49
width  = right - left                       = 8 - 1 =7
height = min(height[left], height[right])   = min(8,7) = 7

maxArea =max(maxArea,Area)                 =max(8,49) =49
→ move right
 ---------------------------------------------------------------------------------------------------------------------------------------------------------
Iteration 3:

height = [1,8,6,2,5,4,8,3,7]
index  =  0 1 2 3 4 5 6 7 8
            L           R
  
left = 1 (8)
right = 7 (3)

Area = width × height                            = 6 * 3 = 18
width  = right - left                            = 7 -1 = 6
height = min(height[left], height[right])        = min(8,3) =3
  
maxArea =maxArea =max(maxArea,Area)             =max(49,18) =49
→ move right
 ---------------------------------------------------------------------------------------------------------------------------------------------------------
Iteration 4:

height = [1,8,6,2,5,4,8,3,7]
index  =  0 1 2 3 4 5 6 7 8
            L         R
  
left = 1 (8)
right = 6 (8)
.
Area = width × height                           = 5 * 8 =40
width  = right - left                           = 6 -1=5
height = min(height[left], height[right])       = min(8,8) =8

maxArea = max(maxArea,Area)                    = max(49 , 40)  = 49
→ move left OR right (equal heights)
 ---------------------------------------------------------------------------------------------------------------------------------------------------------
Iteration 5:

height = [1,8,6,2,5,4,8,3,7]
index  =  0 1 2 3 4 5 6 7 8
              L       R
  
left = 2 (6)
right = 6 (8)

Area = width × height                        = 4*6 = 24
width  = right - left                        = 6-2= 4
height = min(height[left], height[right])    =min(6,8) = 6

maxArea = max(maxArea,Area)                  =max(49,24)  =49
→ move left
 ---------------------------------------------------------------------------------------------------------------------------------------------------------
Iteration 6 :

height = [1,8,6,2,5,4,8,3,7]
index  =  0 1 2 3 4 5 6 7 8
                L     R
  
left = 3 (2)
right = 6 (8)
 
Area = width × height                       = 3*2 =6
width  = right - left                       = 6-3 =3
height = min(height[left], height[right])   =min(2,8)  =2
  
maxArea = max(maxArea,Area)                 =max(49,6) =49
→ move left
 ---------------------------------------------------------------------------------------------------------------------------------------------------------
Iteration 7 :

height = [1,8,6,2,5,4,8,3,7]
index  =  0 1 2 3 4 5 6 7 8
                  L   R
  
left = 4 (5)
right = 6 (8)

Area = width × height                             = 2 * 5 =10
width  = right - left                             = 6-4 =2
height = min(height[left], height[right])         = min(5,8)  =5
  
maxArea = max(maxArea,Area)                       =max(49,10) =49
→ move left
 ---------------------------------------------------------------------------------------------------------------------------------------------------------
Iteration 8 :

height = [1,8,6,2,5,4,8,3,7]
index  =  0 1 2 3 4 5 6 7 8
                    L R
  
left = 5 (4)
right = 6 (8)
Area = width × height                        = 1*4=4
width  = right - left                        = 6-5 =1
height = min(height[left], height[right])    = min(8,4) =4

maxArea = max(maxArea,Area)                  =max(49,4) =49     
→ move left
 ---------------------------------------------------------------------------------------------------------------------------------------------------------
Stop Condition
left == right → STOP

✅ Final Answer
Maximum Area = 49
 ---------------------------------------------------------------------------------------------------------------------------------------------------------

public class MaxAreaContainer {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int area = width * minHeight;
            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
