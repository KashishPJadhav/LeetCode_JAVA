import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            // Push opening brackets to the stack
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } 
            // Check closing brackets
            else {
                if (stack.isEmpty()) return false;
                
                char open = stack.pop();
                if ((ch == ')' && open != '(') ||
                    (ch == ']' && open != '[') ||
                    (ch == '}' && open != '{')) {
                    return false;
                }
            }
        }
        
        // If stack is empty, all brackets are valid and matched
        return stack.isEmpty();
    }
}
