                                              Simplify Path

The rules of a Unix-style file system are as follows:

A single period '.' represents the current directory.
A double period '..' represents the previous/parent directory.
Multiple consecutive slashes such as '//' and '///' are treated as a single slash '/'.
Any sequence of periods that does not match the rules above should be treated as a valid directory or file name.
  For example, '...' and '....' are valid directory or file names.

/,//,///    -> Split
"","."      ->Ignore
"..","..."  -> pop the last element

  /a/./b/../../c/
 / -> split  String part=["", "a", ".", "b", "..", "..", "c", ""]
""    -> Ignore
"a"   -> st=[a]
"."   -> Ignore
"b"   -> st=[a,b]
".."  -> st.pop() ,st=[a]
".."  -> st.pop() ,st=[]
"c"   -> st=[c]
""    ->Ignore 

Output :  /c


  Java Implementation 
  
  class Solution {
    public String simplifyPath(String path) {
        Stack<String> st=new Stack<>();
        String[] part=path.split("/");
        for(int i=0;i<part.length;i++){
            String parts=part[i];
            if(parts.equals("")|| parts.equals(".")){
                continue;
            }else if(parts.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else{
                st.push(parts);
            }
        }
        StringBuilder res=new StringBuilder();
        for(int i=0;i<st.size();i++){
            res.append("/").append(st.get(i));
        }
        return res.length()==0 ? "/":res.toString();
    }
}
