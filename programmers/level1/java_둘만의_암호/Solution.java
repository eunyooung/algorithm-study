package level1.java_둘만의_암호;

class Solution {
     
    public String solution(String s, String skip, int index) {
        
        String answer = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        for (int i = 0; i < skip.length(); i++) {
            
            alphabet = alphabet.replace(Character.toString(skip.charAt(i)), "");
        }
        
        for (int i = 0; i < s.length(); i++) {
            
            int newIndex = alphabet.indexOf(Character.toString(s.charAt(i))) + index;
            char c = alphabet.charAt(newIndex % alphabet.length());
            answer += Character.toString(c);
        }
        
        return answer;
    }
}
