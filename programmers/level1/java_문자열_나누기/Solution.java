package level1.java_문자열_나누기;

class Solution {
    
    public int solution(String s) {
        
        int answer = 0;
        int xCount = 0;
        int cCount = 0;
        char x = s.charAt(0);
        
        for (int i = 0; i < s.length(); i++) {
            
            if (xCount == cCount) {
                answer++;
                x = s.charAt(i);
            }
            
            if (x == s.charAt(i)) {
                xCount++;
            } else {
                cCount++;
            }
        }
        
        return answer;
    }
}
