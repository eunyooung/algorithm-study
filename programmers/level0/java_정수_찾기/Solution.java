package level0.java_정수_찾기;

class Solution {
    
    public int solution(int[] num_list, int n) {
        
        for (int num : num_list) {
            
            if (num == n) {
                return 1;
            }
        }
        return 0;
    }
}
