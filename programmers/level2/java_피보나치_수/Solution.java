package level2.java_피보나치_수;

class Solution {
    
    public int solution(int n) {
        
        if (n == 0 || n == 1) {
            return 1;
        }
        
        int answer = 0;
        int a = 0;
        int b = 1;
        
        for (int i = 2; i <= n; i++) {
            // 1234567 로 나누어 int 범위 내의 값을 보장
            answer = (a + b) % 1234567;
            a = b;
            b = answer;
        }
        
        return   answer;
    }
}
