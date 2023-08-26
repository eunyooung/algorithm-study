package level1.java_약수의_개수와_덧셈;

class Solution {
    
    public int solution(int left, int right) {
        
        int answer = 0;
        
        for (int i = left; i <= right; i++) {
            
            // 약수가 홀수인 경우는 제곱 수 일 경우
            answer = Math.sqrt(i) % 1 == 0.0 ? answer - i : answer + i;
        }
        return answer;
    }
}
