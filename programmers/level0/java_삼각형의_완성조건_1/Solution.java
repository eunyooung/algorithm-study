package level0.java_삼각형의_완성조건_1;

import java.util.Arrays;

class Solution {
    
    public int solution(int[] sides) {
        
        Arrays.sort(sides);
        
        return (sides[0] + sides[1]) > sides[2] ? 1 : 2;
    }
}
