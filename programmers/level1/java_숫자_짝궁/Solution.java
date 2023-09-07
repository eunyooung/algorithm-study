package level1.java_숫자_짝궁;

import java.util.*;

class Solution {
    
    public String solution(String X, String Y) {
        
        Map<Integer, Integer> xMap = new HashMap<>();
        Map<Integer, Integer> yMap = new HashMap<>();
        
        for (int i = 0; i < X.length(); i++) {
            
            int num = X.charAt(i) - '0';
            xMap.put(num, xMap.getOrDefault(num, 0) + 1);
        }
        
        for (int i = 0; i < Y.length(); i++) {
            
            int num = Y.charAt(i) - '0';            
            yMap.put(num, yMap.getOrDefault(num, 0) + 1);
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 9; i >= 0; i--) {
            
            if(!(yMap.containsKey(i) && xMap.containsKey(i))) {
                continue;
            }
            
            int min = Math.min(xMap.get(i), yMap.get(i));
            
            for(int j = 0; j < min; j++) {
                sb.append(i);
            }
        }
        
        String answer = sb.toString();
        
        if (answer.isEmpty()) {
            return "-1";
        } else if (answer.startsWith("0")) {
            return "0";
        }
        return answer;
    }
}
