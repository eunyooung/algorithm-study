package level0.java_홀짝에_따라_다른_값_반환하기;

class Solution {
    
    public int solution(int n) {
        
        int answer = 0;
        
        if (n % 2 == 0) {
           
            for (int i = 1; i <= n; i++) {
                
                answer += i % 2 == 0 ? i * i : 0;
            }
            
        } else {
            
            for (int i = 1; i <= n; i++) {
                
                answer += i % 2 == 0 ? 0 : i;
            }
        }
        return answer;
    }
}
