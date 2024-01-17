package level0.java_가까운_1_찾기;

class Solution {
    
    public int solution(int[] arr, int idx) {
        
        for (int i = idx; i < arr.length; i++) {
            
            if (arr[i] == 1) {
                return i;
            }
        }
        
        return -1;
    }
}
