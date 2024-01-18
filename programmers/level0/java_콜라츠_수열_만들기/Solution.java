package level0.java_콜라츠_수열_만들기;

import java.util.*;

class Solution {
    
    public int[] solution(int n) {
        
        List<Integer> answer = new ArrayList<Integer>();
        
        answer.add(n);
        
        while (n != 1) {
            
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            
            answer.add(n);
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
