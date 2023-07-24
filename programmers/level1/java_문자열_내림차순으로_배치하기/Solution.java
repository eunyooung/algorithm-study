package level1.java_문자열_내림차순으로_배치하기;

import java.util.*;

class Solution {
    
    public String solution(String s) {
        
        String answer = "";
        
        char[] lowers = s.replaceAll("[A-Z]", "").toCharArray();
        char[] uppers = s.replaceAll("[a-z]", "").toCharArray();
        Arrays.sort(lowers);
        Arrays.sort(uppers);
        
        for (int i = lowers.length - 1; i >= 0; i--) {
            answer += lowers[i];
        }
        
        for (int i = uppers.length - 1; i >= 0; i--) {
            answer += uppers[i];
        }
        
        return answer;
    }
}
