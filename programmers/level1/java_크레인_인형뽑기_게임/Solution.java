package level1.java_크레인_인형뽑기_게임;

import java.util.*;

class Solution {
    
    public int solution(int[][] board, int[] moves) {
        
        int answer = 0;
        List<Integer> list = new ArrayList<Integer>();
        
        for (int j = 0; j < moves.length; j++) {
            
            for (int i = 0; i < board.length; i++) {
                
                int n = board[i][moves[j] - 1];
                
                if (n != 0) {
                    
                    board[i][moves[j]-1] = 0;
                    list.add(n);
                    
                    for (int k = 0; k < list.size()-1; k++) {
                        
                        if(list.get(k) == list.get(k+1)) {
                            
                            list.remove(k);
                            list.remove(k);
                            answer += 2;
                        }
                    }
                    break;
                }
            }
        }
        return answer;
    }
}
