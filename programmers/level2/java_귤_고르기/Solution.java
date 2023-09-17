package level2.java_귤_고르기;

import java.util.*;

class Solution {
    
    public int solution(int k, int[] tangerine) {
        
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
                
        for(int i : tangerine){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());
        
        for(Integer a : list) {
            
            if (k < 1) {
                break;
            }
            
            k -= a;
            answer++;
        }
        
        return answer;
    }
}
