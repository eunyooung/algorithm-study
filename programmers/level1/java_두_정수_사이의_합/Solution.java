package level1.java_두_정수_사이의_합;

class Solution {
    
    public long solution(int a, int b) {
        
        long min = Math.min(a, b);
        long max = Math.max(a, b);
        
        // 가우스의 정리
        return (min + max) * (Math.abs(max - min) + 1) / 2;
    }
}