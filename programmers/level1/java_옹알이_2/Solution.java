package level1.java_옹알이_2;

class Solution {
    
    public int solution(String[] babbling) {
        
        int answer = 0;
        
        for (String word : babbling) {
            
            if (word.contains("ayaaya") || word.contains("yeye") || word.contains("woowoo") || word.contains("mama")) {
                continue;
            }
            
            word = word.replaceAll("aya|ye|woo|ma", "");
            
            if (word.isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}
