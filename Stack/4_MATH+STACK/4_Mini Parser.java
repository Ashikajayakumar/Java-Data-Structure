                                 Mini Parser

Example: "[123,[456,[789]]]"

Step 1: '['

        Create new list
        stack = [ [] ]

Step 2: '123'

      Build number → add to top list
      stack = [ [123] ]

Step 3: '['

      New list
      stack = [ [123], [] ]

Step 4: '456'
 
       Add to inner list
       stack = [ [123], [456] ]

Step 5: '['

      Another nested list
      stack = [ [123], [456], [] ]

Step 6: '789'

      Add
      stack = [ [123], [456], [789] ]

Step 7: ']'

    Close [789], attach to [456]
    stack = [ [123], [456, [789]] ]

Step 8: ']'

    Close [456,[789]], attach to [123]
    stack = [ [123, [456,[789]]] ]

✅ Final Output
[123,[456,[789]]]


  Java Implementation 
  
  public NestedInteger deserialize(String s) {
    if (s.isEmpty())
        return null;
    if (s.charAt(0) != '[') 
        return new NestedInteger(Integer.valueOf(s));
        
    Stack<NestedInteger> stack = new Stack<>();
    NestedInteger curr = null;
    int l = 0; 
    for (int r = 0; r < s.length(); r++) {
        char ch = s.charAt(r);
        if (ch == '[') {
            if (curr != null) {
                stack.push(curr);
            }
            curr = new NestedInteger();
            l = r+1;
        } else if (ch == ']') {
            String num = s.substring(l, r);
            if (!num.isEmpty())
                curr.add(new NestedInteger(Integer.valueOf(num)));
            if (!stack.isEmpty()) {
                NestedInteger pop = stack.pop();
                pop.add(curr);
                curr = pop;
            }
            l = r+1;
        } else if (ch == ',') {
            if (s.charAt(r-1) != ']') {
                String num = s.substring(l, r);
                curr.add(new NestedInteger(Integer.valueOf(num)));
            }
            l = r+1;
        }
    }
    
    return curr;
}
