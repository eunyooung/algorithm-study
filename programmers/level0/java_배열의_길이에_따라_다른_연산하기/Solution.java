package level0.java_배열의_길이에_따라_다른_연산하기;

class Solution {
    
    public int[] solution(int[] arr, int n) {
        
        int size = arr.length;
        
        for (int i = 0; i < size; i++) {
            
            if (size % 2 != 0 && i % 2 == 0) {
                arr[i] += n;
                
            } else if (size % 2 == 0 && i % 2 != 0 ) {
                
                arr[i] += n;
            } else {
                
                arr[i] = arr[i];
            }
        }
        return arr;
    }
}
