package level0.java_배열의_평균값;

class Solution {
    
    public double solution(int[] numbers) {
        
        double answer = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            
            answer += numbers[i];
        }
        return answer / numbers.length;
    }
}
