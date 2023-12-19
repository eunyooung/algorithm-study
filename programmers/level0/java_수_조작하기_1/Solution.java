package level0.java_수_조작하기_1;

class Solution {
    
    public int solution(int n, String control) {
        
        for (int i = 0; i < control.length(); i++) {
            
            char c = control.charAt(i);
            
            if (c == 'w') n += 1;
            else if (c == 's') n -= 1;
            else if (c == 'd') n += 10;
            else if (c == 'a') n -= 10;
        }
        
        return n;
    }
}
