package level1.java_햄버거_만들기;

import java.util.*;

class Solution {
    
    public int solution(int[] ingredient) {
        
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int in : ingredient) {
            
            list.add(in);
            int n = list.size();
            
            if (list.size() >= 4) {
                if (list.get(n - 4) == 1 && list.get(n - 3) == 2 && list.get(n - 2) == 3 && list.get(n - 1) == 1) {
                    
                    for (int j = 0; j < 4; j++) {
                        list.remove(list.size() - 1);
                    }
                    
                    answer++;
                }
            }
            
        }
        
        return answer;
    }
}