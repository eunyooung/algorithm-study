package level1.java_대충_만든_자판;

import java.util.*;

class Solution {
    
    public int[] solution(String[] keymap, String[] targets) {
        
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();
        
        for (String s : keymap) {
            for (int i = 0; i < s.length(); i++) {
                
                char c = s.charAt(i);
                int min = Math.min(i + 1, map.getOrDefault(c, Integer.MAX_VALUE));
                map.put(c, min);
            }
        }
        
        for (int i = 0; i < targets.length; i++) {
            
            String s = targets[i];
            
            for (int j = 0; j < s.length(); j++) {
                
                char c = s.charAt(j);
                
                if (map.containsKey(c)) {
                    answer[i] += map.get(c);
                } else {
                    answer[i] = -1;
                    break;
                }
            }
            
        }
        
        return answer;
    }
}
