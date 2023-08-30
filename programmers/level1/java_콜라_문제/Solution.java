package level1.java_콜라_문제;

class Solution {
    
    public int solution(int a, int b, int n) {
        
        int answer = 0;
        
        while (n >= a) {
            
            int remain = n % a;
            int swapped = (n / a) * b;
            
            answer += swapped;
            n = swapped + remain;
        }
        
        return answer;
    }
}
