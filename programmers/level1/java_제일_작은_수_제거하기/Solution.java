package level1.java_제일_작은_수_제거하기;

class Solution {
    
    public int[] solution(int[] arr) {
        
        if (arr.length == 1) {
            
            return new int[] {-1};
        }
        
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            
            min = Math.min(arr[i], min);
        }
        
        int[] answer = new int[arr.length - 1];
        int j = 0;
        
        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i] == min) {
                continue;
            }
            
            answer[j++] = arr[i];
        }
        
        return answer;
    }
}
