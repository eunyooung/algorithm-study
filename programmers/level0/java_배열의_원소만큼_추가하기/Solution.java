package level0.java_배열의_원소만큼_추가하기;

import java.util.List;
import java.util.ArrayList;

class Solution {
    
    public int[] solution(int[] arr) {
        
        List<Integer> list = new ArrayList<>();
        
        for (int i : arr) {
            for (int j = 0; j < i; j++) {
                
                list.add(i);
            }
        }
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
