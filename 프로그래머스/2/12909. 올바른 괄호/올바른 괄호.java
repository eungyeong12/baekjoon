import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(')
                stack.push(s.charAt(i));
            if(c == ')')
                if(stack.size() == 0) return false;
                else stack.pop();
        }
        
        if(stack.size() != 0) return false;
        return answer;
    }
}