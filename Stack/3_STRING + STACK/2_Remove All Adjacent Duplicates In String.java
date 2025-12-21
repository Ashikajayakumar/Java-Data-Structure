                                                 Remove All Adjacent Duplicates In String

You are given a string s consisting of lowercase English letters.
A duplicate removal consists of choosing two adjacent and equal letters and removing them.
We repeatedly make duplicate removals on s until we no longer can.
Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.

Example 1:

Input: s = "abbaca"
Output: "ca"

st=[a,b,b,a,c,a]   

It : 0
  st=[a]
It : 1
  st=[a,b]
It : 2
  st=[a,b,b]   remove dupliacte st=[a]
It : 3
  st=[a,a]    remove dupliacte st=[]
It : 4
  st=[c]
It : 5
  st=[c,a]

Java Implementation

class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c: s.toCharArray()){
            if(!stack.isEmpty() && stack.peek()==c){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char c: stack){
            sb.append(c);
        }
        return sb.toString();
    }
}






                                                   
