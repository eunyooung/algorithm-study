package level2.java_문자열_압축;

class Solution {
    
    public int solution(String s) {
        
        int answer = s.length();
        
        for (int i = 1; i < s.length() / 2 + 1; i++) {
            int count = 1;
            String prevStr = s.substring(0, i);
            String finalStr = "";
            
            for (int j = i; j < s.length(); j += i) {
                if (j + i > s.length()) {
                    finalStr += count <= 1 ? prevStr : count + prevStr;
                    prevStr = s.substring(j);
                    count = 1;
                    break;
                }
                
                if (prevStr.equals(s.substring(j, j + i))) {
                    count++;
                } else {
                    finalStr += count <= 1 ? prevStr : count + prevStr;
                    prevStr = s.substring(j, j + i);
                    count = 1;
                }
            }
            
            finalStr += count <= 1 ? prevStr : count + prevStr;
            answer = answer > finalStr.length() ? finalStr.length() : answer;
        }
        
        return answer;
    }
}