package level2.java_예상_대진표;

class Solution {
    
    public int solution(int n, int a, int b) {
        
        int answer = 0;
        
        while(a != b) {
            
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            
            answer++;
            
        }
        return answer;
    }
}
