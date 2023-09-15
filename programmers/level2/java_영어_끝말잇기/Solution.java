package level2.java_영어_끝말잇기;

import java.util.*;

class Solution {

    public int[] solution(int n, String[] words) {
        
        int[] answer = new int[2];

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put(words[0], 0);
        
        for (int i = 1; i < words.length; i++) {
            
            String prevWord = words[i - 1];
            String curWord = words[i];
            
            if (map.containsKey(words[i]) || !curWord.startsWith(prevWord.substring(prevWord.length() - 1))) {
                
                answer[0] = i % n + 1;
                answer[1] = (i + n) / n;
                break;
            }
            
            map.put(curWord, i);
        }
        
        return answer;
    }
}
