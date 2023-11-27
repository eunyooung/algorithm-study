package level0.java_카운트_다운;

class Solution {
    
    public int[] solution(int start, int end_num) {
        
        int size = start - end_num + 1;
        
        int[] answer = new int[size];
        
        for (int i = 0; i < size; i++) {
            
            answer[i] = start--;
        }
        
        return answer;
    }
}
