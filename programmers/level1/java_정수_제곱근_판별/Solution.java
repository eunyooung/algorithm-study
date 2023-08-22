package level1.java_정수_제곱근_판별;

class Solution {
    
    public long solution(long n) {
        
        long x = (long)Math.sqrt(n);
        
        if (Math.pow(x, 2) == n) {
            
            return (long)Math.pow(x + 1, 2);
        }
        
        return -1;
    }
}
