package level2.java_괄호_회전하기;

import java.util.*;

class Solution {
    
    public Boolean checkBracket(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        for(int j = 0; j < s.length(); j++) {

            char c = s.charAt(j);
            
            if (stack.isEmpty() || c == '[' || c == '{' || c == '(') {
                stack.add(c);
                
            } else {
                
                char top = stack.peek();
                
                if ((c == ']' && top == '[') || (c == '}' && top == '{') || (c == ')' && top == '(')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
    
    public int solution(String s) {
        
        int answer = 0;
        
        for (int i = 0; i < s.length(); i++) {
            
            if (checkBracket(s)) {
                answer++;
            }
            s = s.substring(1) + s.charAt(0);
        }
        
        return answer;
    }
}
