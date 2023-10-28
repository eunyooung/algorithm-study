package level0.java_중앙값_구하기;

import java.util.Arrays;

class Solution {
    
    public int solution(int[] array) {
                
        Arrays.sort(array);
        
        return array[array.length/2];
    }
}
