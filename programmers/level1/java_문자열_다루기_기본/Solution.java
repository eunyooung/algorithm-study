package level1.java_문자열_다루기_기본;

class Solution {
    
    public boolean solution(String s) {
        
        s = s.replaceAll("[a-zA-Z]", "a");
        
        if (s.contains("a") || (s.length() != 4 && s.length() != 6)) {
            
            return false;
        }
                
        return true;
    }
}