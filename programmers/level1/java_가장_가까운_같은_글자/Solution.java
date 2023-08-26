package level1.java_가장_가까운_같은_글자;

import java.util.*;

class Solution {
    
    public int[] solution(String s) {
        
        Map<String, Integer> map = new HashMap<>();   
        int[] answer = new int[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            
            String chr = Character.toString(s.charAt(i));
            
            answer[i] = map.containsKey(chr) ? i - map.get(chr): -1;
            map.put(chr, i);
        }
        
        return answer;
    }
}
