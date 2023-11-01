package level0.java_숨어있는_숫자의_덧셈_1;

class Solution {
    
    public int solution(String my_string) {
        
        my_string = my_string.replaceAll("[a-zA-Z]", "");
        
        int answer = 0;
        for (int i = 0; i < my_string.length(); i++) {
            
            answer += Integer.valueOf(my_string.substring(i, i + 1));
        }
        
        return answer;
    }
}
