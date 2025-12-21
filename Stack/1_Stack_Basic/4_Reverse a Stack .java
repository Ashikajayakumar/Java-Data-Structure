                                  Reverse a Stack
You are given a stack st[]. You have to reverse the stack.

Examples:

Input: st[] = [1, 2, 3, 4]
Output: [1, 2, 3, 4]
Explanation: After reversing, the elements of stack are in opposite order.

Input: st[] = [3, 2, 1]
Output: [3, 2, 1]
Explanation: After reversing, the elements of stack are in opposite order.

Constraints:
1 ≤ st.size() ≤ 100
0 ≤ stack element ≤ 100

  import java.util.Stack;

public class ReverseStringWithStack {

    public static String reverse(String text) {
        char[] res = new char[text.length()];   // fixed missing parentheses
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < text.length(); i++) {
            st.push(text.charAt(i));
        }
        int pos = 0;  
        while (!st.isEmpty()) {
            res[pos++] = st.pop();
        }

        return new String(res);   
    }

    public static void main(String[] args) {
        String text = "Hello World";
        String reversed = reverse(text);
        System.out.println("Original: " + text);
        System.out.println("Reversed: " + reversed);
    }
}
