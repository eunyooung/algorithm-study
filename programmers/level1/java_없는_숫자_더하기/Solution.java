package level1.java_없는_숫자_더하기;

class Solution {
    
    public int solution(int[] numbers) {
        
        int answer = 45;
        
        for (int i = 0; i < numbers.length; i++) {
            answer -= numbers[i];
        }
        
        return answer;
    }
}