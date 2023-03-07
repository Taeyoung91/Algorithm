import java.util.Stack;

/*
* 괄호 맞추기
 */
class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        char[] chars = s.toCharArray();

        for (char aChar : chars) {
            if (!stack.isEmpty() && stack.peek() == aChar) {
                stack.pop();
                continue;
            }

            if (aChar == '(') {
                stack.push(')');
            } else if (aChar == '{') {
                stack.push('}');
            } else if (aChar == '[') {
                stack.push(']');
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}