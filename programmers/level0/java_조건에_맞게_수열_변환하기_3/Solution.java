package level0.java_조건에_맞게_수열_변환하기_3;

class Solution {
    
    public int[] solution(int[] arr, int k) {
        
        for (int i = 0; i < arr.length; i++) {
            if (k % 2 == 0) {
                arr[i] += k;
            } else {
                arr[i] *= k;
            }
        }
        
        return arr;
    }
}
