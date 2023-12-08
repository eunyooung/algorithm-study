package level0.java_첫_번째로_나오는_음수;

class Solution {
    
    public int solution(int[] num_list) {
        
        for (int i = 0; i < num_list.length; i++) {
            
            if (num_list[i] < 0) {
                
                return i;
            }
        }
        
        return -1;
    }
}
