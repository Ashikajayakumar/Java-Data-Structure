                                      Decode String
 Countstack   -> store number '[ '
 stringStack  -> store previous string
 curr         -> store current string 
 num          -> current repeat count


                                        s = "3[a2[c]]"

                                        
🔹 Initial State (Before loop)
countStack = []
stringStack = []
curr = ""
num = 0
   --------------------------------------------------------------------------------------

🔹 Iteration 0:               Character '3'
                                                                     
    if(Charcter.isDigit(ch)) {                                      #num = 3
           num = num * 10 + (ch - '0');                             #curr = ""
                                                                    #countStack = []
  }                                                                 #stringStack = []


 --------------------------------------------------------------------------------------
  
🔹Iteration  1:             Character '['

countStack.push(num);                                                  #countstack=[3]
stringStack.push(curr);                                                #stringstack=[""]  
num = 0;                                                               #num=0
curr = new StringBuilder();                                            #curr=""

 --------------------------------------------------------------------------------------
  
🔹 Iteration 2:              Character 'a'
  
curr.append(ch);                                                       #curr='a'

   --------------------------------------------------------------------------------------

🔹 Iteration 3:           Character '2'
  
    if(Charcter.isDigit(ch)) {                                      #num = 2
           num = num * 10 + (ch - '0');                             #curr = "a"
                                                                    #countStack = [3]
  }                                                                 #stringStack = []

 --------------------------------------------------------------------------------------
  
🔹 Iteration 4:           Character '['

countStack.push(num);                                             #countstack=[3,2]
stringStack.push(curr);                                           #stringstack["","a"]
num = 0;                                                          #num=0
curr = new StringBuilder();                                       #curr=""

 --------------------------------------------------------------------------------------

🔹 Iteration 5:           Character 'c'

curr.append(ch);                                               #curr="c"

 --------------------------------------------------------------------------------------
  

🔹 Iteration 6 :          Character ']' (INNER BRACKET)

  
int repeat = countStack.pop();                                   #repeat = 2
StringBuilder prev = stringStack.pop();                          #prev= a

for (int i = 0; i < repeat; i++) {                              # loop will be iterative 0 to 1   curr="c"  so cc stores in prev
    prev.append(curr);                                          # prev = acc
}
curr=prev;                                                      # curr= acc
   --------------------------------------------------------------------------------------
                              

 🔹 Iteration 7 :           Character ']' (INNER BRACKET)

  
int repeat = countStack.pop();                                   #repeat = 3
StringBuilder prev = stringStack.pop();                          #prev=  acc

for (int i = 0; i < repeat; i++) {                              # loop will be iterative 0 to 2  curr="acc"  so accacc stores in prev
    prev.append(curr);                                          # prev = accaccacc
}
                              
            --------------------------------------------------------------------------------------
                              

🔹 End of Loop

return curr.toString();                                          "accaccacc"
  
 --------------------------------------------------------------------------------------

  

📊 FINAL STACK VIEW
countStack   = []
stringStack  = []
curr         = "accaccacc"


  class Solution {
    public String decodeString(String s) {
        Stack<Integer>count=new Stack<>();
        Stack<StringBuilder> strst=new Stack<>();
        int num=0;
        StringBuilder curr=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }else if(ch=='['){
                count.push(num);
                strst.push(curr);
                num=0;
                curr=new StringBuilder();
            }else if(ch==']'){
                int r=count.pop();
                StringBuilder prev=strst.pop();
                for(int i=0;i<r;i++){
                    prev.append(curr);
                }
                curr=prev;
            }else{
                curr.append(ch);
            }
        }
        return curr.toString();
    }
}
