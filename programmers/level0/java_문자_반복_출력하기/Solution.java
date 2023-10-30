package level0.java_문자_반복_출력하기;

class Solution {
    
    public String solution(String my_string, int n) {
        
        String answer = "";
        
        for (int i = 0; i < my_string.length(); i++) {
            
            answer += String.valueOf(my_string.charAt(i)).repeat(n);
        }
        
        return answer;
    }
}
