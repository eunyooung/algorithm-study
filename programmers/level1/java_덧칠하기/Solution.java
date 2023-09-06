package level1.java_덧칠하기;

class Solution {
    
    public int solution(int n, int m, int[] section) {
        
        int answer = 1;
        int field = section[0];
        
        for (int wall : section) {
            
            if (wall >= field + m) {
                
                field = wall;
                answer++;
            }
        }
        
        return answer;
    }
}
