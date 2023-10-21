package level0.java_짝수는_싫어요;

class Solution {
    
    public int[] solution(int n) {
        
        n = n % 2 == 0 ? n : n + 1;
        int[] answer = new int[n / 2];
        
        int index = 0;
        for (int i = 0; i < n; i++) {
            
            if (i % 2 != 0) {
                answer[index++] = i;
            }
        }
        
        return answer;
    }
}
