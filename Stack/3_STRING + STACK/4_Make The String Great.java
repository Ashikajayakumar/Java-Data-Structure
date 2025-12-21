                                           Make The String Great
Input: s = "abBAcC"
Output: ""


class Solution {
    public String makeGood(String s) {
        if(s.length()==0) return s;
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(char ch :s.toCharArray()){
            if(!st.isEmpty() && Math.abs(st.peek()-ch)==32){  #  Math.abs(st.peek()-ch)==32) (a-A)==32 
                st.pop();
                continue;
            }else{
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            sb.insert(0,st.pop());
        }
        return sb.toString();
    }
}
