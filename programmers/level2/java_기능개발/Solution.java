package level2.java_기능개발;

import java.util.*;

class Solution {
    
    public int[] solution(int[] progresses, int[] speeds) {
        
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            queue.add((int) Math.ceil((100.0 - progresses[i]) / speeds[i]));
        }
        
        List<Integer> list = new ArrayList<Integer>();
        
        while (!queue.isEmpty()) {
            int count = 0;
            int prev = queue.peek();
            
            while(!queue.isEmpty() && prev >= queue.peek()) {
                count++;
                queue.remove();
            }
            list.add(count);
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
