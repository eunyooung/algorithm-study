package level0.java_두_수의_연산값_비교하기;

class Solution {
    
    public int solution(int a, int b) {
        
        int c = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int d = 2 * a * b;
        return Integer.max(c, d);
    }
}
