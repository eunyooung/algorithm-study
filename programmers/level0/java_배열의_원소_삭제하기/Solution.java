package level0.java_배열의_원소_삭제하기;

import java.util.*;

class Solution {
    
    public List<Integer> solution(int[] arr, int[] delete_list) {
        
        List<Integer> answer = new ArrayList<>();
        
        for (int num : arr) {
            answer.add(num);
        }
        
        for (int num : delete_list) {
            
            int index = answer.indexOf(num);
            if (index != -1) {
                answer.remove(index);
            }
        }
        
        return answer;
    }
}
