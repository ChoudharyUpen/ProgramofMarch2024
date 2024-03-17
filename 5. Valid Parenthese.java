 Valid Parenthesis -------------
(Approach was to put parenthesis in a stack and check if they are already there 2 fuction  isOpening and isMatching are very important in this)
import java.util.Stack;

class Solution {
    public boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
            if (isOpening(cur)) {
                s.push(cur);
            } else {
                if (s.isEmpty()) {
                    return false;
                } else if (!(isMatching(s.peek(), cur))) {
                    return false;
                } else {
                    s.pop();
                }
            }
        }
        return s.isEmpty();
    }

    boolean isOpening(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    boolean isMatching(char a, char b) {
        return (a == '(' && b == ')')
                || (a == '{' && b == '}')
                || (a == '[' && b == ']');
    }
}


