package level0.java_중복된_숫자_개수;

class Solution {
    
    public int solution(int[] array, int n) {
        
        int answer = 0;
        
        for (Integer num : array) {
            if (num == n) {
                answer++;
            }
        }
        
        return answer;
    }
}
