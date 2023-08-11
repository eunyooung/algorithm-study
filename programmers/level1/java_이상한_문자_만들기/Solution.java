package level1.java_이상한_문자_만들기;

class Solution {
    
    public String solution(String s) {
        
        String answer = "";
        String[] arr = s.split("");
        
        int index = 0;
        for (String word : arr) {
            
            if (word.equals(" ")) {
                index = 0;
            } else {
                index++;
            }
            answer += index % 2 == 0 ? word.toLowerCase() : word.toUpperCase();
        }
        return answer;
    }
}
