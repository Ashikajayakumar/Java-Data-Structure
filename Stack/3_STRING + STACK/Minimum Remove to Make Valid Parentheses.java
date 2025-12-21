                                                    Minimum Remove to Make Valid Parentheses
Input: s = "a)b(c)d"
Output: "ab(c)d"


Java Implementation 

class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder st=new StringBuilder();
        int open=0;
        for(int i=0;i<s.length();i++){ // remove the invalid parentheses in forward
            char ch=s.charAt(i);
            if(ch=='('){
                open++;
                st.append(ch);
            }else if(ch==')'){
                if(open > 0){
                    open--;
                    st.append(ch);
                }

            }else{
                st.append(ch);
            }
        }
        StringBuilder res=new StringBuilder();
        for(int i=st.length()-1;i>=0;i--){  // remove the invalid parentheses in backward
            char ch=st.charAt(i);
            if(ch=='(' && open > 0){
                open--;
            }else{
                res.append(ch);
            }
        }
        return res.reverse().toString();
    }
}
