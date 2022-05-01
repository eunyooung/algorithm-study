package level1.로또의최고순위와최저순위;

import java.util.*;

public class Solution {
    
    public int[] solution(int[] lottos, int[] win_nums) {
        
        int matched = 0;
        for (int i : win_nums) {  // 일치하는 개수
            for (int j : lottos) {
                if (i == j) {
                    matched++;
                }
            }
        }
        int removed = 0;
        for (int i : lottos) if (i == 0) removed++;  // 낙서된 번호 개수
        
        int total = matched + removed;
        
        int min = 0, max = 0;
        if (matched == 0 && removed == 0) {
            min = 6; max = 6;
        } else {
            min = (6 - total + 1 > 6) ? 6 : (6 - total + 1);
            max = (6 - matched + 1 > 6) ? 6 : (6 - matched + 1); 
        }
        
        return new int[] {min, max};
    }
}