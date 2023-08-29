package level1.java_명예의_전당_1;

import java.util.*;

class Solution {
    
    public int[] solution(int k, int[] score) {
        
        int[] answer = new int[score.length];
        List<Integer> rank = new ArrayList<>();
        
        for (int i = 0; i < score.length; i++) {
            
            int num = score[i];
            
            if (i < k) {
                
                rank.add(num);
            } else {
                
                if (rank.get(0) < num) {
                    
                    rank.remove(0);
                    rank.add(num);
                }
            }
            
            Collections.sort(rank);
            answer[i] = rank.get(0);
        }
        return answer;
    }
}