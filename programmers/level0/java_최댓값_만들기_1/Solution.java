package level0.java_최댓값_만들기_1;

import java.util.*;

class Solution {
    
    public int solution(int[] numbers) {
        
        Arrays.sort(numbers);
        
        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
}
