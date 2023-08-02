package level1.java_가운데_글자_가져오기;

class Solution {
    
    public String solution(String s) {
        
        String[] answer = s.split("");
        int n = answer.length;
        
        return n % 2 == 0 ? answer[n/2 - 1] + answer[n/2] : answer[n/2];
    }
}
