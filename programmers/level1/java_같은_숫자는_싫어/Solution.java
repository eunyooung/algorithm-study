package level1.java_같은_숫자는_싫어;

import java.util.*;

public class Solution {
    
    public Stack<Integer> solution(int []arr) {
        
        Stack<Integer> answer = new Stack<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || answer.peek() != arr[i]) {
                answer.push(arr[i]);
            }
        }

        return answer;
    }
}