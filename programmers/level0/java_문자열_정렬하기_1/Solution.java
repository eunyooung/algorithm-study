package level0.java_문자열_정렬하기_1;

import java.util.Arrays;

class Solution {
    
    public int[] solution(String my_string) {
        
        my_string = my_string.replaceAll("[a-zA-Z]", "");
        String[] arr = my_string.split("");
        
        int[]answer = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            
        	answer[i] = Integer.parseInt(arr[i]);
		}
        
        Arrays.sort(answer);
        
    	return answer;
    }
}
