package level1.java_정수_내림차순으로_배치하기;

import java.util.*;

class Solution {
    
    public long solution(long n) {
        
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr, Collections.reverseOrder());
        String str = String.join("", arr);
        
        return Long.parseLong(str);
    }
}