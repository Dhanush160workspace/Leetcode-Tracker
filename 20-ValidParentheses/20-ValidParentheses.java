// Last updated: 7/9/2026, 3:11:42 PM
class Solution {
    public boolean isValid(String S) {
        Stack<Character> stack = new Stack<>();
        for (char s:S.toCharArray()){
            if (s=='{'){
                stack.push('}');
            } else if (s=='('){
                stack.push(')');
            } else if (s=='['){
                stack.push(']');
            } else {
                if (stack.empty() || stack.pop() != s){
                    return false;
                }
            }
        }
        return stack.empty();
    }
}