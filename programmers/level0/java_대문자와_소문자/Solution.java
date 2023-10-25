package level0.java_대문자와_소문자;

class Solution {
    
    public String solution(String my_string) {
        
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            
            char chr = my_string.charAt(i);
            
            if (Character.isUpperCase(chr)) {
                answer += Character.toLowerCase(chr);
            } else {
                answer += Character.toUpperCase(chr);
            }
        }
        
        return answer;
    }
}
