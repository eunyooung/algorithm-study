package level0.java_n보다_커질_때까지_더하기;

class Solution {
    
    public int solution(int[] numbers, int n) {
        
        int answer = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            
            if (answer > n) {
                return answer;
            }
            
            answer += numbers[i];
        }
        
        return answer;
    }
}
